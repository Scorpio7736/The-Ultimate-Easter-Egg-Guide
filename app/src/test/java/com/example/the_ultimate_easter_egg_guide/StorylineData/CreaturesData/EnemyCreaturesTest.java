package com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class EnemyCreaturesTest {

    @Test
    public void testEnumInitialization() {
        for (Enemy_Creatures creature : Enemy_Creatures.values()) {
            assertNotNull("Display name should not be null for " + creature.name(), creature.displayName);
            assertTrue("Display name should not be empty for " + creature.name(), !creature.displayName.isEmpty());
            assertTrue("Creature cover should be a valid resource ID for " + creature.name(), creature.creatureCover != 0);
            assertNotNull("Creature group should not be null for " + creature.name(), creature.creatureGroup);
            assertNotNull("Games list should not be null for " + creature.name(), creature.gamesList);
            assertTrue("Games list should not be empty for " + creature.name(), !creature.gamesList.isEmpty());
            assertNotNull("Fandom link should not be null for " + creature.name(), creature.fandomLink);
            assertTrue("Fandom link should be a valid URL for " + creature.name(), creature.fandomLink.startsWith("https://callofduty.fandom.com/wiki/"));
        }
    }

    @Test
    public void testInterfaceImplementation() {
        for (Enemy_Creatures creature : Enemy_Creatures.values()) {
            assertEquals(creature.displayName, creature.GetDisplayName());
            assertEquals(creature.creatureCover, creature.GetImage());
            assertEquals(creature.creatureGroup, creature.GetGroup());
        }
    }

    @Test
    public void testSpecificCreatureData() {
        // Test Zombie which uses GetAllGamesBetween
        Enemy_Creatures zombie = Enemy_Creatures.Zombie;
        assertEquals("Zombie", zombie.displayName);
        assertTrue(zombie.gamesList.contains(Games.World_At_War));
        assertTrue(zombie.gamesList.contains(Games.Black_Ops_I));
        assertEquals("https://callofduty.fandom.com/wiki/Zombie", zombie.fandomLink);

        // Test Brutus which has a specific PFP
        Enemy_Creatures brutus = Enemy_Creatures.Brutus;
        assertEquals("Brutus", brutus.displayName);
        assertEquals(R.drawable.brutus_pfp, brutus.creatureCover);
        assertTrue(brutus.gamesList.contains(Games.Black_Ops_II));
        assertTrue(brutus.gamesList.contains(Games.Black_Ops_IV));

        // Test George Romero
        Enemy_Creatures george = Enemy_Creatures.GeorgeRomero;
        assertEquals("George Romero", george.displayName);
        assertEquals(1, george.gamesList.size());
        assertEquals(Games.Black_Ops_I, george.gamesList.get(0));
    }

    @Test
    public void testFandomLinks() {
        assertEquals("https://callofduty.fandom.com/wiki/Hellhound", Enemy_Creatures.Hellhound.fandomLink);
        assertEquals("https://callofduty.fandom.com/wiki/Margwa", Enemy_Creatures.Margwa.fandomLink);
        // Pentagon Thief has special path
        assertEquals("https://callofduty.fandom.com/wiki/Yuri_Zavoyski_(Aether)", Enemy_Creatures.PentagonThief.fandomLink);
    }
}
