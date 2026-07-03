package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
    public void testPageLoadsMainQuests() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), EggDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());
        intent.putExtra("CATEGORY", "MAIN_QUEST");

        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                TextView categoryTitle = activity.findViewById(R.id.egg_category_title);
                assertEquals("Main Quests", categoryTitle.getText().toString());

                RecyclerView recyclerView = activity.findViewById(R.id.eggs_recycler_view);
                assertNotNull(recyclerView.getAdapter());
                assertEquals(Maps.WAW_Nacht_Der_Untoten.eggData.mainQuests.size(), recyclerView.getAdapter().getItemCount());
            });
        }
    }

    @Test
    public void testPageLoadsSideQuests() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), EggDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());
        intent.putExtra("CATEGORY", "SIDE_QUESTS");

        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                TextView categoryTitle = activity.findViewById(R.id.egg_category_title);
                assertEquals("Side Quests", categoryTitle.getText().toString());

                RecyclerView recyclerView = activity.findViewById(R.id.eggs_recycler_view);
                assertEquals(Maps.WAW_Nacht_Der_Untoten.eggData.sideQuests.size(), recyclerView.getAdapter().getItemCount());
            });
        }
    }

    @Test
    public void testNavBarMaps() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), EggDisplay_Page.class);
        intent.putExtra("MAP_ID", Maps.WAW_Nacht_Der_Untoten.name());
        intent.putExtra("CATEGORY", "MAIN_QUEST");

        try (ActivityScenario<EggDisplay_Page> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                activity.findViewById(R.id.nav_maps_button).performClick();

                Intent startedIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(startedIntent);
                assertEquals(MapsSelection_Page.class.getName(), startedIntent.getComponent().getClassName());
            });
        }
    }
}
