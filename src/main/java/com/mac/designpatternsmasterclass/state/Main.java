package com.mac.designpatternsmasterclass.state;

public class Main {

    public static void main(String[] args) {

        Machin machin = new SodaVendingMachine(2);

        machin.insertMoney();
        machin.selectSoda();
        machin.dispense();

        machin.insertMoney();
        machin.selectSoda();
        machin.dispense();

        machin.insertMoney();
        machin.selectSoda();
        machin.dispense();

    }

}
