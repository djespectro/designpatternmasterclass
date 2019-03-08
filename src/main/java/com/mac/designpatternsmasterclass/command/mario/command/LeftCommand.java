package com.mac.designpatternsmasterclass.command.mario.command;

import com.mac.designpatternsmasterclass.command.Command;
import com.mac.designpatternsmasterclass.command.mario.MarioGame;

public class LeftCommand implements Command {

    private MarioGame marioGame;

    public LeftCommand(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    @Override
    public void execute() {
        marioGame.moveLeft();
    }

}
