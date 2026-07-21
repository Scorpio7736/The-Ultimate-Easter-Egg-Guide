package com.example.the_ultimate_easter_egg_guide.ToolsData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumColors;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumTypes;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;

public class GobbleGumsTest {

    @Test
    public void testEnumInitialization() {
        for (GobbleGums gum : GobbleGums.values()) {
            assertNotNull("Gum name should not be null for " + gum.name(), gum.gumName);
            assertTrue("Gum name should not be empty for " + gum.name(), !gum.gumName.isEmpty());
            assertTrue("Gum cover should be a valid resource ID for " + gum.name(), gum.gumCover != 0);
            assertNotNull("Game should not be null for " + gum.name(), gum.game);
            assertNotNull("Gum type should not be null for " + gum.name(), gum.gumType);
            assertNotNull("Gum color should not be null for " + gum.name(), gum.gumColor);
        }
    }

    @Test
    public void testSpecificGumData() {
        // Test Perkaholic
        GobbleGums perkaholic = GobbleGums.PERKAHOLIC;
        assertEquals("Perkaholic", perkaholic.gumName);
        assertEquals(Games.Black_Ops_III, perkaholic.game);
        assertEquals(GobbleGumTypes.Mega, perkaholic.gumType);
        assertEquals(GobbleGumColors.ORANGE, perkaholic.gumColor);

        // Test Alchemical Antithesis
        GobbleGums alchemical = GobbleGums.ALCHEMICAL_ANTITHESIS;
        assertEquals("Alchemical Antithesis", alchemical.gumName);
        assertEquals(Games.Black_Ops_III, alchemical.game);
        assertEquals(GobbleGumTypes.Classic, alchemical.gumType);
        assertEquals(GobbleGumColors.PURPLE, alchemical.gumColor);
    }
}
