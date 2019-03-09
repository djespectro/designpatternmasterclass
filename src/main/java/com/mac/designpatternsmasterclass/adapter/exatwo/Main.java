package com.mac.designpatternsmasterclass.adapter.exatwo;

public class Main {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();
        System.out.println();

        System.out.println("ToyDuck...");
        toyDuck.squeak();
        System.out.println();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
        System.out.println();

    }

}
