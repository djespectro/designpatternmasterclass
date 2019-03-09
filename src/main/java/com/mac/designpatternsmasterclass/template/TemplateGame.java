package com.mac.designpatternsmasterclass.template;

public abstract class TemplateGame implements Game {

    protected boolean addNewCharacter;

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Hooked on Template method.
    protected abstract void addNewCharacterToTheGame();

    // Template method
    public void play(){
        loadAssets();
        initialize();
        startPlay();

        if(addNewCharacter){
            addNewCharacterToTheGame();
        }

        endPlay();
    }

    void loadAssets(){
        System.out.println("Loading Assets...");
    }

}
