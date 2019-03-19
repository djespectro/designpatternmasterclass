package com.mac.designpatternsmasterclass.mediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();

        Aircraft aircraftOne = new AircraftImpl(mediator, "Wild Lion");
        Aircraft aircraftTwo = new AircraftImpl(mediator, "Pink Panther");
        Aircraft aircraftThree = new AircraftImpl(mediator, "White Elephant");

        mediator.addAircraft(aircraftOne);
        mediator.addAircraft(aircraftTwo);
        mediator.addAircraft(aircraftThree);

        aircraftOne.send("Hello everyone");
        aircraftTwo.send("Hi Wild Lion!");
        aircraftThree.send("Hey guys!");

    }

}
