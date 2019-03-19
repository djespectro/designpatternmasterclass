package com.mac.designpatternsmasterclass.mediator;

public abstract class Aircraft {

    protected String name;
    protected Mediator mediator;

    public Aircraft(Mediator mediator, String name) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void send(String message);

    abstract void receive(String message);

}
