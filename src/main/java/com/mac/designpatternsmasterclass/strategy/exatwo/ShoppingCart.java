package com.mac.designpatternsmasterclass.strategy.exatwo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void pay(Payment paymentStrategy) {
        double total = this.productList
                .stream()
                .mapToDouble(value -> value.getPrice())
                .sum();

        paymentStrategy.pay(total);
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

}
