package com.example.the_ultimate_easter_egg_guide.Models.Notifications;

public enum Notifications
{
    TEST(NotificationType.TEST,"TEST NOTIFICATION", "THIS IS A TEST TO ENSURE NOTIFICATION SYSTEM WORKS", 12, 0),
    STANDARD_REMINDER(NotificationType.DAILY,"You know what time it is!", "", 13, 15),

    ;

    public final NotificationType notificationType;
    public final String notificationTitle;
    public final String notificationMsg;
    public final int hour;
    public final int minute;
    Notifications(NotificationType notificationType, String notificationTitle, String notificationMsg, int hour, int minute)
    {
        this.notificationType = notificationType;
        this.notificationTitle = notificationTitle;
        this.notificationMsg = notificationMsg;
        this.hour = hour;
        this.minute = minute;
    }
}
