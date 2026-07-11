package com.example.the_ultimate_easter_egg_guide.Helper;

import android.app.Activity;
import android.content.Intent;
import android.transition.Fade;
import android.view.Window;
import androidx.core.app.ActivityOptionsCompat;

public class PageTransitionManager {

    /**
     * Set the transition speed here.
     * 0.0 is the slowest (1 second duration)
     * 1.0 is the fastest (almost 0 second duration)
     */
    public static float FADE_SPEED = 0.5f;

    public static void setupTransitions(Activity activity) {
        setupTransitions(activity, new int[0]);
    }

    public static void setupTransitions(Activity activity, int... excludedIds) {
        // Calculate duration based on speed (0.0 to 1.0)
        // 0.0 -> 1000ms
        // 1.0 -> 0ms
        long duration = (long) (1000 * (1.0f - FADE_SPEED));

        Window window = activity.getWindow();
        
        Fade fade = new Fade();
        fade.setDuration(duration);

        if (excludedIds != null) {
            for (int id : excludedIds) {
                if (id != 0) {
                    fade.excludeTarget(id, true);
                }
            }
        }

        window.setEnterTransition(fade);
        window.setExitTransition(fade);
        window.setReenterTransition(fade);
        window.setReturnTransition(fade);
        
        // Ensure the activity doesn't overlap transitions
        window.setAllowEnterTransitionOverlap(true);
        window.setAllowReturnTransitionOverlap(true);
    }

    public static void startActivityWithFade(Activity currentActivity, Class<?> targetClass) {
        Intent intent = new Intent(currentActivity, targetClass);
        startActivityWithFade(currentActivity, intent);
    }

    public static void startActivityWithFade(Activity currentActivity, Intent intent) {
        // Remove the NO_ANIMATION flag to allow transitions
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(currentActivity);
        currentActivity.startActivity(intent, options.toBundle());
    }
}
