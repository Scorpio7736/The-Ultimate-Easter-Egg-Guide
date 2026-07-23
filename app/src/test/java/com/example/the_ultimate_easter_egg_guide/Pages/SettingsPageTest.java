package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.Helper.MusicManager;
import com.example.the_ultimate_easter_egg_guide.Models.Music;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class SettingsPageTest {

    @Test
    public void testActivityLaunches() {
        try (ActivityScenario<Settings_PAGE> scenario = ActivityScenario.launch(Settings_PAGE.class)) {
            scenario.onActivity(activity -> {
                assertNotNull(activity);
                assertNotNull(activity.findViewById(R.id.sound_settings_header));
                assertNotNull(activity.findViewById(R.id.permissions_header));
                assertNotNull(activity.findViewById(R.id.about_me_header));
                assertNotNull(activity.findViewById(R.id.contact_us_header));
            });
        }
    }

    @Test
    public void testDropdownToggle() {
        try (ActivityScenario<Settings_PAGE> scenario = ActivityScenario.launch(Settings_PAGE.class)) {
            scenario.onActivity(activity -> {
                View header = activity.findViewById(R.id.sound_settings_header);
                LinearLayout content = activity.findViewById(R.id.sound_settings_content);
                
                assertEquals(View.GONE, content.getVisibility());
                
                header.performClick();
                assertEquals(View.VISIBLE, content.getVisibility());
                
                header.performClick();
                assertEquals(View.GONE, content.getVisibility());
            });
        }
    }

    @Test
    public void testAudioSwitchPersistence() {
        try (ActivityScenario<Settings_PAGE> scenario = ActivityScenario.launch(Settings_PAGE.class)) {
            scenario.onActivity(activity -> {
                SwitchMaterial audioSwitch = activity.findViewById(R.id.audio_settings_switch);
                
                // Toggle to a known state
                audioSwitch.setChecked(true);
                assertTrue(MusicManager.getInstance(activity).isMusicEnabled());
                
                // Toggle OFF
                audioSwitch.performClick();
                // Note: performClick triggers the listener
            });
        }
        
        // Verify value in manager
        assertFalse(MusicManager.getInstance(ApplicationProvider.getApplicationContext()).isMusicEnabled());
    }

    @Test
    public void testMusicTrackPersistence() {
        try (ActivityScenario<Settings_PAGE> scenario = ActivityScenario.launch(Settings_PAGE.class)) {
            scenario.onActivity(activity -> {
                Spinner spinner = activity.findViewById(R.id.music_track_spinner);
                assertNotNull(spinner);
                
                // Select "Damned Black Ops 2"
                // Music.DAMNED_BOII is at index 2
                spinner.setSelection(2);
            });
        }
        
        // Verify value in manager
        assertEquals(Music.DAMNED_BOII, MusicManager.getInstance(ApplicationProvider.getApplicationContext()).getSelectedSong());
    }
}
