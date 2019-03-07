package com.mac.designpatternsmasterclass.strategy.exatwo;

public class Main {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(new Product("P1", 20));
        shoppingCart.addProduct(new Product("P2", 30));
        shoppingCart.addProduct(new Product("P3", 10));

        shoppingCart.pay(new CreditCard(1111_2222_3333_4444L));

        shoppingCart.pay(new PayPal("nickname@paypal.com"));

    }

}
