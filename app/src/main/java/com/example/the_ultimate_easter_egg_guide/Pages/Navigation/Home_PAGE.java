package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.splashscreen.SplashScreen;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Pages.MapDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.R;

public class Home_PAGE extends NavPageController_BaseClass {

    private VideoView homeVideoView;
    private TextView txtResumeSubtitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        setupBaseNavigation();
        setupHomeVideo();
        setupDashboardActions();
        requestNotificationPermission();
    }

    private void requestNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.POST_NOTIFICATIONS}, 101);
            }
        }
    }

    private void setupHomeVideo() {
        homeVideoView = findViewById(R.id.home_video_view);
        
        String path = "android.resource://" + getPackageName() + "/" + R.raw.home_trailer;
        homeVideoView.setVideoURI(Uri.parse(path));
        
        homeVideoView.setOnPreparedListener(mp -> {
            mp.setLooping(true);
            mp.setVolume(0f, 0f); // Mute the video
            
            // Cinematic Scaling (Center Crop)
            float videoWidth = mp.getVideoWidth();
            float videoHeight = mp.getVideoHeight();
            float videoAspectRatio = videoWidth / videoHeight;

            float viewWidth = homeVideoView.getWidth();
            float viewHeight = homeVideoView.getHeight();
            float viewAspectRatio = viewWidth / viewHeight;

            if (videoAspectRatio > viewAspectRatio) {
                homeVideoView.setScaleX(videoAspectRatio / viewAspectRatio);
            } else {
                homeVideoView.setScaleY(viewAspectRatio / viewAspectRatio);
            }
            
            homeVideoView.start();
        });
    }

    private void setupDashboardActions() {
        txtResumeSubtitle = findViewById(R.id.txt_resume_subtitle);

        // Button 1: Resume Guide
        findViewById(R.id.button1).setOnClickListener(v -> resumeLastMap());

        // Buttons 2, 3, 4 have no function as requested.
    }

    private void resumeLastMap() {
        String lastMapId = getSharedPreferences(PREFS_NAME, MODE_PRIVATE)
                .getString(KEY_LAST_MAP_ID, null);

        if (lastMapId != null) {
            Intent intent = new Intent(this, MapDisplay_Page.class);
            intent.putExtra("MAP_ID", lastMapId);
            PageTransitionManager.startActivityWithFade(this, intent);
        } else {
            // If no map, go to Maps Selection
            PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
        }
    }

    private void updateResumeSubtitle() {
        String lastMapId = getSharedPreferences(PREFS_NAME, MODE_PRIVATE)
                .getString(KEY_LAST_MAP_ID, null);

        if (lastMapId != null) {
            try {
                Maps map = Maps.valueOf(lastMapId);
                txtResumeSubtitle.setText(map.mapName);
            } catch (Exception e) {
                txtResumeSubtitle.setText("None");
            }
        } else {
            txtResumeSubtitle.setText("None");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (homeVideoView != null && homeVideoView.isPlaying()) {
            homeVideoView.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isUnderConstructionEnabled) return;
        
        if (homeVideoView != null) {
            homeVideoView.start();
        }
        updateResumeSubtitle();
    }

    @Override
    public void onHomeButtonClick(View view) {
        // Already on home
    }
}
