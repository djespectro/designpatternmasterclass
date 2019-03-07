package com.mac.designpatternsmasterclass.strategy.exaone;

public class SquareBalloon implements Score {

    @Override
    public int calculateScore(int taps, int multiPlayer) {
        return (taps * multiPlayer) + 40;
    }

}
