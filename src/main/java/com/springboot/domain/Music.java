package com.springboot.domain;

/**
 * @author eternalSy
 * @version 1.0.0
 */
public class Music {
    private String songName;
    private String singer;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Music{" +
                "songName='" + songName + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
