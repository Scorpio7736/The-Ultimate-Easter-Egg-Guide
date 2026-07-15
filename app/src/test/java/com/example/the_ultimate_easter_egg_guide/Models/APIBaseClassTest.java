package com.example.the_ultimate_easter_egg_guide.Models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageTypes;

import org.junit.Test;

public class APIBaseClassTest {

    private final API_BaseClass api = new API_BaseClass();

    @Test
    public void testGenerateImageName_MapCover() {
        String name = api.GenerateImageName(Games.Black_Ops_III, "Der Eisendrache", ImageTypes.MapCover);
        assertEquals("boiii_dereisendrache_mapcover", name);
    }

    @Test
    public void testGenerateImageName_Background() {
        String name = api.GenerateImageName(Games.World_At_War, "Nacht", ImageTypes.Background);
        assertEquals("waw_nacht_bkg", name);
    }

    @Test
    public void testGenerateImageName_CharacterPortrait() {
        String name = api.GenerateImageName(Games.Black_Ops_II, "Richtofen", ImageTypes.CharacterPortrait);
        assertEquals("boii_richtofen_charpfp", name);
    }

    @Test
    public void testGenerateImageName_YouTuberPortrait() {
        String name = api.GenerateImageName(null, "MrRoflWaffles", ImageTypes.YouTuberPortrait);
        assertEquals("mrroflwaffles_youtuberpfp", name);
    }

    @Test
    public void testGenerateImageName_EasterEggStep() {
        // Assuming imageName is mapname_stepname for steps
        String name = api.GenerateImageName(Games.Black_Ops_I, "Moon_BigBang", ImageTypes.EasterEggStep);
        assertEquals("boi_moon_bigbang_step", name);
    }

    @Test
    public void testCheckIfImageExists_NoContextReturnsFalse() {
        // Without context, it should return false safely
        assertFalse(api.CheckIfImageExists("any_image"));
    }

    @Test
    public void testCheckIfConnectedToInternet_NoContextReturnsFalse() {
        // Without context, it should return false safely
        assertFalse(api.CheckIfConnectedToInternet());
    }
}
