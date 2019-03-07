package com.mac.designpatternsmasterclass.observer.exatwo;

public class NotificationCardObserver implements Observer<Status> {

    @Override
    public void update(Status status) {
        System.out.println("Status has a new value: " + status + "... Updating Card!");
    }
}
