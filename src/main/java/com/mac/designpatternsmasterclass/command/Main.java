package com.mac.designpatternsmasterclass.command;

import com.mac.designpatternsmasterclass.command.mario.MarioGame;
import com.mac.designpatternsmasterclass.command.mario.command.*;

public class Main {

    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame("Player One");

        GameBoy gameBoy = new GameBoy(
          new UpCommand(marioGame),
          new DownCommand(marioGame),
          new LeftCommand(marioGame),
          new RightCommand(marioGame),
          new BtnACommand(marioGame) ,
          new BtnBCommand(marioGame)
        );

        gameBoy.arrowRight();
        gameBoy.arrowRight();
        gameBoy.arrowUp();
        gameBoy.btnA();
        gameBoy.arrowDown();
        gameBoy.arrowRight();

    }

}
