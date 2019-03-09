package com.mac.designpatternsmasterclass.template;

public class SuperMario extends TemplateGame {

    @Override
    void initialize() {
        System.out.println("Initializing.....");
    }

    @Override
    void startPlay() {
        System.out.println("Starting.........");
    }

    @Override
    void endPlay() {
        System.out.println("Ending.........");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        throw new UnsupportedOperationException();
    }

}
