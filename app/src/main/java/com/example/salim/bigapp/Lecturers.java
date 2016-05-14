package com.example.salim.bigapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Lecturers extends AppCompatActivity implements View.OnClickListener {


    ViewFlipper viewFlipper2;
    Button next1;
    Button prev1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturers);

        viewFlipper2 = (ViewFlipper)findViewById(R.id.viewFlipper2);
        next1 = (Button)findViewById(R.id.NEXT1);
        prev1 = (Button)findViewById(R.id.previous1);

        next1.setOnClickListener(this);
        prev1.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if(view == next1){
            viewFlipper2.showNext();
        }
        else if (view == prev1){
            viewFlipper2.showPrevious();

        }
    }}


