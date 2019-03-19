package com.mac.designpatternsmasterclass.mediator;

public class AircraftImpl extends Aircraft {

    public AircraftImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String message) {
        System.out.println("- "+name + ": Sending message-> " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    void receive(String message) {
        System.out.println("\t" + name + ": Received message-> " + message);
    }
}
