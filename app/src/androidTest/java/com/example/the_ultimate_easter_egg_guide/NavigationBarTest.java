package com.example.the_ultimate_easter_egg_guide;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.MapDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NavigationBarTest {

    @Rule
    public ActivityScenarioRule<MapDisplay_Page> activityRule =
            new ActivityScenarioRule<>(MapDisplay_Page.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testNavigateToHome() {
        onView(withId(R.id.nav_home_button)).perform(click());
        intended(hasComponent(Home_PAGE.class.getName()));
    }

    @Test
    public void testNavigateToMaps() {
        onView(withId(R.id.nav_maps_button)).perform(click());
        intended(hasComponent(MapsSelection_Page.class.getName()));
    }

    @Test
    public void testNavigateToSettings() {
        // First we need to make sure we are on a page that has the settings button logic.
        // MapDisplay_Page doesn't have settings logic in the Java code I read, but let's check.
        // Actually, MapsSelection_Page has it. Let's see if MapDisplay_Page has it.
        onView(withId(R.id.nav_settings_button)).perform(click());
        intended(hasComponent(Settings_PAGE.class.getName()));
    }
}
