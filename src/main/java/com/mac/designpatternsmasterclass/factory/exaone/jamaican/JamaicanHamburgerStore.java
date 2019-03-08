package com.mac.designpatternsmasterclass.factory.exaone.jamaican;

import com.mac.designpatternsmasterclass.factory.exaone.Hamburger;
import com.mac.designpatternsmasterclass.factory.exaone.HamburgerStore;

public class JamaicanHamburgerStore extends HamburgerStore {

    @Override
    protected Hamburger createHamburger(String type) {
        switch (type) {
            case "cheese":
                return new JamaicanCheeseBurger();
            case "jamaican":
                return new JamaicanBurger();
            default: throw new IllegalArgumentException("Hamburger type does not exists.");
        }

    }
}
