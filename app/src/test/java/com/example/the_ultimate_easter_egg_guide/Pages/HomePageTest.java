package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class HomePageTest {

    @Test
    public void testActivityLaunches() {
        try (ActivityScenario<Home_PAGE> scenario = ActivityScenario.launch(Home_PAGE.class)) {
            scenario.onActivity(activity -> {
                assertNotNull(activity);
                ImageView slideshow = activity.findViewById(R.id.slideshow_image);
                assertNotNull(slideshow);
            });
        }
    }

    @Test
    public void testNavigateToMaps() {
        try (ActivityScenario<Home_PAGE> scenario = ActivityScenario.launch(Home_PAGE.class)) {
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
        try (ActivityScenario<Home_PAGE> scenario = ActivityScenario.launch(Home_PAGE.class)) {
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
