package com.example.the_ultimate_easter_egg_guide.Helper;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import com.example.the_ultimate_easter_egg_guide.Models.Notifications.NotificationType;
import com.example.the_ultimate_easter_egg_guide.Models.Notifications.Notifications;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class GuideApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NotificationHelper.createNotificationChannel(this);

        MusicManager.getInstance(this).playMusic();

        // Skip WorkManager initialization in Robolectric tests to avoid IllegalStateException
        if (isRobolectric()) {
            return;
        }

        ProcessLifecycleOwner.get().getLifecycle().addObserver(new AppLifecycleObserver(this));

        if (!PageController_BaseClass.ENABLE_TESTING) {
            scheduleProductionNotifications();
        } else {
            cancelProductionNotifications();
        }
    }

    private boolean isRobolectric() {
        return "robolectric".equals(android.os.Build.FINGERPRINT);
    }

    private void scheduleProductionNotifications() {
        for (Notifications n : Notifications.values()) {
            if (n.notificationType == NotificationType.DAILY) {
                scheduleDailyNotification(n);
            }
        }
    }

    private void scheduleDailyNotification(Notifications notification) {
        Calendar calendar = Calendar.getInstance();
        long now = calendar.getTimeInMillis();

        // Get target time from enum
        Calendar target = Calendar.getInstance();
        target.setTime(notification.soundoffHour);
        
        calendar.set(Calendar.HOUR_OF_DAY, target.get(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, target.get(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, target.get(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, 0);

        if (calendar.getTimeInMillis() <= now) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }

        long delay = calendar.getTimeInMillis() - now;

        Data inputData = new Data.Builder()
                .putString(NotificationWorker.KEY_NOTIFICATION_NAME, notification.name())
                .build();

        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder(
                NotificationWorker.class, 24, TimeUnit.HOURS)
                .setInitialDelay(delay, TimeUnit.MILLISECONDS)
                .setInputData(inputData)
                .build();

        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
                "prod_notification_" + notification.name(),
                ExistingPeriodicWorkPolicy.KEEP,
                workRequest);
    }

    private void cancelProductionNotifications() {
        for (Notifications n : Notifications.values()) {
            if (n.notificationType != NotificationType.TEST) {
                WorkManager.getInstance(this).cancelUniqueWork("prod_notification_" + n.name());
            }
        }
    }
}
