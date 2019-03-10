package com.mac.designpatternsmasterclass.state.states;

import com.mac.designpatternsmasterclass.state.SodaVendingMachine;
import com.mac.designpatternsmasterclass.state.State;

public class HasMoneyState implements State {

    private final SodaVendingMachine machine;

    public HasMoneyState(SodaVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money has already inserted!");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Please take your money.");
        machine.setState(machine.getNoMoneyState());
    }

    @Override
    public void select() {
        System.out.println("Soda is been dispatching.");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.printf("Soda has not been dispensed.");
    }

}
