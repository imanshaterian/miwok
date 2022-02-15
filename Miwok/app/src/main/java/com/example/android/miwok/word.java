package com.example.android.miwok;

public class word {
    //creating local string to store default words in it.
    private final String mDefaultTranslation;

    //creating local string to store miwok words in it.
    private final String mMiwokTranslation;

    private int mImage;

    //getting and storing the words and the image id in our local variables.
    public word(String defaultTranlation, String miwokTranslation , int image) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranlation;
        mImage = image;
    }

    //getting and storing the words in our local variables.
    public word(String defaultTranlation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranlation;
    }

    //get MiwokTranslation by calling this method
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    //get DefaultTranslation by calling this method
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID(){return mImage;}
}
