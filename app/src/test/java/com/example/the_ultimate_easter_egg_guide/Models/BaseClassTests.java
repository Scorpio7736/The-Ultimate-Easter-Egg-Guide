package com.example.the_ultimate_easter_egg_guide.Models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Tools_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class BaseClassTests {

    @Test
    public void testPageControllerHidesActionBar() {
        // Use MapsSelection_Page as it's a concrete subclass of PageController_BaseClass
        try (ActivityScenario<MapsSelection_Page> scenario = ActivityScenario.launch(MapsSelection_Page.class)) {
            scenario.onActivity(activity -> {
                if (activity.getSupportActionBar() != null) {
                    assertFalse(activity.getSupportActionBar().isShowing());
                }
            });
        }
    }

    @Test
    public void testPageControllerSetBackground() {
        try (ActivityScenario<MapsSelection_Page> scenario = ActivityScenario.launch(MapsSelection_Page.class)) {
            scenario.onActivity(activity -> {
                ImageView bg = activity.findViewById(R.id.background_image);
                assertNotNull("Layout should have background_image", bg);
                
                activity.SetThisBackground(R.drawable.general_bkg);
                assertNotNull(bg.getDrawable());
            });
        }
    }

    @Test
    public void testNavPageControllerNavigation() {
        try (ActivityScenario<MapsSelection_Page> scenario = ActivityScenario.launch(MapsSelection_Page.class)) {
            scenario.onActivity(activity -> {
                // Test Home Click
                activity.onHomeButtonClick(null);
                Intent homeIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(homeIntent);
                assertEquals(Home_PAGE.class.getName(), homeIntent.getComponent().getClassName());

                // Storyline Click
                activity.onStorylineButtonClick(null);
                Intent storylineIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(storylineIntent);
                assertEquals(StorylineSelection_PAGE.class.getName(), storylineIntent.getComponent().getClassName());

                // Tools Click
                activity.onToolsButtonClick(null);
                Intent toolsIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(toolsIntent);
                assertEquals(Tools_PAGE.class.getName(), toolsIntent.getComponent().getClassName());
            });
        }
    }

    @Test
    public void testNavPageControllerSetupBaseNavigation() {
        try (ActivityScenario<Home_PAGE> scenario = ActivityScenario.launch(Home_PAGE.class)) {
            scenario.onActivity(activity -> {
                ImageButton settingsButton = activity.findViewById(R.id.nav_settings_button);
                assertNotNull("Layout should have nav_settings_button", settingsButton);
                
                settingsButton.performClick();
                Intent settingsIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(settingsIntent);
                assertEquals(Settings_PAGE.class.getName(), settingsIntent.getComponent().getClassName());
            });
        }
    }

    @Test
    public void testGameFilterVisibilityLogic() {
        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(StorylineSelection_PAGE.class)) {
            scenario.onActivity(activity -> {
                View title = activity.findViewById(R.id.game_filter_title);
                View spinner = activity.findViewById(R.id.game_filter_spinner);
                
                activity.setGameFilterVisibility(true);
                assertEquals(View.VISIBLE, title.getVisibility());
                assertEquals(View.VISIBLE, spinner.getVisibility());
                
                activity.setGameFilterVisibility(false);
                assertEquals(View.GONE, title.getVisibility());
                assertEquals(View.GONE, spinner.getVisibility());
            });
        }
    }
}
