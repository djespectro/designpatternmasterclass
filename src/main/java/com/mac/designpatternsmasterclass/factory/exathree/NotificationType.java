package com.mac.designpatternsmasterclass.factory.exathree;

public abstract class NotificationType {

    protected Notification notification;
    protected NotificationLevel level;
    protected String device;
    protected float value;

    public NotificationType(String device, float value) {
        this.device = device;
        this.value = value;
    }

    @Override
    public String toString() {
        return "NotificationType{" +
                "notification=" + notification +
                ", level=" + level +
                ", device='" + device + '\'' +
                ", value=" + value +
                '}';
    }
}


