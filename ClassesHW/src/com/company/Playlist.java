package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stacyzolnikov on 6/27/16.
 */
public class Playlist {
    String mName;
    ArrayList<Song> mSongs = new ArrayList<>();
    Song lalala= new Song();
    public Playlist() {

    }

    public Playlist (String name) {
        mName = name;
        List<Song> mSongs = new ArrayList<>();
    }

    public String getName(int xyz){
        return mSongs.get(xyz).toString();
    }
    public void addSong(Song song) {
        mSongs.add(song);
    }
    public void playAll() {
        lalala.play();

    }

}
