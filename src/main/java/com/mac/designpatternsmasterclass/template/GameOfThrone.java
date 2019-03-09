package com.mac.designpatternsmasterclass.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class GameOfThrone extends TemplateGame {

    public GameOfThrone() {
        addNewCharacter = true;
    }

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
        try {
            if (wantNewCharacter()) {
                System.out.println("Adding new Character to the game.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't read response. {}", e.getCause());
        }
    }

    private boolean wantNewCharacter() throws IOException {
        System.out.println("Would you like to add a new Character to the game? (y/n): ");

        String answer;
        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            answer = bufferedReader.readLine();
        }

        return answer.toLowerCase().contains("y");
    }

}
