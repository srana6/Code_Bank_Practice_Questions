package com.javaLogic.comparable;

/**
 * Created by macbook on 6/17/17.
 */
public class Songs implements Comparable<Songs> {
    private String songName;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }



    @Override
    public int compareTo(Songs s) {
        return songName.compareTo(s.getSongName());
    }
}
