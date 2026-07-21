package com.example.the_ultimate_easter_egg_guide.Models.Tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumColors;

import org.junit.Test;

public class GobbleGumColorsTest {

    @Test
    public void testColorMeanings() {
        assertEquals("Round-Limited", GobbleGumColors.BLUE.colorMeaning);
        assertEquals("Immediate Activation / Conditional Activation", GobbleGumColors.ORANGE.colorMeaning);
        assertEquals("Time-Limited", GobbleGumColors.GREEN.colorMeaning);
        assertEquals("Player Activated", GobbleGumColors.PURPLE.colorMeaning);
    }

    @Test
    public void testEnumValues() {
        for (GobbleGumColors color : GobbleGumColors.values()) {
            assertNotNull(color.colorMeaning);
        }
    }
}
