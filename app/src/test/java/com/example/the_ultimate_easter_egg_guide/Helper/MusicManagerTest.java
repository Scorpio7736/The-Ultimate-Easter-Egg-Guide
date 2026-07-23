package com.example.the_ultimate_easter_egg_guide.Helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.Models.Music;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class MusicManagerTest {

    private Context context;
    private MusicManager musicManager;

    @Before
    public void setUp() {
        context = ApplicationProvider.getApplicationContext();
        musicManager = MusicManager.getInstance(context);
    }

    @Test
    public void testSingleton() {
        assertNotNull(musicManager);
        assertEquals(musicManager, MusicManager.getInstance(context));
    }

    @Test
    public void testToggleMusic() {
        musicManager.toggleMusic(true);
        assertTrue(musicManager.isMusicEnabled());

        musicManager.toggleMusic(false);
        assertTrue(!musicManager.isMusicEnabled());
    }

    @Test
    public void testSetAndGetSong() {
        musicManager.setSong(Music.DAMNED_BOII);
        assertEquals(Music.DAMNED_BOII, musicManager.getSelectedSong());

        musicManager.setSong(Music.DAMNED_BOIII);
        assertEquals(Music.DAMNED_BOIII, musicManager.getSelectedSong());
    }
}
