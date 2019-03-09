package com.mac.designpatternsmasterclass.adapter.exathree.player;

public class Mp3MediaPlayer implements MediaPlayer{

    @Override
    public void play(String fileName) {
        System.out.println("Playing mp3 file. Name: " + fileName);
    }

}
