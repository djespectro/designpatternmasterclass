package com.mac.designpatternsmasterclass.strategy.exatwo;

public class CreditCard implements Payment {

    private Long cardHolder;

    public CreditCard(Long cardHolder) {
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.print("Processing payment by credit card [" + cardHolder);
        System.out.println("], total: $" + amount);
    }

}
