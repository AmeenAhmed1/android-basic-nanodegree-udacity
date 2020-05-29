package com.ameen.musicalstructureapp.data;

public class SongData {

    private String songName;
    private String songArtist;

    public SongData(String songName, String songArtist) {
        this.songName = songName;
        this.songArtist = songArtist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }
}
