package com.company;

/**
 * Created by stacyzolnikov on 6/27/16.
 */
public class Song {
    String mSongName;
    String mArtistName;
    String mAlbumName;


//    public Song() {
//    }

    public Song (String name, String artist, String album){
        mSongName = name;
        mArtistName = artist;
        mAlbumName = album;
    }

    public Song() {

    }

    public void play () {
        System.out.println(mSongName + mArtistName + mAlbumName);

    }

}
