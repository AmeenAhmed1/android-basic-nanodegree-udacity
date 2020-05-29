package com.ameen.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.ameen.musicalstructureapp.adapter.MusicListAdapter;
import com.ameen.musicalstructureapp.data.SongData;

import java.util.List;

public class MusicListActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    RecyclerView musicRecyclerView;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        button = findViewById(R.id.nowPlayButton);
        button.setOnClickListener(this);

        setRecyclerView();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.nowPlayButton:
                startActivity(new Intent(MusicListActivity.this, MainActivity.class));
                break;
        }
    }

    private void setRecyclerView(){

        musicRecyclerView = findViewById(R.id.musicRecyclerView);
        musicRecyclerView.setHasFixedSize(true);
        musicRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new MusicListAdapter(getApplicationContext());
        musicRecyclerView.setAdapter(mAdapter);
    }
}
