package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;

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
                assertNotNull(activity.findViewById(R.id.permissions_button));
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
        Context context = ApplicationProvider.getApplicationContext();
        SharedPreferences prefs = context.getSharedPreferences("AppPrefs", Context.MODE_PRIVATE);
        
        // Ensure starting state
        prefs.edit().putBoolean("AudioEnabled", true).apply();
        
        try (ActivityScenario<Settings_PAGE> scenario = ActivityScenario.launch(Settings_PAGE.class)) {
            scenario.onActivity(activity -> {
                SwitchMaterial audioSwitch = activity.findViewById(R.id.audio_settings_switch);
                assertTrue(audioSwitch.isChecked());
                
                audioSwitch.setChecked(false);
                // Persistence is handled via listener which uses apply()
            });
        }
        
        // Verify value in prefs
        assertEquals(false, prefs.getBoolean("AudioEnabled", true));
    }
}
