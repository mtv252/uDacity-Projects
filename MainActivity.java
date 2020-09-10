package com.example.tennisscoringapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tennisscoringapp.R;

public class MainActivity extends AppCompatActivity {

    int p1Score = 2;
    int p2Score = 2;
    int p3Score = 2;
    int p4Score = 2;

    int p1Road = 0;
    int p2Road = 0;
    int p3Road = 0;
    int p4Road = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForp1(p1Score);
        displayForp2(p2Score);
        displayForp3(p3Score);
        displayForp4(p4Score);
    }

    /**
     * Each method displays the score for the respective player.
     */
    public void displayForp1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForp2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForp3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p3_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForp4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p4_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Each method adds a point for a built settlement per respective player
     */

    public void p1_settlement(View v) {
        p1Score = p1Score + 1;
        displayForp1(p1Score);
    }

    public void p2_settlement(View v) {
        p2Score = p2Score + 1;
        displayForp2(p2Score);
    }

    public void p3_settlement(View v) {
        p3Score = p3Score + 1;
        displayForp3(p3Score);
    }

    public void p4_settlement(View v) {
        p4Score = p4Score + 1;
        displayForp4(p4Score);
    }

    /**
     * Each method adds a point for a built city per respective player
     */

    public void p1_city(View v) {
        p1Score = p1Score + 2;
        displayForp1(p1Score);
    }

    public void p2_city(View v) {
        p2Score = p2Score + 2;
        displayForp2(p2Score);
    }

    public void p3_city(View v) {
        p3Score = p3Score + 2;
        displayForp3(p3Score);
    }

    public void p4_city(View v) {
        p4Score = p4Score + 2;
        displayForp4(p4Score);
    }

    public void p1_road(View v) {
        Button buttonView = (Button) findViewById(R.id.p1_road_button);
        if (p1Road == 0) {
            buttonView.setBackgroundColor(-16711936);
            p1Score = p1Score + 2;
            displayForp1(p1Score);
            p1Road = p1Road + 1;
        } else {
            buttonView.setBackgroundColor(Color.parseColor("#ABABCD"));
            p1Score = p1Score - 2;
            displayForp1(p1Score);
            p1Road = p1Road - 1;
        }

    }


    }

