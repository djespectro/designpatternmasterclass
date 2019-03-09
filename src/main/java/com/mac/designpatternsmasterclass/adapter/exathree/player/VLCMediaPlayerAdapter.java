package com.mac.designpatternsmasterclass.adapter.exathree.player;

public class VLCMediaPlayerAdapter implements MediaPlayer {

    private VLCMediaPlayer vlcMediaPlayer;

    public VLCMediaPlayerAdapter(VLCMediaPlayer vlcMediaPlayer) {
        this.vlcMediaPlayer = vlcMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        vlcMediaPlayer.start(fileName);
    }

}
