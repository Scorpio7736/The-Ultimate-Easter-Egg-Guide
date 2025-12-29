package com.example.the_ultimate_easter_egg_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

public class Home_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreen.installSplashScreen(this);
        setContentView(R.layout.home_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton settingsButton = findViewById(R.id.nav_settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_PAGE.this, Settings_PAGE.class);
                startActivity(intent);
            }
        });
    }
}