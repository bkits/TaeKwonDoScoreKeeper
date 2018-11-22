package com.example.android.taekwondoscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int bluePlayerScore = 0;
    int redPlayerScore = 0;
    int bluePlayerFouls = 0;
    int redPlayerFouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // this method updates the display of the blue player score to the value of argument score
    public void displayScoreForBluePlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_player_score);
        scoreView.setText(String.valueOf(score));
    }

    // this method updates the display of the blue player fouls to the value of argument fouls
    public void displayFoulsForBluePlayer(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.blue_player_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    /* this method adds 3 points to the current blue player score and calls the score
     display method for the blue player
     */
    public void blueIncreaseBy3(View view) {
        bluePlayerScore += 3;
        displayScoreForBluePlayer(bluePlayerScore);
    }

    /* this method adds 2 points to the current blue player score and calls the
     display method for the blue player
    */
    public void blueIncreaseBy2(View view) {
        bluePlayerScore += 2;
        displayScoreForBluePlayer(bluePlayerScore);
    }

    /* this method adds 3 points to the current blue player score and calls the
     display method for the blue player
    */
    public void blueIncreaseBy1(View view) {
        bluePlayerScore += 1;
        displayScoreForBluePlayer(bluePlayerScore);
    }

    /* this method adds 1 foul to the current blue player fouls and calls the foul
     display method for the blue player
    */
    public void blueFoul(View view) {
        bluePlayerFouls += 1;
        if (bluePlayerFouls % 2 == 0) {
            if (bluePlayerScore != 0) {
                bluePlayerScore -= 1;
            }
        }
        displayFoulsForBluePlayer(bluePlayerFouls);
        displayScoreForBluePlayer(bluePlayerScore);
    }

    // this method updates the display of the red player score to the value of argument score
    public void displayScoreForRedPlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_player_score);
        scoreView.setText(String.valueOf(score));
    }

    // this method updates the display of the red player fouls to the value of argument fouls
    public void displayFoulsForRedPlayer(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.red_player_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    /* this method adds 3 points to the current red player score and calls the score
 display method for the red player
 */
    public void redIncreaseBy3(View view) {
        redPlayerScore += 3;
        displayScoreForRedPlayer(redPlayerScore);
    }

    /* this method adds 2 points to the current red player score and calls the
     display method for the red player
    */
    public void redIncreaseBy2(View view) {
        redPlayerScore += 2;
        displayScoreForRedPlayer(redPlayerScore);
    }

    /* this method adds 3 points to the current red player score and calls the
     display method for the red player
    */
    public void redIncreaseBy1(View view) {
        redPlayerScore += 1;
        displayScoreForRedPlayer(redPlayerScore);
    }

    /* this method adds 1 foul to the current red player fouls and calls the foul
     display method for the red player
    */
    public void redFoul(View view) {
        redPlayerFouls += 1;
        if (redPlayerFouls % 2 == 0) {
            if (redPlayerScore != 0) {
                redPlayerScore -= 1;
            }
        }
        displayFoulsForRedPlayer(redPlayerFouls);
        displayScoreForRedPlayer(redPlayerScore);
    }

    /* this method sets all global variables to zero and calls their display methods
     */
    public void resetScore(View view) {
        bluePlayerScore = 0;
        redPlayerScore = 0;
        bluePlayerFouls = 0;
        redPlayerFouls = 0;
        displayScoreForBluePlayer(bluePlayerScore);
        displayScoreForRedPlayer(redPlayerScore);
        displayFoulsForBluePlayer(bluePlayerFouls);
        displayFoulsForRedPlayer(redPlayerFouls);
    }

}
