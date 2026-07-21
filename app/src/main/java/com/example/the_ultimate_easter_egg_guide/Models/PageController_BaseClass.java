package com.example.the_ultimate_easter_egg_guide.Models;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.card.MaterialCardView;

public abstract class PageController_BaseClass extends AppCompatActivity {
    
    // Ensure this is false for production
    public static final boolean ENABLE_TESTING = false;
    protected boolean isUnderConstructionEnabled = false;
    protected boolean isExcludedFromDevMode = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
    protected void SetThisBackground(int imageID) {
        ImageView background = findViewById(R.id.background_image);
        if (background != null) {
            background.setImageResource(imageID);
        }
    }

    protected void excludeFromDevMode() {
        isExcludedFromDevMode = true;
    }

    protected void enableConstructionBlur() {
        if (ENABLE_TESTING && !isExcludedFromDevMode) return;
        isUnderConstructionEnabled = true;

        ViewGroup rootView = findViewById(android.R.id.content);
        if (rootView == null) return;

        // Apply Blur to existing content (API 31+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && rootView.getChildCount() > 0) {
            rootView.getChildAt(0).setRenderEffect(RenderEffect.createBlurEffect(20f, 20f, Shader.TileMode.CLAMP));
        }

        // Create overlay container to block clicks
        FrameLayout overlay = new FrameLayout(this);
        overlay.setLayoutParams(new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        
        // Block all interactions
        overlay.setClickable(true);
        overlay.setFocusable(true);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) {
            // Fallback: Dim the background for older versions
            overlay.setBackgroundColor(0x99000000); 
        }

        // Create the "Video Box"
        MaterialCardView videoBox = new MaterialCardView(this);
        int boxSize = (int) (300 * getResources().getDisplayMetrics().density);
        FrameLayout.LayoutParams boxParams = new FrameLayout.LayoutParams(boxSize, boxSize);
        boxParams.gravity = Gravity.CENTER;
        videoBox.setLayoutParams(boxParams);
        videoBox.setRadius(24 * getResources().getDisplayMetrics().density);
        videoBox.setCardElevation(16 * getResources().getDisplayMetrics().density);
        videoBox.setStrokeColor(0x44FFFFFF);
        videoBox.setStrokeWidth((int) (2 * getResources().getDisplayMetrics().density));

        VideoView constructionVideo = new VideoView(this);
        FrameLayout.LayoutParams videoParams = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        constructionVideo.setLayoutParams(videoParams);
        
        String path = "android.resource://" + getPackageName() + "/" + R.raw.under_construction;
        constructionVideo.setVideoURI(Uri.parse(path));
        
        constructionVideo.setOnPreparedListener(mp -> {
            mp.setLooping(true);
            mp.setVolume(0, 0); // Muted
            constructionVideo.start();

            // Resizing logic to fit video aspect ratio perfectly
            int videoWidth = mp.getVideoWidth();
            int videoHeight = mp.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                float aspectRatio = (float) videoWidth / videoHeight;

                int screenWidth = getResources().getDisplayMetrics().widthPixels;
                int targetWidth = (int) (screenWidth * 0.85f); // 80% of screen width
                int targetHeight = (int) (targetWidth / aspectRatio);

                ViewGroup.LayoutParams boxParamsUpdated = videoBox.getLayoutParams();
                boxParamsUpdated.width = targetWidth;
                boxParamsUpdated.height = targetHeight;
                videoBox.setLayoutParams(boxParamsUpdated);
            }
        });
        
        videoBox.addView(constructionVideo);
        overlay.addView(videoBox);
        rootView.addView(overlay);
    }

}
