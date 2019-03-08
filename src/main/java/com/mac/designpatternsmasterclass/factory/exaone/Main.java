package com.mac.designpatternsmasterclass.factory.exaone;

import com.mac.designpatternsmasterclass.factory.exaone.jamaican.JamaicanHamburgerStore;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger;

        HamburgerStore hamburgerStore = new JamaicanHamburgerStore();

        hamburger = hamburgerStore.order("cheese");

        hamburger = hamburgerStore.order("jamaican");


    }

}
