package com.mac.designpatternsmasterclass.observer.exatwo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Observable {

    private boolean changed = false;
    private Set<Observer> observers;
    private Object object;

    public Observable() {
        this.observers = new HashSet<>();
    }

    private void notifyObservers(){
        if (!changed) return;

        observers.forEach(observer -> {
            observer.update(object);
        });
    }

    public synchronized void addObserver(Observer observer) {
        Objects.requireNonNull(observer);
        observers.add(observer);
    }

    public synchronized void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void update(Object object){
        this.object = object;
        changed = true;
        notifyObservers();
    }

}
