package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Pages.AboutMe_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.ContactUs_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class Settings_PAGE extends NavPageController_BaseClass
{
    private static final String PREFS_NAME = "AppPrefs";
    private static final String KEY_AUDIO_ENABLED = "AudioEnabled";

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

        MaterialButton permissionsButton = findViewById(R.id.permissions_button);
        if (permissionsButton != null) {
            permissionsButton.setOnClickListener(v -> openAppSettings());
        }

        MaterialButton contactUsButton = findViewById(R.id.contact_us_button);
        if (contactUsButton != null) {
            contactUsButton.setOnClickListener(v -> 
                PageTransitionManager.startActivityWithFade(this, ContactUs_PAGE.class));
        }

        setupSoundSettings();
    }

    private void openAppSettings() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivity(intent);
    }

    private void setupSoundSettings() {
        View soundHeader = findViewById(R.id.sound_settings_header);
        LinearLayout soundContent = findViewById(R.id.sound_settings_content);
        ImageView arrow = findViewById(R.id.sound_settings_arrow);
        SwitchMaterial audioSwitch = findViewById(R.id.audio_settings_switch);

        if (soundHeader != null && soundContent != null && arrow != null) {
            soundHeader.setOnClickListener(v -> {
                if (soundContent.getVisibility() == View.VISIBLE) {
                    soundContent.setVisibility(View.GONE);
                    arrow.setRotation(0);
                } else {
                    soundContent.setVisibility(View.VISIBLE);
                    arrow.setRotation(180);
                }
            });
        }

        if (audioSwitch != null) {
            SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            boolean isAudioEnabled = prefs.getBoolean(KEY_AUDIO_ENABLED, true);
            audioSwitch.setChecked(isAudioEnabled);

            audioSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean(KEY_AUDIO_ENABLED, isChecked);
                editor.apply();
            });
        }
    }
}
