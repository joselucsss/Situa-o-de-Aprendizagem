package com.playlist;

public class Player {
    private Playlist playlist;
    private int currentIndex;
    private boolean isPlaying;

    public Player(Playlist playlist) {
        this.playlist = playlist;
        this.currentIndex = 0;
        this.isPlaying = false;
    }

    public void play() {
        if (playlist.size() == 0) {
            System.out.println("A playlist está vazia!");
            return;
        }
        isPlaying = true;
        System.out.println("Tocando agora: " + playlist.get(currentIndex));
    }

    public void pause() {
        if (!isPlaying) {
            System.out.println("Nenhuma música está tocando.");
            return;
        }
        isPlaying = false;
        System.out.println("Música pausada.");
    }

    public void stop() {
        if (!isPlaying) {
            System.out.println("Nada para parar.");
            return;
        }
        isPlaying = false;
        System.out.println("Música parada.");
    }

    public void next() {
        if (playlist.size() == 0) return;

        currentIndex = (currentIndex + 1) % playlist.size();
        System.out.println("Próxima música: " + playlist.get(currentIndex));
    }

    public void previous() {
        if (playlist.size() == 0) return;

        currentIndex = (currentIndex - 1 + playlist.size()) % playlist.size();
        System.out.println("Música anterior: " + playlist.get(currentIndex));
    }

    public void nowPlaying() {
        if (playlist.size() == 0) {
            System.out.println("A playlist está vazia.");
            return;
        }
        System.out.println("Agora tocando: " + playlist.get(currentIndex));
    }
}
