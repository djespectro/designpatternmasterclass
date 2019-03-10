package com.mac.designpatternsmasterclass.state;

import com.mac.designpatternsmasterclass.state.states.HasMoneyState;
import com.mac.designpatternsmasterclass.state.states.NoMoneyState;
import com.mac.designpatternsmasterclass.state.states.SoldOutState;
import com.mac.designpatternsmasterclass.state.states.SoldState;

public class SodaVendingMachine implements Machin {

    int sodasQty;
    private State hasMoneyState;
    private State noMoneyState;
    private State soldOutState;
    private State soldState;
    public State state;

    public SodaVendingMachine(int sodasQty) {
        this.sodasQty = sodasQty;
        hasMoneyState = new HasMoneyState(this);
        noMoneyState = new NoMoneyState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

        if (this.sodasQty > 0) {
            state = noMoneyState;
        } else {
            state = soldOutState;
        }
    }

    // actions
    public void insertMoney() {
        state.insertMoney();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void selectSoda() {
        state.select();
    }

    public void dispense() {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getSodasQty() {
        return sodasQty;
    }

    public void setSodasQty(int sodasQty) {
        this.sodasQty = sodasQty;
    }
}
