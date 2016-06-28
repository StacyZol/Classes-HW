package com.company;

import java.util.HashMap;

/**
 * Created by stacyzolnikov on 6/27/16.
 */
public class User {
    String mName;
    Playlist mPlaylist;
    HashMap<String, Playlist> mPlaylists;

    Playlist myPlaylist = new Playlist();

    public User() {}

    public void User (String name){
        mName = name;
        mPlaylists = new HashMap<>();
    }
    public void addPlaylist(Playlist playlist){
//        mPlaylists.put(playlist.getName(), playlist);
    }
    public HashMap<String, Playlist> getAllPlaylistNAmes () {
        return mPlaylists;
    }

    public Playlist getPlaylistByName (HashMap iHateThis, String name) {
        if (!iHateThis.containsKey(name)){
            return null;
        }

        else {
            return (Playlist) iHateThis.get(name);
        }
    }

}
