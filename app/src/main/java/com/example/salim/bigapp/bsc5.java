package com.example.salim.bigapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class bsc5 extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipper;
    Button next;
    Button prev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc5);


        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper1);
        next = (Button)findViewById(R.id.NEXT);
        prev = (Button)findViewById(R.id.previous);

        next.setOnClickListener(this);
        prev.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v == next){
            viewFlipper.showNext();
        }
        else if (v == prev){
            viewFlipper.showPrevious();

        }
    }}