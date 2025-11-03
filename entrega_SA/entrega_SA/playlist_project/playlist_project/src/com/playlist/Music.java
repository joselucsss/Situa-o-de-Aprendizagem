package com.playlist;

public class Music {
    private String title;
    private String artist;
    private int durationSeconds;

    // Construtor
    public Music(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    @Override
    public String toString() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return title + " - " + artist + " (" + minutes + ":" + String.format("%02d", seconds) + ")";
    }
}
