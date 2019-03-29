package com.mac.designpatternsmasterclass.chainofresponsability;

public class DirectorPurchasePower extends PurchasePower{

    @Override
    protected double getAllowed() {
        return BASE * 10;
    }

    @Override
    protected String getRole() {
        return "Director";
    }
}
