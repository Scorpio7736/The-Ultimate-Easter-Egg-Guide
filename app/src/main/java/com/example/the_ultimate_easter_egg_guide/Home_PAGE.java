package com.example.the_ultimate_easter_egg_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.os.Bundle;

public class Home_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreen.installSplashScreen(this);
        setContentView(R.layout.home_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}