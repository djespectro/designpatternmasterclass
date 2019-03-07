package com.mac.designpatternsmasterclass.strategy.exaone;

public class ScoreBoard {

    private Score score;

    public ScoreBoard(Score score) {
        this.score = score;
    }

    public void showScore(int taps, int multiPLayer){
        int calculateScore = score.calculateScore(taps, multiPLayer);
        System.out.println("Score: " + calculateScore);
    }

}
