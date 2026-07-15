package com.example.the_ultimate_easter_egg_guide.StorylineData.OrganizationsData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Games;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class OrganizationsTest {

    @Test
    public void testEnumInitialization() {
        for (Organizations group : Organizations.values()) {
            assertNotNull("Display name should not be null for " + group.name(), group.displayName);
            assertTrue("Display name should not be empty for " + group.name(), !group.displayName.isEmpty());
            assertTrue("Group image should be a valid resource ID for " + group.name(), group.organizationImage != 0);
            assertNotNull("Games list should not be null for " + group.name(), group.gamesList);
            assertTrue("Games list should not be empty for " + group.name(), !group.gamesList.isEmpty());
            assertNotNull("Fandom link should not be null for " + group.name(), group.fandomLink);
            assertTrue("Fandom link should be a valid URL for " + group.name(), group.fandomLink.startsWith("https://callofduty.fandom.com/wiki/"));
        }
    }

    @Test
    public void testSpecificGroupData() {
        Organizations g935 = Organizations.Group935;
        assertEquals("Group 935", g935.displayName);
        assertTrue(g935.gamesList.contains(Games.World_At_War));
        assertEquals("https://callofduty.fandom.com/wiki/Group_935", g935.fandomLink);
        
        Organizations brokenArrow = Organizations.BrokenArrow;
        assertEquals("Broken Arrow", brokenArrow.displayName);
        assertTrue(brokenArrow.gamesList.contains(Games.Black_Ops_II));
        assertTrue(brokenArrow.gamesList.contains(Games.Black_Ops_IV));
    }
}
