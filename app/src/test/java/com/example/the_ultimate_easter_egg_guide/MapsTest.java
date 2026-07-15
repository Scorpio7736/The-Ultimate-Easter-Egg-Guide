package com.example.the_ultimate_easter_egg_guide;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MapsTest {
    @Test
    public void testGetMapsForGame() {
        List<Maps> wawMaps = MapsWarehouse.getMapsForGame(Games.World_At_War);
        assertNotNull(wawMaps);
        assertFalse(wawMaps.isEmpty());
        
        for (Maps map : wawMaps) {
            assertEquals(Games.World_At_War, map.gameName);
        }
    }

    @Test
    public void testMapProperties() {
        Maps map = Maps.WAW_Nacht_Der_Untoten;
        assertEquals("Nacht der Untoten", map.mapName);
        assertTrue(map.mapDescription > 0);
        assertTrue(map.mapCover > 0);
    }
}
