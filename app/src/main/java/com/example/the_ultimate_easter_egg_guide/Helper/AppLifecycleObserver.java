package com.example.the_ultimate_easter_egg_guide.Helper;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import com.example.the_ultimate_easter_egg_guide.Models.Notifications.Notifications;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;

import java.util.concurrent.TimeUnit;

public class AppLifecycleObserver implements DefaultLifecycleObserver {

    private final Context context;

    public AppLifecycleObserver(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        // App enters foreground
        MusicManager.getInstance(context).resumeMusic();
    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        // App enters background
        MusicManager.getInstance(context).pauseMusic();
        
        if (PageController_BaseClass.ENABLE_TESTING) {
            Data inputData = new Data.Builder()
                    .putString(NotificationWorker.KEY_NOTIFICATION_NAME, Notifications.TEST.name())
                    .build();

            OneTimeWorkRequest workRequest = new OneTimeWorkRequest.Builder(NotificationWorker.class)
                    .setInitialDelay(10, TimeUnit.SECONDS)
                    .setInputData(inputData)
                    .build();

            WorkManager.getInstance(context).enqueue(workRequest);
        }
    }
}
