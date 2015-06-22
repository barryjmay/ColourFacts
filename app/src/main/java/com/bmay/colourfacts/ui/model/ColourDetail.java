package com.bmay.colourfacts.ui.model;

import android.widget.TextView;

/**
 * Created by BMay on 18/02/2015.
 */
public class ColourDetail {

    private TextView mTextView;
    private String mColour, mHexColour, mFact;

    public ColourDetail(String colour, String hexColour , String fact) {
        mColour = colour;
        mHexColour = hexColour;
        mFact = fact;
    }

    public TextView getTextView() {
        return mTextView;
    }

    public void setTextView(TextView textView) {
        mTextView = textView;
    }

    public String getColour() {
        return mColour;
    }

    public void setColour(String colour) {
        mColour = colour;
    }

    public String getHexColour() {
        return mHexColour;
    }

    public void setHexColour(String hexColour) {
        mHexColour = hexColour;
    }

    public String getFact() {
        return mFact;
    }

    public void setFact(String fact) {
        mFact = fact;
    }
}
