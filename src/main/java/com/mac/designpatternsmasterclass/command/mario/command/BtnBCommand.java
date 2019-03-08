package com.mac.designpatternsmasterclass.command.mario.command;

import com.mac.designpatternsmasterclass.command.Command;
import com.mac.designpatternsmasterclass.command.mario.MarioGame;

public class BtnBCommand implements Command {

    private MarioGame marioGame;

    public BtnBCommand(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    @Override
    public void execute() {
        marioGame.btnBPressed();
    }

}
