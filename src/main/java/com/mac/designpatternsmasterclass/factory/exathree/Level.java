package com.mac.designpatternsmasterclass.factory.exathree;

public interface Level {

    NotificationLevel getLevel(float value);

    Notification getNotification(float value);

}
