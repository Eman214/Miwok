package com.example.android.miwok;

import android.media.MediaPlayer;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation, and an image for that word.
 */
public class Word {

    //String value for default translation of the word
    private String mDefaultTranslation;

    //String value for Miwok translation of the word
    private String mMiwokTranslation;

    //Image resource ID for the words
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;



    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in the language the user has set on their device
     * @param miwokTranslation is the word in the Miwok language.
     * @param audioResourceId is the raw resource ID for the Miwok audio file
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in the language the user has set on their device
     * @param miwokTranslation is the word in the Miwok language.
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the raw resource ID for the Miwok audio file
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }



    /**
     * Gets the string value for the defaultTranslation.
     *
     * @return current text.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     * Gets the string value for the miwokTranslation.
     *
     * @return current text.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     *
     * @return resource ID for the image
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @returns whether or not there is an image in this word object.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * @returns the sudio resource Id for the word object
     */
    public int getAudioResourceId() { return mAudioResourceId; }

}
