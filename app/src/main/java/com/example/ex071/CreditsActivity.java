package com.example.ex071;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {
    TextView answerTv;

    boolean hasZero;

    double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        answerTv = (TextView) findViewById(R.id.answerTv);

        Intent gi = getIntent();
        answer = gi.getDoubleExtra("answer", 0);
        hasZero = gi.getBooleanExtra("hasZero", false);

        if (hasZero){
            answerTv.setText("The last calculation answer is: Error");
        }
        else {
            answerTv.setText("The last calculation answer is: " + answer);
        }
    }

    public void goToMain(View view) {
        finish();
    }
}