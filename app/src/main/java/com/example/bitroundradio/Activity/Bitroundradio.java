package com.example.bitroundradio.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bitroundradio.R;

public class Bitroundradio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LitePal.initalize(this);
        setContentView(R.layout.activity_main);

    }


}