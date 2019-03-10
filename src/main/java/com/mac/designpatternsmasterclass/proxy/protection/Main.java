package com.mac.designpatternsmasterclass.proxy.protection;

public class Main {

    public static void main(String[] args) {

        Bank bank = new ProxyBank();
        bank.withDrawMoney("John");

        System.out.println();

        bank.withDrawMoney("fox");

    }

}
