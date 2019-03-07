package com.mac.designpatternsmasterclass.decorator;

public class BasicIceCream implements IceCream{

    public BasicIceCream() {
        System.out.println("- Creating a basic IceCream");
    }

    @Override
    public double cost() {
        return .50;
    }

}
