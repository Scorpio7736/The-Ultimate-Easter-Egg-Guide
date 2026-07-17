package com.example.the_ultimate_easter_egg_guide.Models;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.R;

public abstract class PageController_BaseClass extends AppCompatActivity {
    
    public boolean ENABLE_TESTING = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
    protected void SetThisBackground(int imageID) {
        ImageView background = findViewById(R.id.background_image);
        if (background != null) {
            background.setImageResource(imageID);
        }
    }

}
