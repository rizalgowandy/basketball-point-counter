package com.comuf.rwg.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int teamAScore = 0, teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void twoPointsTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void freeThrowsTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void twoPointsTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void freeThrowsTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void resetAction(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
