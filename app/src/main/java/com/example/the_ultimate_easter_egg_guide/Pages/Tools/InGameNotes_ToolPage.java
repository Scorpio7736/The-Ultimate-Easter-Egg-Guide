package com.example.the_ultimate_easter_egg_guide.Pages.Tools;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Helper.NoteImageAdapter;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class InGameNotes_ToolPage extends PageController_BaseClass implements NoteImageAdapter.OnImageClickListener {

    private EditText notesEditText;
    private RecyclerView recyclerView;
    private NoteImageAdapter adapter;
    private String currentPhotoPath;
    
    // Simple session persistence (cleared on app exit, stays during activity lifecycle)
    private static String sessionNotes = "";
    private static final List<String> sessionImages = new ArrayList<>();

    private final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
                if (isGranted) {
                    dispatchTakePictureIntent();
                } else {
                    Toast.makeText(this, "Camera permission required to take notes.", Toast.LENGTH_SHORT).show();
                }
            });

    private final ActivityResultLauncher<Uri> takePictureLauncher =
            registerForActivityResult(new ActivityResultContracts.TakePicture(), success -> {
                if (success) {
                    if (currentPhotoPath != null) {
                        sessionImages.add(0, currentPhotoPath);
                        adapter.addImage(currentPhotoPath);
                    }
                }
            });

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_game_notes_tool_page);

        notesEditText = findViewById(R.id.notes_edit_text);
        recyclerView = findViewById(R.id.notes_recycler_view);
        
        // Restore session notes
        notesEditText.setText(sessionNotes);
        //enableConstructionBlur();

        // Setup Grid
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        adapter = new NoteImageAdapter(this);
        adapter.setImagePaths(sessionImages);
        recyclerView.setAdapter(adapter);

        findViewById(R.id.take_picture_button).setOnClickListener(v -> checkPermissionAndTakePic());
    }

    private void checkPermissionAndTakePic() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            dispatchTakePictureIntent();
        } else {
            requestPermissionLauncher.launch(Manifest.permission.CAMERA);
        }
    }

    private void dispatchTakePictureIntent() {
        File photoFile = null;
        try {
            photoFile = createImageFile();
        } catch (IOException ex) {
            Toast.makeText(this, "Error creating file", Toast.LENGTH_SHORT).show();
        }

        if (photoFile != null) {
            Uri photoURI = FileProvider.getUriForFile(this,
                    getPackageName() + ".fileprovider",
                    photoFile);
            takePictureLauncher.launch(photoURI);
        }
    }

    private File createImageFile() throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = getExternalCacheDir(); // Store in cache so it's private and temporary
        File image = File.createTempFile(imageFileName, ".jpg", storageDir);
        currentPhotoPath = image.getAbsolutePath();
        return image;
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Save text to session
        sessionNotes = notesEditText.getText().toString();
    }

    @Override
    public void onImageClick(String path) {
        showImagePopup(path);
    }

    private void showImagePopup(String path) {
        AppCompatDialog dialog = new AppCompatDialog(this, R.style.FullScreenDialog);
        dialog.setContentView(R.layout.dialog_video_player); // Reuse the player dialog for its structure

        // Modify the layout for image viewing
        dialog.findViewById(R.id.dialog_video_view).setVisibility(View.GONE);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.MATCH_PARENT,
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.MATCH_PARENT));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        
        Uri uri = Uri.fromFile(new File(path));
        imageView.setImageURI(uri);

        // Inject into dialog (assuming standard structure of dialog_video_player)
        View closeBtn = dialog.findViewById(R.id.close_button);
        if (closeBtn != null) {
            android.view.ViewParent parent = closeBtn.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).addView(imageView, 0);
            }
            closeBtn.setOnClickListener(v -> dialog.dismiss());
        }

        dialog.show();
    }
    
    /**
     * Call this when the user finishes their session to clear data.
     * For now, it stays until the process dies.
     */
    public static void clearSession() {
        sessionNotes = "";
        sessionImages.clear();
    }
}
