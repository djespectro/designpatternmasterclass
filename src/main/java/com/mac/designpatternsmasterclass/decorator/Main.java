package com.mac.designpatternsmasterclass.decorator;

public class Main {

    public static void main(String[] args) {
        IceCream iceCream = new BasicIceCream();

        iceCream = new ChocolateIceCream(iceCream);

        iceCream = new PecanIceCream(iceCream);
        System.out.println("Total: " + iceCream.cost());

    }

}
