package com.example.the_ultimate_easter_egg_guide.Helper;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;

import com.example.the_ultimate_easter_egg_guide.Models.Music;
import com.example.the_ultimate_easter_egg_guide.R;

public class MusicManager {
    private static final String PREFS_NAME = "AppPrefs";
    private static final String KEY_MUSIC_ENABLED = "AudioEnabled";
    private static final String KEY_SELECTED_SONG = "SelectedSong";
    
    private static MusicManager instance;
    private final Context context;
    private MediaPlayer mediaPlayer;
    private final SharedPreferences prefs;
    private ValueAnimator fadeAnimator;

    private MusicManager(Context context) {
        this.context = context.getApplicationContext();
        this.prefs = this.context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public static synchronized MusicManager getInstance(Context context) {
        if (instance == null) {
            instance = new MusicManager(context);
        }
        return instance;
    }

    public boolean isMusicEnabled() {
        return prefs.getBoolean(KEY_MUSIC_ENABLED, true);
    }

    public Music getSelectedSong() {
        String songName = prefs.getString(KEY_SELECTED_SONG, Music.DAMNED_BOIII.name());
        try {
            return Music.valueOf(songName);
        } catch (Exception e) {
            return Music.DAMNED_BOIII;
        }
    }

    public void playMusic() {
        if (!isMusicEnabled()) return;
        if ("robolectric".equals(android.os.Build.FINGERPRINT)) return;

        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(context, getSelectedSong().songID);
            if (mediaPlayer == null) return;
            mediaPlayer.setLooping(true);
            mediaPlayer.setVolume(1.0f, 1.0f);
        }

        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }

    public void setSong(Music song) {
        prefs.edit().putString(KEY_SELECTED_SONG, song.name()).apply();
        boolean wasPlaying = mediaPlayer != null && mediaPlayer.isPlaying();
        
        stopMusic();
        
        if (wasPlaying || isMusicEnabled()) {
            playMusic();
        }
    }

    public void stopMusic() {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void pauseMusic() {
        fadeOutPause();
    }

    public void resumeMusic() {
        fadeInResume();
    }

    public void toggleMusic(boolean enabled) {
        prefs.edit().putBoolean(KEY_MUSIC_ENABLED, enabled).apply();
        if (enabled) {
            playMusic();
            fadeInResume();
        } else {
            fadeOutPause();
        }
    }

    public void fadeOutPause() {
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) return;

        if (fadeAnimator != null) fadeAnimator.cancel();

        fadeAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
        fadeAnimator.setDuration(500);
        fadeAnimator.addUpdateListener(animation -> {
            float volume = (float) animation.getAnimatedValue();
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(volume, volume);
            }
        });

        fadeAnimator.addListener(new android.animation.AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                }
            }
        });
        fadeAnimator.start();
    }

    public void fadeInResume() {
        if (!isMusicEnabled()) return;

        if (mediaPlayer == null) {
            playMusic();
            // playMusic starts at 1.0, so we should immediately set to 0 and fade
            if (mediaPlayer != null) mediaPlayer.setVolume(0, 0);
        }

        if (fadeAnimator != null) fadeAnimator.cancel();

        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }

        fadeAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        fadeAnimator.setDuration(500);
        fadeAnimator.addUpdateListener(animation -> {
            float volume = (float) animation.getAnimatedValue();
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(volume, volume);
            }
        });
        fadeAnimator.start();
    }
}
