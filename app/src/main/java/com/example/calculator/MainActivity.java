package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        {
            setContentView(R.layout.activity_main);
            EditText edit_expiry_date = findViewById(R.id.edit_expiry_date);
            RadioGroup Rog = findViewById(R.id.radioGroup);
            Button button = findViewById(R.id.button);
            RadioButton radioButton2 = findViewById(R.id.radioButton2);RadioButton radioButton3 = findViewById(R.id.radioButton3);RadioButton radioButton1 = findViewById(R.id.radioButton);
            TextView seen = findViewById(R.id.seen);
            TextView Tx = findViewById(R.id.textView);
            ConstraintLayout per = findViewById(R.id.pearnt);
            CheckBox a3 = findViewById(R.id.checkBox3);CheckBox a4 = findViewById(R.id.checkBox4);CheckBox a2 = findViewById(R.id.checkBox2); CheckBox a1 = findViewById(R.id.checkBox1);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (radioButton1.isChecked()) {
                        Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                        seen.setText("young");
                    } else if (radioButton2.isChecked()) {

                        Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                        seen.setText("youths");
                    } else if (radioButton3.isChecked()) {

                        Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                        seen.setText("older");
                    } else
                        Toast.makeText(MainActivity.this, "you should select your age ", Toast.LENGTH_SHORT).show();
                    if (radioButton1.isChecked()||radioButton2.isChecked()||radioButton3.isChecked()){
                        per.setBackgroundResource(R.color.no);
                        Tx.setTextColor(getColor(R.color.black));
                    }
                }
            });
            a1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (a1.isChecked()) {
                        Toast.makeText(MainActivity.this, "java", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (a2.isChecked()) {
                        Toast.makeText(MainActivity.this, "JavaScript", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (a3.isChecked()) {
                        Toast.makeText(MainActivity.this, "Python", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            a4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (a4.isChecked()) {
                        Toast.makeText(MainActivity.this, "Kotlin", Toast.LENGTH_SHORT).show();
                    }
                }
            });


        }
    }}