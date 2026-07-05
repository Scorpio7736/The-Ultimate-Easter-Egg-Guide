package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.widget.ImageButton;

import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class NavigationBarTest {

    private Intent createIntent() {
        Intent intent = new Intent(androidx.test.core.app.ApplicationProvider.getApplicationContext(), MapDisplay_Page.class);
        // Using a map without a trailer to avoid VideoView resource noise in logs
        intent.putExtra("MAP_ID", Maps.Test_TestingMap1.name());
        return intent;
    }

    @Test
    public void testNavigateToHome() {
        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(createIntent())) {
            scenario.onActivity(activity -> {
                ImageButton homeButton = activity.findViewById(R.id.nav_home_button);
                homeButton.performClick();
                
                Intent expectedIntent = new Intent(activity, Home_PAGE.class);
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertEquals(expectedIntent.getComponent(), actualIntent.getComponent());
            });
        }
    }

    @Test
    public void testNavigateToMaps() {
        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(createIntent())) {
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
        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(createIntent())) {
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
