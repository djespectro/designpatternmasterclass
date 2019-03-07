package com.mac.designpatternsmasterclass.observer.exatwo;

public class EmailNotificationObserver implements Observer<Status>{

    @Override
    public void update(Status status) {
        System.out.println("Status has a new value: " + status + "... Sending email!");
    }

}
