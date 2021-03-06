/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer media;

    @Override
    protected void onStop() {
        super.onStop();
        if (media != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            media.release();}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        // Create a list of words
        final ArrayList<com.example.android.miwok.word> words = new ArrayList<>();
        words.add(new word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new word("nine", "wo???e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new word("ten", "na???aacha", R.drawable.number_ten, R.raw.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        wordAdaptor adapter = new wordAdaptor(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            if (media != null) {
                // Regardless of the current state of the media player, release its resources
                // because we no longer need it.
                media.release();}
            // Get the {@link Word} object at the given position the user clicked on
            word word = words.get(position);

            // Create and setup the {@link MediaPlayer} for the audio resource associated
            // with the current word
            media = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceID());

            // Start the audio file
            media.start();
            media.setOnCompletionListener(MediaPlayer::release);

        });


    }
}