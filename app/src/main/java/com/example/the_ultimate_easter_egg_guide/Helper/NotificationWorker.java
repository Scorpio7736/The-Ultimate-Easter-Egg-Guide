package com.example.the_ultimate_easter_egg_guide.Helper;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.example.the_ultimate_easter_egg_guide.Models.Notifications.Notifications;

public class NotificationWorker extends Worker {

    public static final String KEY_NOTIFICATION_NAME = "KEY_NOTIFICATION_NAME";

    public NotificationWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        String name = getInputData().getString(KEY_NOTIFICATION_NAME);
        if (name == null) return Result.failure();

        try {
            Notifications notification = Notifications.valueOf(name);
            NotificationHelper.sendNotification(getApplicationContext(), notification);
            return Result.success();
        } catch (IllegalArgumentException e) {
            return Result.failure();
        }
    }
}
