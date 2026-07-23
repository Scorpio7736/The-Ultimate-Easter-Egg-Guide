package com.example.the_ultimate_easter_egg_guide.Helper;

import static org.junit.Assert.assertNotNull;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import com.example.the_ultimate_easter_egg_guide.Models.Notifications.Notifications;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class NotificationHelperTest {

    @Test
    public void testCreateNotificationChannel() {
        Context context = ApplicationProvider.getApplicationContext();
        NotificationHelper.createNotificationChannel(context);
        // If it reaches here without crash, it's successful for this unit test level
    }

    @Test
    public void testSendNotification() {
        Context context = ApplicationProvider.getApplicationContext();
        // Sending a test notification should not crash
        NotificationHelper.sendNotification(context, Notifications.TEST);
    }
}
