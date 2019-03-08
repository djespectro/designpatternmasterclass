package com.mac.designpatternsmasterclass.factory.exatwo;

import static com.mac.designpatternsmasterclass.factory.exatwo.Style.MEXICAN;

public class Main {

    public static void main(String[] args) {

        Store store = SimpleFactoryStore.getStore(MEXICAN);

        store.order("jalapeno");
        store.order("chilaquiles");

    }

}
