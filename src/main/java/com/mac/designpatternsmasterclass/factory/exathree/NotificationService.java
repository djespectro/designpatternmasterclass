package com.mac.designpatternsmasterclass.factory.exathree;

import com.mac.designpatternsmasterclass.factory.exathree.source.Metric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class NotificationService {

    protected abstract NotificationType getNotificationType(String device, float value);

    Map<NotificationLevel, List<Notification>> notifications = new HashMap<>();

    public Map<NotificationLevel, List<Notification>> translate(List<Metric> metrics) {

        List<Notification> alarmNotification = new ArrayList<>();
        List<Notification> warningNotification = new ArrayList<>();

        metrics.forEach(metric -> {

            NotificationType notificationType = getNotificationType(metric.getDevice(), metric.getValue());

            if (notificationType.level != null) {
                switch (notificationType.level) {
                    case ALARM:
                        alarmNotification.add(notificationType.notification);
                        break;
                    case WARNING:
                        warningNotification.add(notificationType.notification);
                        break;
                }
            }

        });

        notifications.put(NotificationLevel.ALARM, alarmNotification);
        notifications.put(NotificationLevel.WARNING, warningNotification);

        return new HashMap<>(notifications);
    }

}
