package com.example.android.quizmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculateScore(View view) {
//        this is for the first question
        int score = 0;
        RadioButton answer1 = (RadioButton) findViewById(R.id.ans1);
        if (answer1.isChecked()) {
            score = score + 1;
        }

//        this is for the second question
        RadioButton answer2 = (RadioButton) findViewById(R.id.ans2);
        if (answer2.isChecked()) {
            score = score + 1;
        }

//        this is for the 3rd question
//        i checked if all the 3 checkboxes were clicked using the and '&&" operator
        CheckBox answer3_1 = (CheckBox) findViewById(R.id.month1);
        CheckBox answer3_2 = (CheckBox) findViewById(R.id.month2);
        CheckBox answer3_3 = (CheckBox) findViewById(R.id.month3);
        if (answer3_1.isChecked() && answer3_2.isChecked() && answer3_3.isChecked()) {
            score = score + 1;
        }

//        this is for the fourth question.
//        I have used equalsIgnoreCase to compare the strings
        EditText answer4 = (EditText) findViewById(R.id.ans4);
        if (answer4.getText().toString().equalsIgnoreCase("unknown")) {
            score = score + 1;
        } else if (answer4.getText().toString().equalsIgnoreCase("cannot be determined")) {
            score = score + 1;
        }

//      this is for the fifth question
        RadioButton answer5 = (RadioButton) findViewById(R.id.ans5);
        if (answer5.isChecked()) {
            score = score + 1;
        }


        Toast.makeText(this, "YOU SCORED " + score,
                Toast.LENGTH_LONG).show();

    }
}
