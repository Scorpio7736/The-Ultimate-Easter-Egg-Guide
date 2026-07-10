package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.ImageID;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class Home_PAGE extends AppCompatActivity {

    private ImageView slideshowImage;
    private final List<Integer> slideshowImages = new ArrayList<>();
    private int currentImageIndex = 0;
    
    private final Handler sliderHandler = new Handler(Looper.getMainLooper());
    private final Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            transitionToNextImage();
            sliderHandler.postDelayed(this, 4000); // Trigger transition every 4 seconds
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        SplashScreen.installSplashScreen(this);
        setContentView(R.layout.home_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setupSlideshow();

        ImageButton settingsButton = findViewById(R.id.nav_settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageTransitionManager.startActivityWithFade(Home_PAGE.this, Settings_PAGE.class);
            }
        });
    }

    private void setupSlideshow() {
        slideshowImage = findViewById(R.id.slideshow_image);

        // Populate slideshow with all map covers
        for (ImageID id : MapsWarehouse.All_Images) {
            slideshowImages.add(id.GetImageID());
        }

        if (!slideshowImages.isEmpty()) {
            slideshowImage.setImageResource(slideshowImages.get(0));
            sliderHandler.postDelayed(sliderRunnable, 4000);
        }
    }

    private void transitionToNextImage() {
        // Fade out to black (background of container)
        slideshowImage.animate()
            .alpha(0f)
            .setDuration(500)
            .withEndAction(() -> {
                // Change image while invisible
                currentImageIndex = (currentImageIndex + 1) % slideshowImages.size();
                slideshowImage.setImageResource(slideshowImages.get(currentImageIndex));
                
                // Fade back in
                slideshowImage.animate()
                    .alpha(1f)
                    .setDuration(500)
                    .start();
            })
            .start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!slideshowImages.isEmpty()) {
            sliderHandler.postDelayed(sliderRunnable, 4000);
        }
    }

    public void onHomeButtonClick(View view) {
        // Already on the home page, no action needed
    }

    public void onMapsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
    }

    public void onStorylineButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Storyline_PAGE.class);
    }

    public void onToolsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Tools_PAGE.class);
    }
}