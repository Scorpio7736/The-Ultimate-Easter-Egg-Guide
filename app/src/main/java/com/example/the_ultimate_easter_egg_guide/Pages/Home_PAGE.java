package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.core.splashscreen.SplashScreen;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.ImageID;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class Home_PAGE extends NavPageController_BaseClass {

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
        SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        setupBaseNavigation();
        setupSlideshow();
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

    @Override
    public void onHomeButtonClick(View view) {
        // Already on the home page, no action needed
    }
}