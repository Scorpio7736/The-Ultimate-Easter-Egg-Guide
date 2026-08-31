package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.splashscreen.SplashScreen;

import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

public class Home_PAGE extends NavPageController_BaseClass {

    private VideoView homeVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        setupBaseNavigation();
        setupHomeVideo();
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
            
            // Scaling logic to "center crop" the video so it fills the slot
            float videoWidth = mp.getVideoWidth();
            float videoHeight = mp.getVideoHeight();
            float videoAspectRatio = videoWidth / videoHeight;

            float viewWidth = homeVideoView.getWidth();
            float viewHeight = homeVideoView.getHeight();
            float viewAspectRatio = viewWidth / viewHeight;

            if (videoAspectRatio > viewAspectRatio) {
                homeVideoView.setScaleX(videoAspectRatio / viewAspectRatio);
            } else {
                homeVideoView.setScaleY(viewAspectRatio / videoAspectRatio);
            }
            
            homeVideoView.start();
        });
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
    }

    @Override
    public void onHomeButtonClick(View view) {
        // Already on the home page, no action needed
    }
}