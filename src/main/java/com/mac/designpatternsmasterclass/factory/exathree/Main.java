package com.mac.designpatternsmasterclass.factory.exathree;

import com.mac.designpatternsmasterclass.factory.exathree.source.Metric;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static NotificationImpl service = new NotificationImpl();

    public static void main(String[] args) {

        List<Metric> metrics = new ArrayList<>();
        metrics.add(new Metric(10, "di"));
        metrics.add(new Metric(100, "di"));
        metrics.add(new Metric(20, "uv"));
        metrics.add(new Metric(18, "uf"));

        service.translate(metrics)
                .forEach((notificationLevel, notifications) -> {
                    System.out.println(notificationLevel + " -> " + notifications);
                });

    }

}
