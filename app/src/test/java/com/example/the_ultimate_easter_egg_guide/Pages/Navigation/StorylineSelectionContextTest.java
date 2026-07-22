package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import android.content.Intent;
import android.widget.Spinner;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class StorylineSelectionContextTest {

    @Test
    public void testInitialSelectionFromIntent() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), StorylineSelection_PAGE.class);
        intent.putExtra(StorylineSelection_PAGE.EXTRA_INITIAL_CATEGORY, StorylineItems.Map.name());
        intent.putExtra(StorylineSelection_PAGE.EXTRA_INITIAL_GAME, Games.World_At_War.name());

        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(intent)) {
            scenario.onActivity(activity -> {
                Spinner categorySpinner = activity.findViewById(R.id.storyline_spinner);
                Spinner gameSpinner = activity.findViewById(R.id.game_filter_spinner);

                assertNotNull(categorySpinner);
                assertNotNull(gameSpinner);

                // Verify category is set to Maps
                assertEquals(StorylineItems.Map.itemName, categorySpinner.getSelectedItem().toString());
                
                // Verify game filter is set to World at War
                // Note: The index might be different depending on whether "All Games" is included.
                // In StorylineSelection_PAGE, it calls setupGameFilter with includeAllOption=true.
                // So index 0 is "All Games", index 1 should be World at War.
                assertEquals(Games.World_At_War.gameName, gameSpinner.getSelectedItem().toString());
            });
        }
    }
}
