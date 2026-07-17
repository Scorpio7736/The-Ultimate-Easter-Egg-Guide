package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.widget.Spinner;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class StorylineMapsSelectionPageTest {

    @Test
    public void testActivityLaunches() {
        try (ActivityScenario<MapsSelection_Page> scenario = ActivityScenario.launch(MapsSelection_Page.class)) {
            scenario.onActivity(activity -> {
                assertNotNull(activity);
                RecyclerView recyclerView = activity.findViewById(R.id.maps_recycler_view);
                assertNotNull(recyclerView);
            });
        }
    }

    @Test
    public void testInitialState() {
        try (ActivityScenario<MapsSelection_Page> scenario = ActivityScenario.launch(MapsSelection_Page.class)) {
            scenario.onActivity(activity -> {
                RecyclerView recyclerView = activity.findViewById(R.id.maps_recycler_view);
                // Initial state is Grid View
                assertTrue(recyclerView.getLayoutManager() instanceof GridLayoutManager);
                
                Spinner spinner = activity.findViewById(R.id.myDropdown);
                assertNotNull(spinner.getAdapter());
                assertTrue(spinner.getAdapter().getCount() > 0);
            });
        }
    }

    @Test
    public void testViewToggle() {
        try (ActivityScenario<MapsSelection_Page> scenario = ActivityScenario.launch(MapsSelection_Page.class)) {
            scenario.onActivity(activity -> {
                RecyclerView recyclerView = activity.findViewById(R.id.maps_recycler_view);
                FloatingActionButton toggleButton = activity.findViewById(R.id.view_toggle_button);
                
                // Switch to List View
                toggleButton.performClick();
                assertTrue(recyclerView.getLayoutManager() instanceof LinearLayoutManager);
                
                // Switch back to Grid View
                toggleButton.performClick();
                assertTrue(recyclerView.getLayoutManager() instanceof GridLayoutManager);
            });
        }
    }

    @Test
    public void testMapClickNavigates() {
        try (ActivityScenario<MapsSelection_Page> scenario = ActivityScenario.launch(MapsSelection_Page.class)) {
            scenario.onActivity(activity -> {
                // Manually trigger onMapClick as it's an interface method
                activity.onMapClick(Maps.WAW_Nacht_Der_Untoten);
                
                Intent expectedIntent = new Intent(activity, MapDisplay_Page.class);
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                
                assertNotNull(actualIntent);
                assertEquals(expectedIntent.getComponent(), actualIntent.getComponent());
                assertEquals("WAW_Nacht_Der_Untoten", actualIntent.getStringExtra("MAP_ID"));
            });
        }
    }
}
