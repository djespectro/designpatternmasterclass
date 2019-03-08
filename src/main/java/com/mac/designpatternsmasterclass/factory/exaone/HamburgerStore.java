package com.mac.designpatternsmasterclass.factory.exaone;

public abstract class HamburgerStore {

    protected abstract Hamburger createHamburger(String type);

    public Hamburger order(String type){

        Hamburger hamburger = createHamburger(type);

        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }

}
