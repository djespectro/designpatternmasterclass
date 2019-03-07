package com.mac.designpatternsmasterclass.strategy.exaone;

import com.mac.designpatternsmasterclass.strategy.exaone.Balloon;
import com.mac.designpatternsmasterclass.strategy.exaone.Clown;
import com.mac.designpatternsmasterclass.strategy.exaone.ScoreBoard;
import com.mac.designpatternsmasterclass.strategy.exaone.SquareBalloon;

public class Main {

    public static void main(String[] args) {

        ScoreBoard scoreBoard;
        int taps = 10;
        int multuPlayer = 5;

        scoreBoard = new ScoreBoard(new Balloon());
        scoreBoard.showScore(taps, multuPlayer);

        scoreBoard = new ScoreBoard(new Clown());
        scoreBoard.showScore(taps, multuPlayer);

        scoreBoard = new ScoreBoard(new SquareBalloon());
        scoreBoard.showScore(taps, multuPlayer);

    }

}
