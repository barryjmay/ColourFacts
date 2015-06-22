package com.bmay.colourfacts.ui.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.bmay.colourfacts.R;
import com.bmay.colourfacts.ui.model.ColourDetail;
import com.bmay.colourfacts.ui.model.ColourLibrary;

public class ColourActivity extends ActionBarActivity {

    private TextView mFactView;
    private ColourLibrary mColourLibrary = new ColourLibrary();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour);

        mFactView = (TextView) findViewById(R.id.factView);

        Intent intent = getIntent();
        String colour = intent.getStringExtra("Colour");
        mFactView.setText(colour);
        //Log.d("ColourActivity", "the colour is: " + colour);

        mColourLibrary.getColourDetail(colour);


    }


}
