package com.example.the_ultimate_easter_egg_guide.Helper;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Games;

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
    public void testCreaturesCategory() {
        StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(
                StorylineItems.Creatures,
                false,
                null
        );

        int itemCount = adapter.getItemCount();
        assertTrue("Item count should be greater than 0", itemCount > 0);

        boolean foundHeader = false;
        boolean foundCreature = false;

        for (int i = 0; i < itemCount; i++) {
            int viewType = adapter.getItemViewType(i);
            if (viewType == 0) { // TYPE_HEADER
                foundHeader = true;
            } else if (viewType == 1) { // TYPE_CHARACTER
                foundCreature = true;
            }
        }

        assertTrue("Should contain creature group headers", foundHeader);
        assertTrue("Should contain creatures", foundCreature);
    }

    @Test
    public void testItemsCategory() {
        StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(
                StorylineItems.Items,
                false,
                null
        );

        int itemCount = adapter.getItemCount();
        assertTrue("Item count should be greater than 0", itemCount > 0);

        boolean foundHeader = false;
        boolean foundItem = false;

        for (int i = 0; i < itemCount; i++) {
            int viewType = adapter.getItemViewType(i);
            if (viewType == 0) { // TYPE_HEADER
                foundHeader = true;
            } else if (viewType == 1) { // TYPE_CHARACTER
                foundItem = true;
            }
        }

        assertTrue("Should contain item group headers", foundHeader);
        assertTrue("Should contain items", foundItem);
    }

    @Test
    public void testGroupsCategory() {
        StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(
                StorylineItems.Organizations,
                false,
                null
        );

        int itemCount = adapter.getItemCount();
        assertTrue("Item count should be greater than 0", itemCount > 0);

        boolean foundHeader = false;
        boolean foundGroup = false;

        for (int i = 0; i < itemCount; i++) {
            int viewType = adapter.getItemViewType(i);
            if (viewType == 0) { // TYPE_HEADER
                foundHeader = true;
            } else if (viewType == 1) { // TYPE_CHARACTER
                foundGroup = true;
            }
        }

        assertTrue("Should contain headers", foundHeader);
        assertTrue("Should contain groups", foundGroup);
    }

    @Test
    public void testGameFilteringForCreatures() {
        // Test filtering by WAW (should contain Hellhounds but not Margwas)
        StorylineCharacterAdapter wawAdapter = new StorylineCharacterAdapter(
                StorylineItems.Creatures,
                false,
                Games.World_At_War,
                null
        );
        
        // Indirect check: verify it doesn't crash and has items
        assertTrue(wawAdapter.getItemCount() > 0);

        // Test filtering by BO3 (should contain Margwas)
        StorylineCharacterAdapter bo3Adapter = new StorylineCharacterAdapter(
                StorylineItems.Creatures,
                false,
                Games.Black_Ops_III,
                null
        );
        assertTrue(bo3Adapter.getItemCount() > 0);
    }

    @Test
    public void testGameFilteringForCharacters() {
        // Primis characters appear in BO2, BO3, BO4
        StorylineCharacterAdapter bo3Adapter = new StorylineCharacterAdapter(
                StorylineItems.PlayerCharacter,
                false,
                Games.Black_Ops_III,
                null
        );
        assertTrue(bo3Adapter.getItemCount() > 0);

        // WAW characters in WAW
        StorylineCharacterAdapter wawAdapter = new StorylineCharacterAdapter(
                StorylineItems.PlayerCharacter,
                false,
                Games.World_At_War,
                null
        );
        assertTrue(wawAdapter.getItemCount() > 0);
    }

    @Test
    public void testGameFilteringForGroups() {
        // Group 935 is in WAW
        StorylineCharacterAdapter wawAdapter = new StorylineCharacterAdapter(
                StorylineItems.Organizations,
                false,
                Games.World_At_War,
                null
        );
        assertTrue(wawAdapter.getItemCount() > 0);

        // Division 9 is only in BO3
        StorylineCharacterAdapter bo3Adapter = new StorylineCharacterAdapter(
                StorylineItems.Organizations,
                false,
                Games.Black_Ops_III,
                null
        );
        assertTrue(bo3Adapter.getItemCount() > 0);
    }

    @Test
    public void testGameFilteringForItems() {
        // Juggernog is in WAW
        StorylineCharacterAdapter wawAdapter = new StorylineCharacterAdapter(
                StorylineItems.Items,
                false,
                Games.World_At_War,
                null
        );
        assertTrue(wawAdapter.getItemCount() > 0);

        // Widow's Wine is only in BO3
        StorylineCharacterAdapter bo3Adapter = new StorylineCharacterAdapter(
                StorylineItems.Items,
                false,
                Games.Black_Ops_III,
                null
        );
        assertTrue(bo3Adapter.getItemCount() > 0);
    }
}
