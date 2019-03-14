package com.mac.designpatternsmasterclass.factory.exathree;

import java.util.Date;

public class Notification {

    private DeviceType deviceType;
    private Date date;

    public Notification(DeviceType deviceType, Date date) {
        this.deviceType = deviceType;
        this.date = date;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "deviceType=" + deviceType +
                ", date=" + date +
                '}';
    }
}
