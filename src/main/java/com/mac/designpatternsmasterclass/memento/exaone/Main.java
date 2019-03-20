package com.mac.designpatternsmasterclass.memento.exaone;

public class Main {

    public static void main(String[] args) {

        Originator originator;
        Momento momento;
        CareTaker careTaker = new CareTaker();

        originator = new Originator("State One");
        momento = originator.createMomento();
        careTaker.addMomento(momento);

        originator.setState("State Two");
        momento = originator.createMomento();
        careTaker.addMomento(momento);

        originator.setState("State Three");
        momento = originator.createMomento();
        careTaker.addMomento(momento);


        originator.setState("State Four");

        System.out.println("Current state: " + originator.getState());

        momento = careTaker.getMomento(2);
        originator.setMomento(momento);
        System.out.println("Previews state: " + originator.getState());

        momento = careTaker.getMomento(1);
        originator.setMomento(momento);
        System.out.println("Previews state: " + originator.getState());

        momento = careTaker.getMomento(0);
        originator.setMomento(momento);
        System.out.println("Previews state: " + originator.getState());


    }

}
