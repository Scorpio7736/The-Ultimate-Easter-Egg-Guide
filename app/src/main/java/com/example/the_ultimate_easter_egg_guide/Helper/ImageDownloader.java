package com.example.the_ultimate_easter_egg_guide.Helper;

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

public class ImageDownloader
{

    private static final ExecutorService executor =
            Executors.newSingleThreadExecutor();

    public interface DownloadCallback {
        void onComplete(File imageFile, boolean wasDownloaded);
        void onError(Exception exception);
    }

    /**
     * Downloads an image only when an image with the specified name
     * does not already exist.
     *
     * @param context  Android context
     * @param imageUrl Direct image URL
     * @param name     Name used for the saved image, such as "tank_dempsey"
     * @param callback Result callback
     */
    public static void saveImageIfMissing(
            Context context,
            String imageUrl,
            String name,
            DownloadCallback callback
    ) {
        executor.execute(() -> {
            HttpURLConnection connection = null;

            try {
                File imageDirectory =
                        new File(context.getFilesDir(), "downloaded_images");

                if (!imageDirectory.exists() && !imageDirectory.mkdirs()) {
                    throw new IllegalStateException(
                            "Could not create image directory."
                    );
                }

                String safeName = sanitizeFileName(name);
                String extension = getImageExtension(imageUrl);

                // Avoid adding the extension twice.
                if (!safeName.toLowerCase(Locale.US).endsWith(extension)) {
                    safeName += extension;
                }

                File imageFile = new File(imageDirectory, safeName);

                // The image already exists, so do not download it again.
                if (imageFile.exists() && imageFile.length() > 0) {
                    sendSuccess(callback, imageFile, false);
                    return;
                }

                URL url = new URL(imageUrl);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(15_000);
                connection.setReadTimeout(20_000);
                connection.setInstanceFollowRedirects(true);
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode < 200 || responseCode >= 300) {
                    throw new IllegalStateException(
                            "Image download failed. HTTP response: "
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
                } catch (Exception exception) {
                    // Remove an incomplete file if the download fails.
                    if (imageFile.exists()) {
                        imageFile.delete();
                    }

                    throw exception;
                }

                sendSuccess(callback, imageFile, true);

            } catch (Exception exception) {
                sendError(callback, exception);
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        });
    }

    private static String sanitizeFileName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "downloaded_image";
        }

        return name.trim()
                .replaceAll("[^a-zA-Z0-9._-]", "_");
    }

    private static String getImageExtension(String imageUrl) {
        Pattern pattern = Pattern.compile(
                "\\.(png|jpg|jpeg|webp|gif)",
                Pattern.CASE_INSENSITIVE
        );

        Matcher matcher = pattern.matcher(imageUrl);

        if (matcher.find()) {
            String extension = matcher.group(1).toLowerCase(Locale.US);

            if (extension.equals("jpeg")) {
                extension = "jpg";
            }

            return "." + extension;
        }

        return ".png";
    }

    private static void sendSuccess(
            DownloadCallback callback,
            File imageFile,
            boolean wasDownloaded
    ) {
        if (callback == null) {
            return;
        }

        new Handler(Looper.getMainLooper()).post(
                () -> callback.onComplete(imageFile, wasDownloaded)
        );
    }

    private static void sendError(
            DownloadCallback callback,
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
