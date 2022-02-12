package com.example.miwok;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //the array list of english numbers in numbers activity
        ArrayList<String> englishNumbers = new ArrayList<>();

        //adding the numbers in english to arraylist
        englishNumbers.add("one");
        englishNumbers.add("two");
        englishNumbers.add("three");
        englishNumbers.add("four");
        englishNumbers.add("five");
        englishNumbers.add("six");
        englishNumbers.add("seven");
        englishNumbers.add("eight");
        englishNumbers.add("nine");
        englishNumbers.add("ten");

        //creating text views and adding the numbers to it from the array list
        //linking to the numbers activity
        LinearLayout numbers = findViewById(R.id.ActivityNumbers);
        //a loop to make the words one by one and adding them to numbers activity
        for (int i = 0; i < englishNumbers.size(); i++) {
            TextView text = new TextView(this);
            text.setText(englishNumbers.get(i));
            numbers.addView(text);
        }
    }
}