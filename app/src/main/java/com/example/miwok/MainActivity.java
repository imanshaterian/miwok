package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding the number text view by its id
        TextView numbers = findViewById(R.id.numbers);
        //setting up an click listener  on the text view
        numbers.setOnClickListener(view -> {
            //giving click listener the tasks needed
            Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
            startActivity(numbersIntent);
        });

        //finding the color text view by its id
        TextView colors = findViewById(R.id.colors);
        //setting up an click listener  on the text view
        colors.setOnClickListener(view -> {
            //giving click listener the tasks needed
            Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
            startActivity(colorsIntent);
        });

        //finding the family text view by its id
        TextView family = findViewById(R.id.family);
        //setting up an click listener  on the text view
        family.setOnClickListener(view -> {
            //giving click listener the tasks needed
            Intent familyIntent = new Intent(MainActivity.this, Family.class);
            startActivity(familyIntent);
        });

        //finding the phrases text view by its id
        TextView phrases = findViewById(R.id.phrases);
        //setting up an click listener  on the text view
        phrases.setOnClickListener(view -> {
            //giving click listener the tasks needed
            Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
            startActivity(phrasesIntent);
        });
    }
}