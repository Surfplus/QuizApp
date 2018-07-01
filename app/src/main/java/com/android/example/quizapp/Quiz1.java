package com.android.example.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz1 extends AppCompatActivity {

    CheckBox q1_checkBox1;
    CheckBox q1_checkBox2;
    CheckBox q1_checkBox3;
    CheckBox q1_checkBox4;

    RadioButton q2_radioButton1;

    EditText q3_answer;

    RadioButton q4_radioButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
    }

    public void submit(View view) {
        CharSequence resultsDisplay;
        int score = 0;
//
//
        Boolean ans1_checkbox1;
        Boolean ans1_checkbox2;
        Boolean ans1_checkbox3;
        Boolean ans1_checkbox4;
        q1_checkBox1 = (CheckBox) this.findViewById(R.id.q1_checkBox1);
        q1_checkBox2 = (CheckBox) this.findViewById(R.id.q1_checkBox2);
        q1_checkBox3 = (CheckBox) this.findViewById(R.id.q1_checkBox3);
        q1_checkBox4 = (CheckBox) this.findViewById(R.id.q1_checkBox4);
        ans1_checkbox1 = q1_checkBox1.isChecked();
        ans1_checkbox2 = q1_checkBox2.isChecked();
        ans1_checkbox3 = q1_checkBox3.isChecked();
        ans1_checkbox4 = q1_checkBox4.isChecked();
        if (!ans1_checkbox1 && ans1_checkbox2 && ans1_checkbox3 && ans1_checkbox4) {
            score += 1;
        } else {
            score += 0;
        }
//
//
        Boolean answer2;

        q2_radioButton1 = (RadioButton) this.findViewById(R.id.q2_radioButton1);
        answer2 = q2_radioButton1.isChecked();
        if (answer2) {
            score += 1;
        } else {
            score += 0;
        }

//
//
        String answer3;
        q3_answer = (EditText) this.findViewById(R.id.q3_answer);
        answer3 = q3_answer.getText().toString().toLowerCase();
        if (answer3.equals("probability")) {
            score += 1;
        } else {
            score += 0;
        }

//
//
        Boolean answer4;

        q4_radioButton3 = (RadioButton) this.findViewById(R.id.q4_radioButton3);
        answer4 = q4_radioButton3.isChecked();
        if (answer4) {
            score += 1;
        } else {
            score += 0;
        }
//
//
        resultsDisplay = "You scored " + score + " out of 4";
        Toast.makeText(Quiz1.this, resultsDisplay, Toast.LENGTH_SHORT).show();

    }
}