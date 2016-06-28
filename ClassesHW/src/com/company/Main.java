package com.company;

public class Main {

    public static void main(String[] args) {
    User person1 = new User();
    Song song1 = new Song("Vienna", "Billy Joel", "AlbumName");
    Song song2 = new Song("a", "b", "c");
//    Song song3 = new Song();
//    Song song4 = new Song();
//    Song song5 = new Song();
    Playlist playlist1 = new Playlist();
        playlist1.addSong(song1);
//        playlist1.mSongs.add(song2);
//    Playlist playlist2 = new Playlist();
//        playlist2.mSongs.add(song3);
//        playlist2.mSongs.add(song4);
//        playlist2.mSongs.add(song5);

//        System.out.println(playlist1.getName(0));

        song1.play();
        song2.play();

    }
}
