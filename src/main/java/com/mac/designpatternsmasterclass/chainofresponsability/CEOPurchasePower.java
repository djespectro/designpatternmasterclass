package com.mac.designpatternsmasterclass.chainofresponsability;

public class CEOPurchasePower extends PurchasePower{

    @Override
    protected double getAllowed() {
        return BASE * 100;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }

}
