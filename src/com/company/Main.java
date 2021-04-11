package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Kids See Ghosts", "Kid Cudi");
        album.addSong("Feel The Love", 2.45);
        album.addSong("Fire", 2.21);
        album.addSong("4th Dimension", 2.33);
        album.addSong("Freeee", 3.27);
        album.addSong("Reborn", 5.25);
        album.addSong("Kids See Ghosts", 4.05);
        album.addSong("Cudi Montage", 3.17);
        albums.add(album);

        album = new Album("always", "keshi");
        album.addSong("always", 3.58);
        album.addSong("more", 4.30);
        album.addSong("drunk", 3.37);
        album.addSong("talk", 4.15);
        album.addSong("B.Y.S.", 3.18);
        album.addSong("us", 5.21);
        albums.add(album);
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in playlist\n" +
                "5 - print available actions.\n" +
                "6 - remove current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }
}
