package com.mac.designpatternsmasterclass.state.states;

import com.mac.designpatternsmasterclass.state.SodaVendingMachine;
import com.mac.designpatternsmasterclass.state.State;

public class SoldState implements State {

    private final SodaVendingMachine machine;

    public SoldState(SodaVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Receiving money.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Soda has already been served");
    }

    @Override
    public void select() {
        System.out.println("Please, insert money for another soda.");
    }

    @Override
    public void dispense() {
        System.out.println("Please take your soda. ");

        machine.setSodasQty(machine.getSodasQty() - 1);

        if (machine.getSodasQty() > 0) {
            machine.setState(machine.getNoMoneyState());
        } else {
            machine.setState(machine.getSoldOutState());
        }
    }

}
