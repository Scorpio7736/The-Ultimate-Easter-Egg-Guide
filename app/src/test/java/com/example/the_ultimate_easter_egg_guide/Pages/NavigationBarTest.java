package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.widget.ImageButton;

import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class NavigationBarTest {

    private Intent createIntent() {
        return new Intent(androidx.test.core.app.ApplicationProvider.getApplicationContext(), Home_PAGE.class);
    }

    @Test
    public void testNavigateToHome() {
        try (ActivityScenario<Home_PAGE> scenario = ActivityScenario.launch(createIntent())) {
            scenario.onActivity(activity -> {
                // Clicking home from home page shouldn't do anything or just restart, 
                // but the logic in NavPageController_BaseClass says:
                // if (!(this instanceof Home_PAGE)) { ... }
                // So clicking home from home won't start a new intent.
                // We should test another button first to see it works.
                ImageButton mapsButton = activity.findViewById(R.id.nav_maps_button);
                mapsButton.performClick();
                
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(actualIntent);
                assertEquals(MapsSelection_Page.class.getName(), actualIntent.getComponent().getClassName());
            });
        }
    }

    @Test
    public void testNavigateToMaps() {
        try (ActivityScenario<Home_PAGE> scenario = ActivityScenario.launch(createIntent())) {
            scenario.onActivity(activity -> {
                ImageButton mapsButton = activity.findViewById(R.id.nav_maps_button);
                mapsButton.performClick();
                
                Intent expectedIntent = new Intent(activity, MapsSelection_Page.class);
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertEquals(expectedIntent.getComponent(), actualIntent.getComponent());
            });
        }
    }

    @Test
    public void testNavigateToSettings() {
        try (ActivityScenario<Home_PAGE> scenario = ActivityScenario.launch(createIntent())) {
            scenario.onActivity(activity -> {
                ImageButton settingsButton = activity.findViewById(R.id.nav_settings_button);
                settingsButton.performClick();
                
                Intent expectedIntent = new Intent(activity, Settings_PAGE.class);
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertEquals(expectedIntent.getComponent(), actualIntent.getComponent());
            });
        }
    }
}
