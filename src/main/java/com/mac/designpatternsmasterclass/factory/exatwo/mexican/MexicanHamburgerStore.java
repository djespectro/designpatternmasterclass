package com.mac.designpatternsmasterclass.factory.exatwo.mexican;

import com.mac.designpatternsmasterclass.factory.exatwo.Hamburger;
import com.mac.designpatternsmasterclass.factory.exatwo.HamburgerStore;

public class MexicanHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {

        switch (type){
            case "jalapeno":
                return new MexicanJalapenoBurger();
            case "chilaquiles":
                return new ChilaquileBurger();
            default:
                throw new IllegalArgumentException("Selected Hamburger type does not exists.");
        }

    }
}
