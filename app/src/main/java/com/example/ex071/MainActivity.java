package com.example.ex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double answer, secNum;
    char sign;

    EditText mathExercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathExercise = (EditText) findViewById(R.id.mathExercise);

        answer = 0;
        secNum = 0;
        sign = 'F';
    }

    public void makeCalculation(char newSign){
        String inputedNum = mathExercise.getText().toString();
        if (!inputedNum.equals("")) {
            secNum = Double.parseDouble(inputedNum);
            switch (sign) {
                // the first time number
                case 'F':
                    answer = secNum;
                    break;
                case '+':
                    answer = answer + secNum;
                    break;
                case '-':
                    answer = answer - secNum;
                    break;
                case '*':
                    answer = answer * secNum;
                    break;
                case '/':
                    // If the user wants to div by 0 - cant do that!
                    if (secNum == 0){
                        Toast.makeText(this, "Cant divide by 0!", Toast.LENGTH_SHORT).show();
                        answer = 0;
                    }
                    else {
                        answer = answer / secNum;
                    }
                    break;
            }
            sign = newSign;
            mathExercise.setText("");
        }
    }

    public void goToCredits(View view) {
        Intent si = new Intent(this, CreditsActivity.class);
        si.putExtra("answer", answer);
        startActivity(si);
    }

    public void add(View view) {
        makeCalculation('+');
    }

    public void restartValues(View view) {
        sign = 'F';
        secNum = 0;
        answer = 0;
        mathExercise.setText("");
    }

    public void sub(View view) {
        makeCalculation('-');
    }

    public void mul(View view) {
        makeCalculation('*');
    }

    public void div(View view) {
        makeCalculation('/');
    }

    public void showResult(View view) {
        makeCalculation('=');

        if ((float)((int)answer) == answer) {
            mathExercise.setText("" + (int)answer);
        }
        else {
            mathExercise.setText("" + answer);
        }
    }
}