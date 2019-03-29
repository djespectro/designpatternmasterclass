package com.mac.designpatternsmasterclass.bridge.exaone;

// Refine abstraction 1 in bridge pattern
public class Car extends Vehicle {

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Preparing Car Manufacture... ");
        workshop1.work();
        workshop2.work();
    }
}
