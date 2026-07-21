package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.os.Bundle;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Pages.AboutMe_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.button.MaterialButton;

public class Settings_PAGE extends NavPageController_BaseClass
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);

        setupBaseNavigation();

        MaterialButton aboutMeButton = findViewById(R.id.about_me_button);
        if (aboutMeButton != null) {
            aboutMeButton.setOnClickListener(v -> 
                PageTransitionManager.startActivityWithFade(this, AboutMe_PAGE.class));
        }
    }

}
