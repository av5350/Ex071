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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        answerTv = (TextView) findViewById(R.id.answerTv);

        Intent gi = getIntent();
        double answer = gi.getDoubleExtra("answer", 0);
        answerTv.setText("The last calculation answer is: " + answer);
    }

    public void goToMain(View view) {
        finish();
    }
}