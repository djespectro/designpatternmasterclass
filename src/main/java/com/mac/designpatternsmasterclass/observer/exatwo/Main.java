package com.mac.designpatternsmasterclass.observer.exatwo;

public class Main {

    public static void main(String[] args) {

        Observable observable = new Observable();
        Observer notificationCardObserver = new NotificationCardObserver();
        Observer emailNotificationObserver = new EmailNotificationObserver();

        observable.addObserver(notificationCardObserver);
        observable.addObserver(emailNotificationObserver);
        observable.update(Status.ALARM);

    }

}
