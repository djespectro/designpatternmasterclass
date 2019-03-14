package com.mac.designpatternsmasterclass.factory.exathree.filter;

import com.mac.designpatternsmasterclass.factory.exathree.DeviceType;
import com.mac.designpatternsmasterclass.factory.exathree.Notification;
import com.mac.designpatternsmasterclass.factory.exathree.NotificationLevel;
import com.mac.designpatternsmasterclass.factory.exathree.NotificationType;

import java.util.Date;

public class DI extends NotificationType {

    public DI(String device, float value) {
        super(device, value);
        createType();
    }

    private void createType() {
        if (value < 20) {
            level = NotificationLevel.WARNING;
        } else if (value < 10) {
            level = NotificationLevel.ALARM;
        }
        notification = new Notification(DeviceType.DI, new Date());
    }

}
