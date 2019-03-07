package com.mac.designpatternsmasterclass.decorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("- Adding Chocolate to IceCream");
    }

    @Override
    public double cost() {
        return 1.0 + super.cost();
    }
}
