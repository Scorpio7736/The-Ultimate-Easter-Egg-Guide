package com.example.the_ultimate_easter_egg_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MapsSelection_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_selection_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton settingsButton = findViewById(R.id.nav_settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsSelection_Page.this, Settings_PAGE.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });
    }

    public void onHomeButtonClick(View view) {
        Intent intent = new Intent(this, Home_PAGE.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    public void onMapsButtonClick(View view) {
        // Already on this page
    }
}