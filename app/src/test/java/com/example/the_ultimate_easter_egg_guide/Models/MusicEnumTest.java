package com.example.the_ultimate_easter_egg_guide.Models;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MusicEnumTest {

    @Test
    public void testEnumInitialization() {
        for (Music music : Music.values()) {
            assertNotNull("Display name should not be null for " + music.name(), music.displayName);
            assertTrue("Song ID should be a valid resource ID for " + music.name(), music.songID != 0);
        }
    }
}
