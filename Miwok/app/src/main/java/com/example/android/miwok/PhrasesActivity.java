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

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        // Create a list of words
        ArrayList<com.example.android.miwok.word> words = new ArrayList<>();
        words.add(new word("/*Where are you going?","minto wuksus"));
        words.add(new word("What is your name?","tinnә oyaase'nә"));
        words.add(new word("My name is...","oyaaset..."));
        words.add(new word("How are you feeling?","michәksәs?"));
        words.add(new word("I’m feeling good.","kuchi achit"));
        words.add(new word("Are you coming?","әәnәs'aa?"));
        words.add(new word("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new word("I’m coming.","әәnәm"));
        words.add(new word("Let’s go.","yoowutis"));
        words.add(new word("Come here.","әnni'nem"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the layout file.
        // This list item layout contains two {@link TextView}, which the adapter will set to
        // display two words.
        wordAdaptor itemsAdapter = new wordAdaptor(this, words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

    }
}
