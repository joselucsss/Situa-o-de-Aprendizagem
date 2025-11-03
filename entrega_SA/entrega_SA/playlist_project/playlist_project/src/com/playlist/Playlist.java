package com.playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Playlist {
    private String name;
    private List<Music> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public void add(Music music) {
        tracks.add(music);
    }

    public boolean remove(Music music) {
        return tracks.remove(music);
    }

    public Optional<Music> findByTitle(String title) {
        for (Music m : tracks) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();
    }

    public List<Music> findByArtist(String artist) {
        List<Music> results = new ArrayList<>();
        for (Music m : tracks) {
            if (m.getArtist().equalsIgnoreCase(artist)) {
                results.add(m);
            }
        }
        return results;
    }

    public int size() {
        return tracks.size();
    }

    public Music get(int index) {
        return tracks.get(index);
    }

    public List<Music> all() {
        return new ArrayList<>(tracks);
    }
}
