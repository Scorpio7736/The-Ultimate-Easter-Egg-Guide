package com.example.the_ultimate_easter_egg_guide.MapData;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import org.junit.Test;
import static org.junit.Assert.*;

public class StorylineMapsWarehouseTest {

    @Test
    public void testWAW_Maps() {
        assertFalse(MapsWarehouse.WAW_Maps.isEmpty());
        for (Maps map : MapsWarehouse.WAW_Maps) {
            assertEquals(Games.World_At_War, map.gameName);
        }
    }

    @Test
    public void testBOI_Maps() {
        assertFalse(MapsWarehouse.BOI_Maps.isEmpty());
        for (Maps map : MapsWarehouse.BOI_Maps) {
            assertEquals(Games.Black_Ops_I, map.gameName);
        }
    }

    @Test
    public void testBOII_Maps() {
        assertFalse(MapsWarehouse.BOII_Maps.isEmpty());
        for (Maps map : MapsWarehouse.BOII_Maps) {
            assertEquals(Games.Black_Ops_II, map.gameName);
        }
    }

    @Test
    public void testBOIII_Maps() {
        assertFalse(MapsWarehouse.BOIII_Maps.isEmpty());
        for (Maps map : MapsWarehouse.BOIII_Maps) {
            assertEquals(Games.Black_Ops_III, map.gameName);
        }
    }

    @Test
    public void testBOIV_Maps() {
        assertFalse(MapsWarehouse.BOIV_Maps.isEmpty());
        for (Maps map : MapsWarehouse.BOIV_Maps) {
            assertEquals(Games.Black_Ops_IV, map.gameName);
        }
    }

    @Test
    public void testBOCW_Maps() {
        assertFalse(MapsWarehouse.BOCW_Maps.isEmpty());
        for (Maps map : MapsWarehouse.BOCW_Maps) {
            assertEquals(Games.Black_Ops_Cold_War, map.gameName);
        }
    }

    @Test
    public void testBOVI_Maps() {
        assertFalse(MapsWarehouse.BOVI_Maps.isEmpty());
        for (Maps map : MapsWarehouse.BOVI_Maps) {
            assertEquals(Games.Black_Ops_VI, map.gameName);
        }
    }

    @Test
    public void testBOVII_Maps() {
        assertFalse(MapsWarehouse.BOVII_Maps.isEmpty());
        for (Maps map : MapsWarehouse.BOVII_Maps) {
            assertEquals(Games.Black_Ops_VII, map.gameName);
        }
    }

    @Test
    public void testTest_Maps() {
        assertFalse(MapsWarehouse.Test_Maps.isEmpty());
        for (Maps map : MapsWarehouse.Test_Maps) {
            assertEquals(Games.Test, map.gameName);
        }
    }

    @Test
    public void testAll_Maps() {
        assertEquals(Maps.values().length, MapsWarehouse.All_Maps.size());
    }

    @Test
    public void testGetMapsForGame() {
        assertEquals(MapsWarehouse.WAW_Maps, MapsWarehouse.getMapsForGame(Games.World_At_War));
        assertEquals(MapsWarehouse.BOI_Maps, MapsWarehouse.getMapsForGame(Games.Black_Ops_I));
        assertTrue(MapsWarehouse.getMapsForGame(null).isEmpty());
    }

    @Test
    public void testAll_Images() {
        long expectedSize = MapsWarehouse.All_Maps.stream()
                .filter(map -> map.gameName != Games.Test && map.mapCover != com.example.the_ultimate_easter_egg_guide.R.drawable.app_icon)
                .count();
        assertEquals(expectedSize, MapsWarehouse.All_Images.size());
    }
}
