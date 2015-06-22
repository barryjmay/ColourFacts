package com.bmay.colourfacts.ui.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bmay.colourfacts.R;


public class MainActivity extends ActionBarActivity {

    private TextView mMainScreenText;
    private EditText mColourText;
    private Button mFindFactButton;
    private String mSelectedColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainScreenText = (TextView)findViewById(R.id.mainScreenText);
        mColourText = (EditText)findViewById(R.id.colourText);
        mFindFactButton = (Button)findViewById(R.id.findFactButton);

        mFindFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSelectedColour = mColourText.getText().toString();
                Intent intent = new Intent(MainActivity.this, ColourActivity.class);
                intent.putExtra("Colour", mSelectedColour);
                startActivity(intent);
            }
        });

    }




}
