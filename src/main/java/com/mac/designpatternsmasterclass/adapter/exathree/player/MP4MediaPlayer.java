package com.mac.designpatternsmasterclass.adapter.exathree.player;

public class MP4MediaPlayer implements MediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }

}
