package com.mac.designpatternsmasterclass.state.states;

import com.mac.designpatternsmasterclass.state.SodaVendingMachine;
import com.mac.designpatternsmasterclass.state.State;

public class SoldOutState implements State {

    private final SodaVendingMachine machine;

    public SoldOutState(SodaVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine out of service.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Please insert money before.");
    }

    @Override
    public void select() {
        System.out.println("Machine out of service.");
    }

    @Override
    public void dispense() {
        System.out.println("Machine out of service.");
    }

}
