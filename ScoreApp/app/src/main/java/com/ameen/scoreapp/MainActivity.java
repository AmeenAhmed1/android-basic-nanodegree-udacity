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
    TextView teamAFoul, teamBFoul;
    Button teamAOne, teamATwo, teamAThree, teamASix;
    Button teamBOne, teamBTwo, teamBThree, teamBSix;
    Button bTeamAFoul, bTeamBFoul;
    Button resetButton;

    int scoreA = 0, scoreB = 0;
    int aFoul = 0, bFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = findViewById(R.id.textTeamAScore);
        teamAScore.setText(String.valueOf(scoreA));
        teamBScore = findViewById(R.id.textTeamBScore);
        teamBScore.setText(String.valueOf(scoreB));
        teamAFoul = findViewById(R.id.textTeamAFoul);
        teamAFoul.setText(String.valueOf(aFoul));
        teamBFoul = findViewById(R.id.textTeamBFoul);
        teamBFoul.setText(String.valueOf(bFoul));

        teamAOne = findViewById(R.id.btnTeamAOne);
        teamAOne.setOnClickListener(this);
        teamATwo = findViewById(R.id.btnTeamATwo);
        teamATwo.setOnClickListener(this);
        teamAThree = findViewById(R.id.btnTeamAThree);
        teamAThree.setOnClickListener(this);
        teamASix = findViewById(R.id.btnTeamASix);
        teamASix.setOnClickListener(this);
        bTeamAFoul = findViewById(R.id.btnTeamAFoul);
        bTeamAFoul.setOnClickListener(this);

        teamBOne = findViewById(R.id.btnTeamBOne);
        teamBOne.setOnClickListener(this);
        teamBTwo = findViewById(R.id.btnTeamBTwo);
        teamBTwo.setOnClickListener(this);
        teamBThree = findViewById(R.id.btnTeamBThree);
        teamBThree.setOnClickListener(this);
        teamBSix = findViewById(R.id.btnTeamBSix);
        teamBSix.setOnClickListener(this);
        bTeamBFoul = findViewById(R.id.btnTeamBFoul);
        bTeamBFoul.setOnClickListener(this);

        resetButton = findViewById(R.id.btnReset);
        resetButton.setOnClickListener(this);
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("ScoreA", scoreA);
        outState.putInt("ScoreB", scoreB);
        outState.putInt("FoulA", aFoul);
        outState.putInt("FoulB", bFoul);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreA = savedInstanceState.getInt("ScoreA");
        scoreB = savedInstanceState.getInt("ScoreB");
        aFoul = savedInstanceState.getInt("FoulA");
        bFoul = savedInstanceState.getInt("FoulB");

        setTeamAScore(scoreA);
        setTeamBScore(scoreB);

        setTeamAFoul(aFoul);
        setTeamBFoul(bFoul);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnTeamAOne:
                setTeamAScore(scoreA += 1);
                break;

            case R.id.btnTeamATwo:
                setTeamAScore(scoreA += 2);
                break;

            case R.id.btnTeamAThree:
                setTeamAScore(scoreA += 3);
                break;

            case R.id.btnTeamASix:
                setTeamAScore(scoreA += 6);
                break;

            case R.id.btnTeamAFoul:
                setTeamAFoul(++aFoul);
                break;

            case R.id.btnTeamBOne:
                setTeamBScore(scoreB += 1);
                break;

            case R.id.btnTeamBTwo:
                setTeamBScore(scoreB += 2);
                break;

            case R.id.btnTeamBThree:
                setTeamBScore(scoreB += 3);
                break;

            case R.id.btnTeamBSix:
                setTeamBScore(scoreB += 6);
                break;

            case R.id.btnTeamBFoul:
                setTeamBFoul(++bFoul);
                break;

            case R.id.btnReset:
                scoreA = 0;
                scoreB = 0;
                aFoul = 0;
                bFoul = 0;
                setTeamAScore(scoreA);
                setTeamBScore(scoreB);
                setTeamAFoul(aFoul);
                setTeamBFoul(bFoul);
                break;
        }
    }


    private void setTeamAScore(int score) {
        teamAScore.setText(String.valueOf(score));
    }

    private void setTeamAFoul(int foul) {
        teamAFoul.setText(String.valueOf(foul));
    }

    private void setTeamBScore(int score) {
        teamBScore.setText(String.valueOf(score));
    }

    private void setTeamBFoul(int foul) {
        teamBFoul.setText(String.valueOf(foul));
    }
}
