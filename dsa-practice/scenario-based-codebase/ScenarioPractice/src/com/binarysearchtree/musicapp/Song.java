package com.binarysearchtree.musicapp;

public class Song {
    private int trackId;
    private String title;
    private String artist;

    public Song(int trackId, String title, String artist) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
