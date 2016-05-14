package com.example.salim.bigapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FICT extends AppCompatActivity {

    public Button buttonLE1;
    public void buttonLE(){

        buttonLE1= (Button) findViewById(R.id.buttonLE);
        buttonLE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICT.this,Lecturers.class);
                startActivity(toy1);
            }
        });
    }

    public Button buttonPRO1;
    public void buttonPRO(){

        buttonPRO1= (Button) findViewById(R.id.buttonPRO);
        buttonPRO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICT.this,FICTProgrammes.class);
                startActivity(toy1);
            }
        });
    }


    public Button buttonGallery1;
    public void buttonGallery(){

        buttonGallery1= (Button) findViewById(R.id.buttonGallery);
        buttonGallery1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICT.this,Gallery.class);
                startActivity(toy1);
            }
        });
    }



    public Button map1;
    public void map(){

        map1= (Button) findViewById(R.id.buttonGraduates);
        map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICT.this,map.class);
                startActivity(toy1);
            }
        });
    }



    public ImageButton Contact1;
    private void Contact(){

        Contact1= (ImageButton) findViewById(R.id.imageButton2);
        Contact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(FICT.this,contact.class);
                startActivity(toy);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fict);
        buttonLE();
        buttonPRO();
        buttonGallery();
        Contact();
        map();


    }
}
