package com.example.the_ultimate_easter_egg_guide.Storyline.CreaturesData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
            assertTrue("Display name should not be empty for " + creature.name(), creature.displayName.length() > 0);
            assertTrue("Creature cover should be a valid resource ID for " + creature.name(), creature.creatureCover != 0);
            assertNotNull("Creature group should not be null for " + creature.name(), creature.creatureGroup);
        }
    }

    @Test
    public void testSpecificCreatureData() {
        // Test a few specific ones to ensure they were mapped correctly
        assertEquals("Brutus", Enemy_Creatures.Brutus.displayName);
        assertEquals(R.drawable.brutus_pfp, Enemy_Creatures.Brutus.creatureCover);

        assertEquals("The Shadowman", Enemy_Creatures.TheShadowMan.displayName);
        assertEquals(R.drawable.shadowman_pfp, Enemy_Creatures.TheShadowMan.creatureCover);

        assertEquals("Zombie", Enemy_Creatures.Zombie.displayName);
        assertEquals(R.drawable.app_icon, Enemy_Creatures.Zombie.creatureCover);
        
        assertEquals("Megaton", Enemy_Creatures.Megaton.displayName);
    }
    
    @Test
    public void testDisplayNameFormatting() {
        // Verify some BO4+ names that were corrected
        assertEquals("Nosferatu", Enemy_Creatures.NosForotues.displayName);
        assertEquals("Spartoi", Enemy_Creatures.Spartwa.displayName);
        assertEquals("Gegenees", Enemy_Creatures.Gigganeese.displayName);
    }
}
