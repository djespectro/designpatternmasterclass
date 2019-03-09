package com.mac.designpatternsmasterclass.template;

public class Main {

    public static void main(String[] args) {

        Game got = new GameOfThrone();
        got.play();

        System.out.println("---------------------------------------------------------");

        Game superMario = new SuperMario();
        superMario.play();

    }

}
