package com.mac.designpatternsmasterclass.adapter.exathree;

import com.mac.designpatternsmasterclass.adapter.exathree.library.MediaType;
import com.mac.designpatternsmasterclass.adapter.exathree.library.Song;
import com.mac.designpatternsmasterclass.adapter.exathree.player.*;

import java.util.List;

public class DeviceMediaPlayer {

    private MediaPlayer mediaPlayer;

    public void play(List<Song> songs){
        songs.forEach(this::play);
    }

    public void play(Song song){
        mediaPlayer = getPlayerByType(song.getMediaType());
        mediaPlayer.play(song.getSongName());
    }

    private MediaPlayer getPlayerByType(MediaType mediaType){
        switch (mediaType){
            case MP3:
                return new Mp3MediaPlayer();
            case MP4:
                return new MP4MediaPlayer();
            case VLC:
                return new VLCMediaPlayerAdapter(new VLCMediaPlayer());
             default:
                 throw new IllegalArgumentException("Media Type Not Found.");
        }
    }

}
