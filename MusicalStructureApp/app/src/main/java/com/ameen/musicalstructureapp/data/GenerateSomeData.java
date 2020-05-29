package com.ameen.musicalstructureapp.data;

import java.util.ArrayList;
import java.util.List;

public class GenerateSomeData {

    List<SongData> mData;

    public GenerateSomeData() {
        generate();
    }

    public List<SongData> getmData() {
        return mData;
    }

    private void generate(){
        mData = new ArrayList<>();
        mData.add(new SongData("Hello","Adele"));
        mData.add(new SongData("New Song","Unknown Artist"));
        mData.add(new SongData("Song name","Artist"));
        mData.add(new SongData("Music name","Artist name"));
    }
}
