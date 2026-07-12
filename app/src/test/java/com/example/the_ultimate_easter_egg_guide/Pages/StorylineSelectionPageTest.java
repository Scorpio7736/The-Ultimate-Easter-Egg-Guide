package com.example.the_ultimate_easter_egg_guide.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.net.Uri;
import android.widget.Spinner;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;

import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.Storyline.CodZombiesYoutubersData.CodZombies_Youtubers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class StorylineSelectionPageTest {

    @Test
    public void testInitialCategoryIsSet() {
        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(StorylineSelection_PAGE.class)) {
            scenario.onActivity(activity -> {
                Spinner spinner = activity.findViewById(R.id.storyline_spinner);
                assertNotNull(spinner.getAdapter());
                assertTrue(spinner.getAdapter().getCount() > 0);
                
                RecyclerView recyclerView = activity.findViewById(R.id.storyline_recycler_view);
                assertNotNull(recyclerView.getAdapter());
            });
        }
    }

    @Test
    public void testCategorySwitch() {
        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(StorylineSelection_PAGE.class)) {
            scenario.onActivity(activity -> {
                Spinner spinner = activity.findViewById(R.id.storyline_spinner);
                RecyclerView recyclerView = activity.findViewById(R.id.storyline_recycler_view);
                
                // Switch to second category (likely NPCs)
                spinner.setSelection(1);
                assertNotNull(recyclerView.getAdapter());
            });
        }
    }

    @Test
    public void testOnPlayerCharacterClick() {
        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(StorylineSelection_PAGE.class)) {
            scenario.onActivity(activity -> {
                Player_Characters character = Player_Characters.EdwardRichtofen_Primis;
                activity.onPlayerCharacterClick(character);
                
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(actualIntent);
                assertEquals(CharacterDisplay_PAGE.class.getName(), actualIntent.getComponent().getClassName());
                assertEquals(character.name(), actualIntent.getStringExtra("CHARACTER_ID"));
                assertTrue(actualIntent.getBooleanExtra("IS_PLAYER_CHARACTER", false));
            });
        }
    }

    @Test
    public void testOnNonPlayerCharacterClick() {
        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(StorylineSelection_PAGE.class)) {
            scenario.onActivity(activity -> {
                NonPlayer_Characters character = NonPlayer_Characters.LudwigMaxis_Ultimis;
                activity.onNonPlayerCharacterClick(character);
                
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(actualIntent);
                assertEquals(CharacterDisplay_PAGE.class.getName(), actualIntent.getComponent().getClassName());
                assertEquals(character.name(), actualIntent.getStringExtra("CHARACTER_ID"));
                assertFalse(actualIntent.getBooleanExtra("IS_PLAYER_CHARACTER", true));
            });
        }
    }

    @Test
    public void testOnYoutuberClick() {
        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(StorylineSelection_PAGE.class)) {
            scenario.onActivity(activity -> {
                CodZombies_Youtubers youtuber = CodZombies_Youtubers.MR_ROFL_WAFFLES;
                activity.onYoutuberClick(youtuber);
                
                Intent actualIntent = shadowOf(activity).getNextStartedActivity();
                assertNotNull(actualIntent);
                assertEquals(Intent.ACTION_VIEW, actualIntent.getAction());
                assertEquals(Uri.parse(youtuber.channelLink), actualIntent.getData());
            });
        }
    }

    @Test
    public void testOnEnemyCreatureClick() {
        try (ActivityScenario<StorylineSelection_PAGE> scenario = ActivityScenario.launch(StorylineSelection_PAGE.class)) {
            scenario.onActivity(activity -> {
                com.example.the_ultimate_easter_egg_guide.Storyline.CreaturesData.Enemy_Creatures creature = com.example.the_ultimate_easter_egg_guide.Storyline.CreaturesData.Enemy_Creatures.Zombie;
                activity.onEnemyCreatureClick(creature);
                // Currently it just shows a toast, so we just verify it doesn't crash
            });
        }
    }
}
