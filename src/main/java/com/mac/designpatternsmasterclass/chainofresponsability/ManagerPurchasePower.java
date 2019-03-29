package com.mac.designpatternsmasterclass.chainofresponsability;

public class ManagerPurchasePower extends PurchasePower{

    @Override
    protected double getAllowed() {
        return BASE;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }

}
