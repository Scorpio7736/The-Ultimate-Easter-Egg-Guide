package com.example.the_ultimate_easter_egg_guide.Models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.List;

public class GamesTest {

    @Test
    public void testGetAllGamesBetween() {
        // Test a standard range
        // subList is inclusive of start and exclusive of end
        List<games> range = games.GetAllGamesBetween(games.World_At_War, games.Black_Ops_II);
        
        assertEquals(2, range.size());
        assertTrue(range.contains(games.World_At_War));
        assertTrue(range.contains(games.Black_Ops_I));
        assertTrue(!range.contains(games.Black_Ops_II));
    }

    @Test
    public void testGetAllGamesBetween_SameStartAndEnd() {
        // Range where start equals end should return empty list
        List<games> range = games.GetAllGamesBetween(games.Black_Ops_I, games.Black_Ops_I);
        assertTrue(range.isEmpty());
    }

    @Test
    public void testGetAllGamesBetween_FullRange() {
        // From first to after last (subList(0, size))
        // Since we don't have an "end" after the last one, we can't easily test "all" without knowing the next index
        // But we can test from start to the very last one
        List<games> range = games.GetAllGamesBetween(games.Test, games.Black_Ops_VII);
        
        // It should include everything except Black_Ops_VII
        assertEquals(games.gamesList.size() - 1, range.size());
        assertTrue(!range.contains(games.Black_Ops_VII));
    }

    @Test
    public void testEnumValues() {
        assertEquals("World at War", games.World_At_War.gameName);
        assertEquals("Black Ops 1", games.Black_Ops_I.gameName);
    }
}
