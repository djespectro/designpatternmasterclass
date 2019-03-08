package com.mac.designpatternsmasterclass.factory.exatwo;

public abstract class HamburgerStore implements Store {

    protected abstract Hamburger createHamburger(String type);

    public Hamburger order(String type){

        Hamburger hamburger = createHamburger(type);

        hamburger.prepare();

        hamburger.cook();

        hamburger.box();

        System.out.println("---------------------------------");

        return hamburger;
    }

}
