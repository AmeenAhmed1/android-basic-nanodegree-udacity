package com.ameen.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView folderListButton;
    ImageView favButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        folderListButton = findViewById(R.id.folderButton);
        folderListButton.setOnClickListener(this);

        favButton = findViewById(R.id.favImageView);
        favButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.folderButton:
                startActivity(new Intent(MainActivity.this, MusicListActivity.class));
                break;

            case R.id.favImageView:
                startActivity(new Intent(MainActivity.this, MusicListActivity.class));
                break;
        }
    }
}
