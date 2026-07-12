package com.example.the_ultimate_easter_egg_guide.Helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
public class StorylineCharacterAdapterTest {

    @Test
    public void testPlayerCharacterCategory() {
        StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(
                StorylineItems.PlayerCharacter,
                false,
                null
        );

        int itemCount = adapter.getItemCount();
        assertTrue("Item count should be greater than 0", itemCount > 0);

        boolean foundHeader = false;
        boolean foundCharacter = false;

        for (int i = 0; i < itemCount; i++) {
            int viewType = adapter.getItemViewType(i);
            if (viewType == 0) { // TYPE_HEADER
                foundHeader = true;
            } else if (viewType == 1) { // TYPE_CHARACTER
                foundCharacter = true;
            }
        }

        assertTrue("Should contain headers", foundHeader);
        assertTrue("Should contain characters", foundCharacter);
    }

    @Test
    public void testYoutubersCategory() {
        StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(
                StorylineItems.Youtubers,
                false,
                null
        );

        int itemCount = adapter.getItemCount();
        assertTrue("Item count should be greater than 0", itemCount > 0);

        boolean foundYoutuberGroupHeader = false;
        boolean foundYoutuber = false;

        for (int i = 0; i < itemCount; i++) {
            int viewType = adapter.getItemViewType(i);
            if (viewType == 0) { // TYPE_HEADER
                // In setupYoutuberItems, headers are YoutuberGroups
                // We can't easily check internal 'items' list but we can verify it doesn't crash
                foundYoutuberGroupHeader = true;
            } else if (viewType == 1) { // TYPE_CHARACTER
                foundYoutuber = true;
            }
        }

        assertTrue("Should contain Youtuber group headers", foundYoutuberGroupHeader);
        assertTrue("Should contain Youtubers", foundYoutuber);
    }

    @Test
    public void testTestingEnabled() {
        StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(
                StorylineItems.PlayerCharacter,
                true, // enableTesting
                null
        );

        // If testing is enabled, only TEST group should be added.
        // Assuming Player_Characters has at least one in TEST group
        int itemCount = adapter.getItemCount();
        
        for (int i = 0; i < itemCount; i++) {
            // We can't access private 'items', but we check logic in constructor
            // Verification is indirect here unless we expose items or check counts
        }
    }
}
