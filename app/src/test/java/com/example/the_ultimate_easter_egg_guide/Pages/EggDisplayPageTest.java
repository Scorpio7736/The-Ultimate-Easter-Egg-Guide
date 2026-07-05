package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
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
public class EggDisplayPageTest {

    @Test
    public void testActivityLaunchesWithMainQuest() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), EggDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Der_Riese.name());
        intent.putExtra("CATEGORY", "MAIN_QUEST");

        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                assertNotNull(activity);
                TextView categoryTitle = activity.findViewById(R.id.egg_category_title);
                assertEquals("Main Quests", categoryTitle.getText().toString());
                
                RecyclerView recyclerView = activity.findViewById(R.id.eggs_recycler_view);
                assertNotNull(recyclerView.getAdapter());
                assertTrue(recyclerView.getAdapter().getItemCount() > 0);
            });
        }
    }

    @Test
    public void testCategorySideQuests() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), EggDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());
        intent.putExtra("CATEGORY", "SIDE_QUESTS");

        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                TextView categoryTitle = activity.findViewById(R.id.egg_category_title);
                assertEquals("Side Quests", categoryTitle.getText().toString());
            });
        }
    }

    @Test
    public void testCategoryBuildables() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), EggDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.BOIII_Shadows_Of_Evil.name());
        intent.putExtra("CATEGORY", "BUILDABLES");

        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                TextView categoryTitle = activity.findViewById(R.id.egg_category_title);
                assertEquals("Buildables", categoryTitle.getText().toString());
            });
        }
    }

    @Test
    public void testActivityLaunchesWithoutData() {
        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(EggDisplay_Page.class)) {
            scenario.onActivity(activity -> {
                assertNotNull(activity);
                RecyclerView recyclerView = activity.findViewById(R.id.eggs_recycler_view);
                assertNotNull(recyclerView.getAdapter());
                assertEquals(0, recyclerView.getAdapter().getItemCount());
            });
        }
    }

    @Test
    public void testMapsButtonClickNavigates() {
        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(EggDisplay_Page.class)) {
            scenario.onActivity(activity -> {
                activity.onMapsButtonClick(null);
                
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(actualIntent);
                assertEquals(MapsSelection_Page.class.getName(), actualIntent.getComponent().getClassName());
            });
        }
    }

    @Test
    public void testBackgroundLoading() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), EggDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.BOIII_Shadows_Of_Evil.name());
        intent.putExtra("CATEGORY", "MAIN_QUEST");

        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                // This triggers the switch cases in getBackgroundForMapType
                assertNotNull(activity.findViewById(R.id.background_image));
            });
        }
    }
}
