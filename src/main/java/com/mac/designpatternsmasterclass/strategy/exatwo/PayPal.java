package com.mac.designpatternsmasterclass.strategy.exatwo;

public class PayPal implements Payment {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.print("Processing payment by user [" + email);
        System.out.println("], total: $" + amount);
    }

}
