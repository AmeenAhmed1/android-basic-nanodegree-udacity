package com.ameen.scoreapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView teamAScore, teamBScore;
    Button teamAOne, teamATwo, teamAThree;
    Button teamBOne, teamBTwo, teamBThree;
    Button resetButton;

    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = findViewById(R.id.textTeamAScore);
        teamAScore.setText(String.valueOf(scoreA));
        teamBScore = findViewById(R.id.textTeamBScore);
        teamBScore.setText(String.valueOf(scoreB));

        teamAOne = findViewById(R.id.btnTeamAOne);
        teamAOne.setOnClickListener(this);
        teamATwo = findViewById(R.id.btnTeamATwo);
        teamATwo.setOnClickListener(this);
        teamAThree = findViewById(R.id.btnTeamAThree);
        teamAThree.setOnClickListener(this);

        teamBOne = findViewById(R.id.btnTeamBOne);
        teamBOne.setOnClickListener(this);
        teamBTwo = findViewById(R.id.btnTeamBTwo);
        teamBTwo.setOnClickListener(this);
        teamBThree = findViewById(R.id.btnTeamBThree);
        teamBThree.setOnClickListener(this);

        resetButton = findViewById(R.id.btnReset);
        resetButton.setOnClickListener(this);
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("ScoreA", scoreA);
        outState.putInt("ScoreB", scoreB);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreA = savedInstanceState.getInt("ScoreA");
        scoreB = savedInstanceState.getInt("ScoreB");
        teamAScore.setText(String.valueOf(scoreA));
        teamBScore.setText(String.valueOf(scoreB));
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnTeamAOne:
                teamAScore.setText(String.valueOf(scoreA += 1));
                break;

            case R.id.btnTeamATwo:
                teamAScore.setText(String.valueOf(scoreA += 2));
                break;

            case R.id.btnTeamAThree:
                teamAScore.setText(String.valueOf(scoreA += 3));
                break;


            case R.id.btnTeamBOne:
                teamBScore.setText(String.valueOf(scoreB += 1));
                break;

            case R.id.btnTeamBTwo:
                teamBScore.setText(String.valueOf(scoreB += 2));
                break;

            case R.id.btnTeamBThree:
                teamBScore.setText(String.valueOf(scoreB += 3));
                break;

            case R.id.btnReset:
                scoreA = 0;
                scoreB = 0;
                teamAScore.setText(String.valueOf(scoreA));
                teamBScore.setText(String.valueOf(scoreB));
                break;
        }
    }
}
