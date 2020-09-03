package com.example.ex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    double answer = 0;

    EditText mathExercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathExercise = (EditText) findViewById(R.id.mathExercise);

    }

    public void goToCredits(View view) {
        Intent si = new Intent(this, CreditsActivity.class);
        si.putExtra("answer", answer);
        startActivity(si);
    }

    public void add(View view) {
        String inputedNum = mathExercise.getText().toString();
        answer = answer + Float.parseFloat(inputedNum);
        mathExercise.setText("");
    }

    public void restartValues(View view) {
        answer = 0;
        mathExercise.setText("");
    }

    public void sub(View view) {
        String inputedNum = mathExercise.getText().toString();
        answer = answer - Float.parseFloat(inputedNum);
        mathExercise.setText("");
    }

    public void mul(View view) {
        String inputedNum = mathExercise.getText().toString();
        answer = answer * Float.parseFloat(inputedNum);
        mathExercise.setText("");
    }

    public void div(View view) {
        String inputedNum = mathExercise.getText().toString();
        answer = answer / Float.parseFloat(inputedNum);
        mathExercise.setText("");
    }

    public void showResult(View view) {
        mathExercise.setText("" + answer);
    }
}