package com.mac.designpatternsmasterclass.strategy.exaone;

public class Clown implements Score {

    @Override
    public int calculateScore(int taps, int multiPlayer) {
        return (taps * multiPlayer) - 10;
    }

}
