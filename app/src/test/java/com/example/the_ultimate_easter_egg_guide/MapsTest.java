package com.example.the_ultimate_easter_egg_guide;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MapsTest {
    @Test
    public void testGetMapsForGame() {
        List<Maps> wawMaps = Maps.getMapsForGame(games.World_At_War);
        assertNotNull(wawMaps);
        assertFalse(wawMaps.isEmpty());
        
        for (Maps map : wawMaps) {
            assertEquals(games.World_At_War, map.gameName);
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
