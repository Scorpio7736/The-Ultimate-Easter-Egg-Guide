package com.example.the_ultimate_easter_egg_guide.API.Fandom_API;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class FandomImage_API {

    private static final ExecutorService executor =
            Executors.newSingleThreadExecutor();

    private static final String IMAGE_DIRECTORY = "fandom_images";

    private FandomImage_API() {
        // Prevent this utility class from being instantiated.
    }

    public interface ImageDownloadCallback {

        /**
         * Called when the operation finishes successfully.
         *
         * @param imageFile    The existing or newly downloaded image file.
         * @param downloaded   True if the image was downloaded during this call.
         */
        void onComplete(File imageFile, boolean downloaded);

        /**
         * Called when the image could not be downloaded or saved.
         */
        void onError(Exception exception);
    }

    /**
     * Saves a Fandom image if an image with the provided name
     * does not already exist.
     *
     * @param context   Android context.
     * @param imageUrl  Direct Fandom image URL.
     * @param imageName Name used for the saved image.
     * @param callback  Callback for the result.
     */
    public static void saveImageIfMissing(
            Context context,
            String imageUrl,
            String imageName,
            ImageDownloadCallback callback
    ) {
        executor.execute(() -> {
            HttpURLConnection connection = null;
            File imageFile = null;

            try {
                validateArguments(context, imageUrl, imageName);

                File imageDirectory =
                        new File(context.getFilesDir(), IMAGE_DIRECTORY);

                if (!imageDirectory.exists() && !imageDirectory.mkdirs()) {
                    throw new IllegalStateException(
                            "Could not create Fandom image directory."
                    );
                }

                String safeImageName = sanitizeFileName(imageName);
                String extension = getImageExtension(imageUrl);

                if (!hasImageExtension(safeImageName)) {
                    safeImageName += extension;
                }

                imageFile = new File(imageDirectory, safeImageName);

                /*
                 * Do not download the image again when a valid file
                 * with the requested name already exists.
                 */
                if (imageFile.exists() && imageFile.length() > 0) {
                    postSuccess(callback, imageFile, false);
                    return;
                }

                URL url = new URL(imageUrl);

                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(15_000);
                connection.setReadTimeout(20_000);
                connection.setInstanceFollowRedirects(true);

                /*
                 * Some image hosts may reject requests without
                 * a recognizable user agent.
                 */
                connection.setRequestProperty(
                        "User-Agent",
                        "Mozilla/5.0 Android FandomImage_API"
                );

                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode < 200 || responseCode >= 300) {
                    throw new IllegalStateException(
                            "Image download failed with HTTP status "
                                    + responseCode
                    );
                }

                try (
                        InputStream inputStream = connection.getInputStream();
                        FileOutputStream outputStream =
                                new FileOutputStream(imageFile)
                ) {
                    byte[] buffer = new byte[8192];
                    int bytesRead;

                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }

                    outputStream.flush();
                }

                if (!imageFile.exists() || imageFile.length() == 0) {
                    throw new IllegalStateException(
                            "The downloaded image file is empty."
                    );
                }

                postSuccess(callback, imageFile, true);

            } catch (Exception exception) {
                /*
                 * Remove incomplete files so a later request can
                 * attempt the download again.
                 */
                if (imageFile != null
                        && imageFile.exists()
                        && imageFile.length() == 0) {

                    imageFile.delete();
                }

                postError(callback, exception);

            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        });
    }

    /**
     * Returns an image that has already been saved.
     *
     * @return The image file, or null if it does not exist.
     */
    public static File getSavedImage(
            Context context,
            String imageName
    ) {
        if (context == null || imageName == null || imageName.trim().isEmpty()) {
            return null;
        }

        File imageDirectory =
                new File(context.getFilesDir(), IMAGE_DIRECTORY);

        if (!imageDirectory.exists()) {
            return null;
        }

        String safeName = sanitizeFileName(imageName);

        File exactFile = new File(imageDirectory, safeName);

        if (exactFile.exists() && exactFile.length() > 0) {
            return exactFile;
        }

        String[] extensions = {
                ".png",
                ".jpg",
                ".jpeg",
                ".webp",
                ".gif"
        };

        for (String extension : extensions) {
            File possibleFile =
                    new File(imageDirectory, safeName + extension);

            if (possibleFile.exists() && possibleFile.length() > 0) {
                return possibleFile;
            }
        }

        return null;
    }

    /**
     * Checks whether an image with the provided name has already been saved.
     */
    public static boolean imageExists(
            Context context,
            String imageName
    ) {
        return getSavedImage(context, imageName) != null;
    }

    /**
     * Deletes a previously downloaded image.
     *
     * @return True if the image was deleted.
     */
    public static boolean deleteImage(
            Context context,
            String imageName
    ) {
        File imageFile = getSavedImage(context, imageName);

        return imageFile != null && imageFile.delete();
    }

    private static void validateArguments(
            Context context,
            String imageUrl,
            String imageName
    ) {
        if (context == null) {
            throw new IllegalArgumentException(
                    "Context cannot be null."
            );
        }

        if (imageUrl == null || imageUrl.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Image URL cannot be empty."
            );
        }

        if (imageName == null || imageName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Image name cannot be empty."
            );
        }
    }

    private static String sanitizeFileName(String imageName) {
        return imageName
                .trim()
                .replaceAll("[^a-zA-Z0-9._-]", "_");
    }

    private static boolean hasImageExtension(String fileName) {
        String lowerCaseName =
                fileName.toLowerCase(Locale.US);

        return lowerCaseName.endsWith(".png")
                || lowerCaseName.endsWith(".jpg")
                || lowerCaseName.endsWith(".jpeg")
                || lowerCaseName.endsWith(".webp")
                || lowerCaseName.endsWith(".gif");
    }

    private static String getImageExtension(String imageUrl) {
        Pattern extensionPattern = Pattern.compile(
                "\\.(png|jpg|jpeg|webp|gif)",
                Pattern.CASE_INSENSITIVE
        );

        Matcher matcher = extensionPattern.matcher(imageUrl);

        if (matcher.find()) {
            String extension =
                    matcher.group(1).toLowerCase(Locale.US);

            if (extension.equals("jpeg")) {
                extension = "jpg";
            }

            return "." + extension;
        }

        return ".png";
    }

    private static void postSuccess(
            ImageDownloadCallback callback,
            File imageFile,
            boolean downloaded
    ) {
        if (callback == null) {
            return;
        }

        new Handler(Looper.getMainLooper()).post(
                () -> callback.onComplete(imageFile, downloaded)
        );
    }

    private static void postError(
            ImageDownloadCallback callback,
            Exception exception
    ) {
        if (callback == null) {
            return;
        }

        new Handler(Looper.getMainLooper()).post(
                () -> callback.onError(exception)
        );
    }
}
