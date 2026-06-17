package com.example.the_ultimate_easter_egg_guide;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MapDisplay_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.map_display_page);
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Receive data from Intent if needed
        if (getIntent().hasExtra("MAP_NAME")) {
            String mapName = getIntent().getStringExtra("MAP_NAME");
            // You can use this mapName to set titles or load specific data
        }
    }

    public void onHomeButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
    }

    public void onMapsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
    }
}
