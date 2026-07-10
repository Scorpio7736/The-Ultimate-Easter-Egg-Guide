package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.R;

public class Tools_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.tools_page);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void onHomeButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
    }

    public void onMapsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
    }

    public void onStorylineButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Storyline_PAGE.class);
    }

    public void onToolsButtonClick(View view) {
        // Already on this page
    }
}
