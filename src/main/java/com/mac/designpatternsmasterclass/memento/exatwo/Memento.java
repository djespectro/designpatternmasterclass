package com.mac.designpatternsmasterclass.memento.exatwo;

public class Memento<T extends Cloneable> {

    private T state;

    public Memento(T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }

}
