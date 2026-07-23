package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.the_ultimate_easter_egg_guide.Helper.MusicManager;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Models.Music;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Pages.AboutMe_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.ContactUs_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.ArrayList;
import java.util.List;

public class Settings_PAGE extends NavPageController_BaseClass
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);

        setupBaseNavigation();

        View aboutMeHeader = findViewById(R.id.about_me_header);
        if (aboutMeHeader != null) {
            aboutMeHeader.setOnClickListener(v -> 
                PageTransitionManager.startActivityWithFade(this, AboutMe_PAGE.class));
        }

        View permissionsHeader = findViewById(R.id.permissions_header);
        if (permissionsHeader != null) {
            permissionsHeader.setOnClickListener(v -> openAppSettings());
        }

        View contactUsHeader = findViewById(R.id.contact_us_header);
        if (contactUsHeader != null) {
            contactUsHeader.setOnClickListener(v -> 
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
        Spinner musicSpinner = findViewById(R.id.music_track_spinner);

        if (soundHeader != null && soundContent != null) {
            soundHeader.setOnClickListener(v -> {
                if (soundContent.getVisibility() == View.VISIBLE) {
                    soundContent.setVisibility(View.GONE);
                    if (arrow != null) arrow.setRotation(0);
                } else {
                    soundContent.setVisibility(View.VISIBLE);
                    if (arrow != null) arrow.setRotation(180);
                }
            });
        }

        if (audioSwitch != null) {
            audioSwitch.setChecked(MusicManager.getInstance(this).isMusicEnabled());

            audioSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
                MusicManager.getInstance(this).toggleMusic(isChecked);
            });
        }

        if (musicSpinner != null) {
            Music[] songs = Music.values();
            List<String> displayNames = new ArrayList<>();
            for (Music s : songs) {
                displayNames.add(s.displayName);
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.music_spinner_item, displayNames);
            adapter.setDropDownViewResource(R.layout.music_spinner_dropdown_item);
            musicSpinner.setAdapter(adapter);

            // Set current selection
            Music current = MusicManager.getInstance(this).getSelectedSong();
            int selection = java.util.Arrays.asList(songs).indexOf(current);
            if (selection != -1) musicSpinner.setSelection(selection);

            musicSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Music selected = songs[position];
                    MusicManager musicManager = MusicManager.getInstance(Settings_PAGE.this);
                    
                    // Only update if the selection actually changed to avoid music "blipping" on page load
                    if (selected != musicManager.getSelectedSong()) {
                        musicManager.setSong(selected);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
        }
    }
}
