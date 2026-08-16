package com.example.the_ultimate_easter_egg_guide.Pages.Tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.widget.Spinner;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class RecommendGumsPageTest {

    @Test
    public void testActivityLaunches() {
        try (ActivityScenario<RecommendGums_ToolPage> scenario = ActivityScenario.launch(RecommendGums_ToolPage.class)) {
            scenario.onActivity(activity -> {
                assertNotNull(activity);
                assertNotNull(activity.findViewById(R.id.set_type_spinner));
                assertNotNull(activity.findViewById(R.id.gums_recycler_view));
            });
        }
    }

    @Test
    public void testSelectorFiltering() {
        try (ActivityScenario<RecommendGums_ToolPage> scenario = ActivityScenario.launch(RecommendGums_ToolPage.class)) {
            scenario.onActivity(activity -> {
                Spinner spinner = activity.findViewById(R.id.set_type_spinner);
                assertNotNull(spinner);
                
                boolean isTesting = PageController_BaseClass.ENABLE_TESTING;
                int count = spinner.getAdapter().getCount();
                
                if (isTesting) {
                    // In Dev Mode, should only contain "Test"
                    assertEquals(1, count);
                    assertEquals("Test", spinner.getAdapter().getItem(0).toString());
                } else {
                    // In Production, should contain many items but NOT "Test"
                    assertTrue(count > 1);
                    for (int i = 0; i < count; i++) {
                        assertFalse("Production mode should not show Test option", 
                                spinner.getAdapter().getItem(i).toString().equalsIgnoreCase("Test"));
                    }
                }
            });
        }
    }

    @Test
    public void testDataLoading() {
        try (ActivityScenario<RecommendGums_ToolPage> scenario = ActivityScenario.launch(RecommendGums_ToolPage.class)) {
            scenario.onActivity(activity -> {
                RecyclerView rv = activity.findViewById(R.id.gums_recycler_view);
                Spinner spinner = activity.findViewById(R.id.set_type_spinner);
                
                if (PageController_BaseClass.ENABLE_TESTING) {
                    // Test Set is selected by default in Dev Mode
                    assertTrue(rv.getAdapter().getItemCount() >= 1);
                } else {
                    // Select "Classic Only" (now index 0 in production after removing Standard)
                    spinner.setSelection(0);
                    // Classic Only currently has 6 sets defined in PlayerGumSets
                    assertEquals(6, rv.getAdapter().getItemCount());
                }
            });
        }
    }
}
