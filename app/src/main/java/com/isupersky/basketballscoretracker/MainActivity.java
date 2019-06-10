package com.isupersky.basketballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aTeamScore=0 ,bTeamScore = 0;
    TextView teamAScore,teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       teamAScore = (TextView)findViewById(R.id.team_a_score);
       teamBScore =(TextView)findViewById(R.id.team_b_score);
    }

    public void reset(View view){

        aTeamScore=0;
        bTeamScore=0;
        teamAScore.setText(""+0);
        teamBScore.setText(""+0);
    }

    public void plusThreeTeamA(View view){
        aTeamScore +=3;
        teamAScore.setText(""+aTeamScore);

    }

    public void plusTwoTeamA(View view)
    {
        aTeamScore+=2;
        teamAScore.setText(""+aTeamScore);
    }

    public void plusOneTeamA(View view){
        aTeamScore+=1;
        teamAScore.setText(""+aTeamScore);
    }



    public void plusThreeTeamB(View view){

        //int score = Integer.parseInt(teamAScore.getText());
        bTeamScore +=3;
        teamBScore.setText(""+bTeamScore);

    }

    public void plusTwoTeamB(View view)
    {
        bTeamScore+=2;
        teamBScore.setText(""+bTeamScore);
    }

    public void plusOneTeamB(View view){
        bTeamScore+=1;
        teamBScore.setText(""+bTeamScore);
    }

}
