package com.mac.designpatternsmasterclass.facade;

import com.mac.designpatternsmasterclass.facade.hardware.CPU;
import com.mac.designpatternsmasterclass.facade.hardware.Fan;
import com.mac.designpatternsmasterclass.facade.hardware.HardDrive;
import com.mac.designpatternsmasterclass.facade.hardware.RAM;

public class ComputerFacade {

    private RAM ram;
    private HardDrive hardDrive;
    private CPU cpu;
    private Fan fan;


    public ComputerFacade(){
        ram = new RAM();
        hardDrive = new HardDrive();
        cpu = new CPU();
        fan = new Fan();
    }

    public void start(){
        fan.start();
        byte[] bootAddress = hardDrive.getData(0);
        ram.loadData(bootAddress);
        cpu.processData(ram, 0);
        //...
        //..
        //..
    }

}
