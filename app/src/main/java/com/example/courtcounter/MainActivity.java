package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int team_a_points = 0;
    private int team_b_points = 0;
    private final int POINTS_FOR_FT = 1;
    private int numOfShotsTeamA = 0;
    private int numOfShotsTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsTeamA(View view) {
        team_a_points = team_a_points + 3;
        numOfShotsTeamA ++;
        displayForTeamA(team_a_points);
    }
    public void addTwoPointsTeamA(View view) {
        team_a_points = team_a_points + 2;
        numOfShotsTeamA ++;
        displayForTeamA(team_a_points);
    }
    public void addFTPointsTeamA(View view) {
        team_a_points = team_a_points + POINTS_FOR_FT;
        displayForTeamA(team_a_points);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsTeamB(View view) {
        team_b_points = team_b_points + 3;
        numOfShotsTeamB ++;
        displayForTeamB(team_b_points);
    }
    public void addTwoPointsTeamB(View view) {
        team_b_points = team_b_points + 2;
        numOfShotsTeamB ++;
        displayForTeamB(team_b_points);
    }
    public void addFTPointsTeamB(View view) {
        team_b_points = team_b_points + POINTS_FOR_FT;
        displayForTeamB(team_b_points);
    }

    public void resetScores(View view) {
        team_a_points = 0;
        team_b_points = 0;
        numOfShotsTeamA = 0;
        numOfShotsTeamB = 0;
        displayForTeamA(team_a_points);
        displayForTeamB(team_b_points);
    }
}