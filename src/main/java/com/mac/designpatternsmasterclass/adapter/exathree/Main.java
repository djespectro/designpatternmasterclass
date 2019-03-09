package com.mac.designpatternsmasterclass.adapter.exathree;

import com.mac.designpatternsmasterclass.adapter.exathree.library.MediaLibrary;


public class Main {

    public static void main(String[] args) {

        DeviceMediaPlayer deviceMediaPlayer = new DeviceMediaPlayer();
        MediaLibrary mediaLibrary = new MediaLibrary();
        mediaLibrary.getSongList().removeAll(mediaLibrary.getSongList());
        deviceMediaPlayer.play(mediaLibrary.getSongList());

    }

}
