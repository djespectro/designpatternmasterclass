package com.mac.designpatternsmasterclass.strategy.exatwo;

public class Product {

    private String upcCode;
    private float price;

    public Product(String upcCode, float price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public float getPrice() {
        return price;
    }
}
