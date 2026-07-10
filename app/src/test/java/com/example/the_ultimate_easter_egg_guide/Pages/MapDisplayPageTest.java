package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.MapType;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowDialog;
import org.robolectric.shadows.ShadowLooper;

import java.util.concurrent.TimeUnit;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class MapDisplayPageTest {

    @Test
    public void testTrailerAutoStartsAfterDelay() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), MapDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());

        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                View trailerVideo = activity.findViewById(R.id.map_trailer_video);
                
                // Fast forward 5 seconds to trigger trailerRunnable lambda
                ShadowLooper.idleMainLooper(5100, TimeUnit.MILLISECONDS);
                
                // Assert the lambda logic executed
                assertEquals(View.VISIBLE, trailerVideo.getVisibility());
            });
        }
    }

    @Test
    public void testShowVideoPopup() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), MapDisplay_Page.class);
        // Choose a map that has a trailer (WAW_Nacht_Der_Untoten has one)
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());

        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                // Trigger the popup
                activity.showVideoPopup();

                // Verify a dialog is showing
                Dialog dialog = ShadowDialog.getLatestDialog();
                assertNotNull(dialog);
                assertTrue(dialog.isShowing());
                
                // Verify it has the correct content view
                assertNotNull(dialog.findViewById(R.id.dialog_video_view));
                assertNotNull(dialog.findViewById(R.id.close_button));
            });
        }
    }

    @Test
    public void testGetBackgroundForMapType() {
        try (ActivityScenario<MapDisplay_Page> scenario = ActivityScenario.launch(MapDisplay_Page.class)) {
            scenario.onActivity(activity -> {
                assertEquals(R.drawable.general_bkg, activity.getBackgroundForMapType(null));
                assertEquals(R.drawable.group935_bkg, activity.getBackgroundForMapType(MapType.Group_935));
                assertEquals(R.drawable.division9_bkg, activity.getBackgroundForMapType(MapType.Division_9));
                assertEquals(R.drawable.ascension_bkg, activity.getBackgroundForMapType(MapType.Ascension_Group));
                assertEquals(R.drawable.broken_arrow_bkg, activity.getBackgroundForMapType(MapType.Broken_Arrow));
                assertEquals(R.drawable.us_gov_bkg, activity.getBackgroundForMapType(MapType.US_Government));
                assertEquals(R.drawable.jungle_bkg, activity.getBackgroundForMapType(MapType.Jungle));
                assertEquals(R.drawable.broken_earth_bkg, activity.getBackgroundForMapType(MapType.Broken_Earth));
                assertEquals(R.drawable.purgatory_bkg, activity.getBackgroundForMapType(MapType.Purgatory));
                assertEquals(R.drawable.crazy_place_bkg, activity.getBackgroundForMapType(MapType.Crazy_Place));
                assertEquals(R.drawable.agartha_bkg, activity.getBackgroundForMapType(MapType.Agartha));
                assertEquals(R.drawable.lunargroup935_bkg, activity.getBackgroundForMapType(MapType.Group_935_Lunar));
                assertEquals(R.drawable.city_bkg, activity.getBackgroundForMapType(MapType.Morge_City));
                assertEquals(R.drawable.group935winter_bkg, activity.getBackgroundForMapType(MapType.Group_935_Winter));
                assertEquals(R.drawable.boiii_gorodkrovi_bkg_m, activity.getBackgroundForMapType(MapType.Stalingrad));
                
                // Test default/null cases
                assertEquals(R.drawable.general_bkg, activity.getBackgroundForMapType(MapType.NOT_SET));
                assertEquals(R.drawable.general_bkg, activity.getBackgroundForMapType(MapType.Chaos));
                assertEquals(R.drawable.general_bkg, activity.getBackgroundForMapType(MapType.Dark_Ather));
            });
        }
    }

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
