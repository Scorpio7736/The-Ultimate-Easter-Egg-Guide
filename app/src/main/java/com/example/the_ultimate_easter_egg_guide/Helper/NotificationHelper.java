package com.example.the_ultimate_easter_egg_guide.Helper;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.the_ultimate_easter_egg_guide.Models.Notifications.Notifications;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.R;

public class NotificationHelper {

    private static final String CHANNEL_ID = "ultimate_easter_egg_guide_notifications";
    private static final String CHANNEL_NAME = "General Notifications";
    private static final String CHANNEL_DESC = "Notifications for the Ultimate Easter Egg Guide app";

    public static void createNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(CHANNEL_DESC);
            NotificationManager manager = context.getSystemService(NotificationManager.class);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
    }

    public static void sendNotification(Context context, Notifications notification) {
        Intent intent = new Intent(context, Home_PAGE.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        
        // FLAG_IMMUTABLE is required for PendingIntents starting from Android 12
        // Since minSdk is 24 (higher than Marshmallow), we can safely use it.
        PendingIntent pendingIntent = PendingIntent.getActivity(
                context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.apothicon_pfp)
                .setContentTitle(notification.notificationTitle)
                .setContentText(notification.notificationMsg)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        try {
            notificationManager.notify(1, builder.build());
        } catch (SecurityException e) {
            // Permission not granted
        }
    }
}
