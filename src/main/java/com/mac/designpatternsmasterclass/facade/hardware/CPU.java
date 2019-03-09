package com.mac.designpatternsmasterclass.facade.hardware;

public class CPU {

    public int loadBoot() {
        System.out.println("Loading boot...");
        return 123;
    }

    public void processData(RAM ram, int address) {
        System.out.println("Processing info loaded in ram");
    }
}
