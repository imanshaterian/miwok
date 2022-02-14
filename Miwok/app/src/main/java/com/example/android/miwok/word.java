package com.example.android.miwok;

public class word {
    //creating local string to store default words in it.
    private final String mDefaultTranslation;

    //creating local string to store miwok words in it.
    private final String mMiwokTranslation;

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
}
