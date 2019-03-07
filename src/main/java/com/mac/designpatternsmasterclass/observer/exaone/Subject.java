package com.mac.designpatternsmasterclass.observer.exaone;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);

}
