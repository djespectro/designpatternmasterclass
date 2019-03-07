package com.mac.designpatternsmasterclass.observer.exaone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmailSubject implements Subject{

    private List<Observer> observerList;

    private String message;

    public EmailSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        Objects.requireNonNull(observer);
        if(!observerList.contains(observer)) observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observerList.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return message;
    }

    public void postMessage(String message){
        System.out.println("Message posted to topic: " + message);
        this.message = message;
        notifyObservers();
    }

}
