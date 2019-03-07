package com.mac.designpatternsmasterclass.decorator;

public class PecanIceCream extends IceCreamDecorator {

    public PecanIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("- Adding Pecan to IceCream");
    }

    @Override
    public double cost() {
        return 1.5 + super.cost();
    }
}
