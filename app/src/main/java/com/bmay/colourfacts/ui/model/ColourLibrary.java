package com.bmay.colourfacts.ui.model;

import android.util.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Created by BMay on 18/02/2015.
 */
public class ColourLibrary {

    private ColourDetail [] mColourDetail;

    public ColourLibrary(){
        mColourDetail = new ColourDetail[2];

        mColourDetail[0] = new ColourDetail("white",
                "#ffffff",
                "White is the true colour of the Sun. It only appears yellow to us because of our atmosphere, which breaks light into colours in the lower end of its spectrum. In space where light isn't broken down it will appear white. Next time you meet an Astronaut, why not ask them?");

        mColourDetail[1] = new ColourDetail("red",
                "#ff4444",
                "Men and women see the colour red very differently. Whilst women see maroon, cardinal and crimson men cannot distinguish between these varying hues. The explanation is provided by genes: women have two X chromosomes, while men only possess one. Because the particular “red-seeing gene” sits on the X chromosome, it only makes sense that women would have a full understanding of the red spectrum, while men do not. Therefore, ladies, if you’re one of those who just cannot make a decision when picking out a shade of lipstick, don’t put so much pressure on yourself. It’s really of very little importance.");
    }

    public void getColourDetail (String colour){
        List<ColourDetail> colourDetailList = Arrays.asList(mColourDetail);
        if (colourDetailList.contains(colour)){
            Log.d("ColourLibrary", "the colour was: " + colour);
        }
        //return mColourDetail[];
    }


}
