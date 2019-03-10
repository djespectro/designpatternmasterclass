package com.mac.designpatternsmasterclass.proxy.protection;

public class RealBank implements Bank {

    @Override
    public void withDrawMoney(String clientName) throws SecurityException {
        System.out.println("Thanks " + clientName + " for use ATM, please take your money.");
    }

}
