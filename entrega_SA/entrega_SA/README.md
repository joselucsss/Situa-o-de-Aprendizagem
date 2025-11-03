# Projeto Playlist

**Autor:** José Lucas  
**Sala:** 203  
**Escola:** SESI  

---

## Descrição

Este projeto em Java simula o funcionamento de uma playlist de músicas. Ele permite criar músicas, adicionar músicas a playlists, associar playlists a um player e testar o funcionamento por meio de uma classe principal.

O projeto segue a seguinte estrutura:


---

## Requisitos

- Java JDK 8 ou superior
- IDE para Java (Eclipse, IntelliJ, VS Code, etc.)

---

## Como executar

1. Abra o projeto em sua IDE de preferência.
2. Compile todas as classes na pasta `src/com/playlist`.
3. Execute a classe `TestMain.java`.
4. O programa mostrará o funcionamento do player e das playlists no console.

---

## Exemplo de Uso

```java
// Criando músicas
Music song1 = new Music("Imagine", "John Lennon", 183);
Music song2 = new Music("Bohemian Rhapsody", "Queen", 354);

// Criando playlist
Playlist myPlaylist = new Playlist("Favoritas");
myPlaylist.addMusic(song1);
myPlaylist.addMusic(song2);

// Criando player e adicionando playlist
Player player = new Player();
player.addPlaylist(myPlaylist);

// Tocando músicas
player.play();
