package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_TeamA=0;
    int score_TeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void teamA3points(View view){
        score_TeamA = score_TeamA + 3;
        displayTeamA(score_TeamA);
    }
    public void teamA2points(View view){
        score_TeamA = score_TeamA + 2;
        displayTeamA(score_TeamA);
    }
    public void teamAFreeThrow(View view){
        score_TeamA = score_TeamA + 1;
        displayTeamA(score_TeamA);
    }

    public void teamB3points(View view){
        score_TeamB = score_TeamB + 3;
        displayTeamB(score_TeamB);
    }
    public void teamB2points(View view){
        score_TeamB = score_TeamB + 2;
        displayTeamB(score_TeamB);
    }
    public void teamBFreeThrow(View view){
        score_TeamB = score_TeamB + 1;
        displayTeamB(score_TeamB);
    }
    private void displayTeamA(int score){
        TextView teamA=(TextView) findViewById(R.id.teamAtextview);
        teamA.setText(""+score);
    }
    private void displayTeamB(int score){
        TextView teamB=(TextView) findViewById(R.id.teamBtextview);
        teamB.setText(""+score);
    }
    public void reset(View view){
        TextView teamA=(TextView) findViewById(R.id.teamAtextview);
        TextView teamB=(TextView) findViewById(R.id.teamBtextview);
        score_TeamA=score_TeamB=0;
        teamA.setText(""+score_TeamA);
        teamB.setText(""+score_TeamB);
    }
}