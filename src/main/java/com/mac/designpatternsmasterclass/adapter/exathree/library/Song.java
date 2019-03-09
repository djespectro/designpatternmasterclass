package com.mac.designpatternsmasterclass.adapter.exathree.library;

public class Song {

    private String songName;
    private MediaType mediaType;

    public Song(String songName, MediaType mediaType) {
        this.songName = songName;
        this.mediaType = mediaType;
    }

    public String getSongName() {
        return songName;
    }

    public MediaType getMediaType() {
        return mediaType;
    }
}
