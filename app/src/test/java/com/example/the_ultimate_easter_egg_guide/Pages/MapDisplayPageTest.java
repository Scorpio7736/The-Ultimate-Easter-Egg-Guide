package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class MapDisplayPageTest {

    @Test
    public void testPageLoadsCorrectMapData() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), MapDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());

        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                TextView title = activity.findViewById(R.id.map_title);
                TextView description = activity.findViewById(R.id.map_description);
                
                assertEquals("Nacht der Untoten", title.getText().toString());
                assertNotNull(description.getText());
                assertTrue(description.getText().length() > 0);
            });
        }
    }

    @Test
    public void testDescriptionToggle() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), MapDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());

        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                View description = activity.findViewById(R.id.map_description);
                View header = activity.findViewById(R.id.description_header);

                // Initial state depends on layout, but let's assume it's visible or we toggle it
                header.performClick();
                int visibilityAfterClick = description.getVisibility();
                
                header.performClick();
                assertTrue(description.getVisibility() != visibilityAfterClick);
            });
        }
    }

    @Test
    public void testNavigateToEggDisplay() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), MapDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());

        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                activity.findViewById(R.id.option_main_quest).performClick();

                Intent startedIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(startedIntent);
                assertEquals(EggDisplay_Page.class.getName(), startedIntent.getComponent().getClassName());
                assertEquals("WAW_Nacht_Der_Untoten", startedIntent.getStringExtra("MAP_ID"));
                assertEquals("MAIN_QUEST", startedIntent.getStringExtra("CATEGORY"));
            });
        }
    }

    @Test
    public void testNavBarHome() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), MapDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());

        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                activity.findViewById(R.id.nav_home_button).performClick();

                Intent startedIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(startedIntent);
                assertEquals(Home_PAGE.class.getName(), startedIntent.getComponent().getClassName());
            });
        }
    }
}
