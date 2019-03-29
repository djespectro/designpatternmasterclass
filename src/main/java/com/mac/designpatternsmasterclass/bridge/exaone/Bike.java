package com.mac.designpatternsmasterclass.bridge.exaone;

// Refine abstraction 2 in bridge pattern
public class Bike extends Vehicle {

    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Preparing Bike Manufacture...");
        workshop1.work();
        workshop2.work();
    }
}