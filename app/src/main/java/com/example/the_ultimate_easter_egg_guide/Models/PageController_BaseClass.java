package com.example.the_ultimate_easter_egg_guide.Models;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Pages.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Tools_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;

public abstract class PageController_BaseClass extends AppCompatActivity {
    
    public boolean ENABLE_TESTING = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this, getExcludedTransitionIds());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    /**
     * Override this to provide a list of view IDs that should NOT animate during page transitions.
     */
    protected int[] getExcludedTransitionIds() {
        return new int[]{
                R.id.navigation_bar,
                R.id.nav_home_button,
                R.id.nav_maps_button,
                R.id.nav_blank_button_1,
                R.id.nav_blank_button_2,
                R.id.nav_settings_button
        };
    }

    /**
     * Call this in onCreate after setContentView to automatically link the settings button
     * if it exists in the layout.
     */
    protected void setupBaseNavigation() {
        ImageButton settingsButton = findViewById(R.id.nav_settings_button);
        if (settingsButton != null) {
            settingsButton.setOnClickListener(v -> 
                PageTransitionManager.startActivityWithFade(this, Settings_PAGE.class));
        }
    }

    protected void SetThisBackground(int imageID) {
        ImageView background = findViewById(R.id.background_image);
        if (background != null) {
            background.setImageResource(imageID);
        }
    }

    public void onHomeButtonClick(View view) {
        if (!(this instanceof Home_PAGE)) {
            PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
        }
    }

    public void onMapsButtonClick(View view) {
        if (!(this instanceof MapsSelection_Page)) {
            PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
        }
    }

    public void onStorylineButtonClick(View view) {
        if (!(this instanceof StorylineSelection_PAGE)) {
            PageTransitionManager.startActivityWithFade(this, StorylineSelection_PAGE.class);
        }
    }

    public void onToolsButtonClick(View view) {
        if (!(this instanceof Tools_PAGE)) {
            PageTransitionManager.startActivityWithFade(this, Tools_PAGE.class);
        }
    }
}
