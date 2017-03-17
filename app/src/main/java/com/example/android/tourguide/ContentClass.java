package com.example.android.tourguide;

/**
 * Created by SHANEEB on 17-Mar-17.
 */

public class ContentClass {

    private String mTextData;
    private int mImageData = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public ContentClass(String textData, int imageData) {
        mTextData = textData;
        mImageData = imageData;
    }

    public ContentClass(String textData) {
        mTextData = textData;
    }

    public String getmTextData() {
        return mTextData;
    }

    public int getmImageData() {
        return mImageData;
    }

    public boolean hasImage() {
        return (mImageData != NO_IMAGE_PROVIDED);
    }

}
