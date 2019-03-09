package com.mac.designpatternsmasterclass.adapter.exathree.library;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary {

    List<Song> songList;

    public MediaLibrary() {
        defaultSongs();
    }

    private void defaultSongs(){
        songList = new ArrayList<>();
        songList.add(new Song("beyond the horizon.mp3", MediaType.MP3));
        songList.add(new Song("alone.mp4", MediaType.MP4));
        songList.add(new Song("far far away.vlc", MediaType.VLC));
    }

    public void addSong(Song song){
        songList.add(song);
    }

    public List<Song> getSongList(){
        return new ArrayList<>(songList);
    }

}
