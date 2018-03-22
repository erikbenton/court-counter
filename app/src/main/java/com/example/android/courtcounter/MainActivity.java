package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    private void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void twoPointTeamA(View view)
    {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void threePointTeamA(View view)
    {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void freeThrowTeamA(View view)
    {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    private void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void twoPointTeamB(View view)
    {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void threePointTeamB(View view)
    {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void freeThrowTeamB(View view)
    {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void resetScores(View view)
    {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
