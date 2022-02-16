package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

/**
 * {@link wordAdaptor} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link word} objects.
 */
public class wordAdaptor extends ArrayAdapter<word> {


    int mColor;
    /**
     * Create a new {@link wordAdaptor} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link word}s to be displayed.
     */
    public wordAdaptor(Context context, ArrayList<word> words, int color) {
        super(context, 0, words);
        mColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link word} object located at this position in the list
        word currentword = getItem(position);

        ImageView image = listItemView.findViewById(R.id.imageListItem);
        image.setImageResource(currentword.getImageResourceID());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = listItemView.findViewById(R.id.miwokListItem);
        // Get the Miwok translation from the currentword object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(currentword.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = listItemView.findViewById(R.id.englishListItem);
        // Get the default translation from the currentword object and set this text on
        // the default TextView.
        defaultTextView.setText(currentword.getmDefaultTranslation());

        View linear = listItemView.findViewById(R.id.list_item);
        int color = ContextCompat.getColor(getContext(), mColor);
        linear.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}