package com.mac.designpatternsmasterclass.factory.exatwo;

import com.mac.designpatternsmasterclass.factory.exatwo.mexican.MexicanHamburgerStore;

public class SimpleFactoryStore {

    public static HamburgerStore getStore(Style style){

        switch (style){
            case MEXICAN:
                return new MexicanHamburgerStore();
             default:
                 throw new IllegalArgumentException();
        }

    }

}
