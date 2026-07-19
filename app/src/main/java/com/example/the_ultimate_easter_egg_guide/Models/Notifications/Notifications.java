package com.example.the_ultimate_easter_egg_guide.Models.Notifications;

import java.sql.Time;

public enum Notifications
{
    TEST(NotificationType.TEST,"TEST NOTIFICATION", "THIS IS A TEST TO ENSURE NOTIFICATION SYSTEM WORKS", new Time(12, 0, 0)),
    STANDARD_REMINDER(NotificationType.DAILY,"You know what time it is!", "", new Time(13, 15, 0)),

    ;

    public NotificationType notificationType;
    public String notificationTitle;
    public String notificationMsg;
    public Time soundoffHour;
    Notifications(NotificationType notificationType, String notificationTitle, String notificationMsg, Time soundoffHour)
    {
        this.notificationType = notificationType;
        this.notificationTitle = notificationTitle;
        this.notificationMsg = notificationMsg;
        this.soundoffHour = soundoffHour;
    }
}
