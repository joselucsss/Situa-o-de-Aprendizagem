package com.playlist;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        // Cria a playlist
        Playlist playlist = new Playlist("Favoritas");
        // Adiciona músicas de exemplo à playlist
        playlist.add(new Music("Lost", "Coldplay", 222));
        playlist.add(new Music("Believer", "Imagine Dragons", 204));
        playlist.add(new Music("Smells Like Teen Spirit", "Nirvana", 301));

        // Cria o player
        Player player = new Player(playlist);

        // Mostra músicas
        System.out.println("🎵 Playlist: ");
        for (Music m : playlist.all()) {
            System.out.println(" - " + m);
        }

        // Testa o player
        System.out.println("\n▶️ Testando Player:");
        player.play();
        player.next();
        player.pause();
        player.play();
        player.previous();
        player.stop();

        // Testa buscas
        System.out.println("\n🔍 Busca por título 'Lost': " + playlist.findByTitle("Lost").orElse(null));
        System.out.println("🔍 Busca por artista 'Nirvana': " + playlist.findByArtist("Nirvana"));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Ajustando o menu interativo para manter o programa em execução corretamente
        while (running) {
            System.out.println("\n==============================");
            System.out.println(" MENU INTERATIVO ");
            System.out.println("==============================");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Próxima faixa");
            System.out.println("4. Faixa anterior");
            System.out.println("5. Adicionar música");
            System.out.println("6. Mostrar playlist");
            System.out.println("7. Sair");
            System.out.println("==============================");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            System.out.println("\n------------------------------");
            switch (choice) {
                case 1:
                    System.out.println("[PLAY] Tocando música...");
                    player.play();
                    break;
                case 2:
                    System.out.println("[PAUSE] Música pausada.");
                    player.pause();
                    break;
                case 3:
                    System.out.println("[NEXT] Próxima faixa.");
                    player.next();
                    break;
                case 4:
                    System.out.println("[PREVIOUS] Faixa anterior.");
                    player.previous();
                    break;
                case 5:
                    System.out.print("Digite o título da música: ");
                    String title = scanner.nextLine();
                    System.out.print("Digite o artista: ");
                    String artist = scanner.nextLine();
                    System.out.print("Digite a duração (em segundos): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    Music newMusic = new Music(title, artist, duration);
                    playlist.add(newMusic);
                    System.out.println("Música adicionada: " + newMusic);
                    break;
                case 6:
                    System.out.println("\nPLAYLIST ATUAL:");
                    for (Music m : playlist.all()) {
                        System.out.println(" - " + m);
                    }
                    break;
                case 7:
                    running = false;
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println("------------------------------");
        }

        scanner.close();
    }
}
