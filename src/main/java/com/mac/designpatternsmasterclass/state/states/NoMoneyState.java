package com.mac.designpatternsmasterclass.state.states;

import com.mac.designpatternsmasterclass.state.SodaVendingMachine;
import com.mac.designpatternsmasterclass.state.State;

public class NoMoneyState implements State {

    private final SodaVendingMachine machine;

    public NoMoneyState(SodaVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money has been received.");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("Money has not be inserted.");
    }

    @Override
    public void select() {
        System.out.println("Money has not be inserted.");
    }

    @Override
    public void dispense() {
        System.out.println("Money has not be inserted.");
    }

}
