package com.example.salim.bigapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FICTProgrammes extends AppCompatActivity {



    public Button bsc1;
    public void buttonbsc(){

        bsc1= (Button) findViewById(R.id.buttonbsc);
        bsc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,BSc.class);
                startActivity(toy1);
            }
        });
    }

    public Button buttonPRO1;
    public void buttonPRO(){

        buttonPRO1= (Button) findViewById(R.id.buttonPRO1);
        buttonPRO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,BSc.class);
                startActivity(toy1);
            }
        });
    }


    public Button buttonGraduates1;
    public void buttonGraduates(){

        buttonGraduates1= (Button) findViewById(R.id.buttonGraduates1);
        buttonGraduates1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,BSc.class);
                startActivity(toy1);
            }
        });
    }

    public Button buttonGallery1;
    public void buttonGallery(){

        buttonGallery1= (Button) findViewById(R.id.buttonGallery1);
        buttonGallery1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,BSc.class);
                startActivity(toy1);
            }
        });
    }

    public Button button61;
    public void button61(){

        button61= (Button) findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,bsc5.class);
                startActivity(toy1);
            }
        });
    }

    public Button button71;
    public void button71(){

        button71= (Button) findViewById(R.id.button71);
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,bsc6.class);
                startActivity(toy1);
            }
        });
    }


    public Button button81;
    public void button81(){

        button81= (Button) findViewById(R.id.button81);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,bsc6.class);
                startActivity(toy1);
            }
        });
    }


    public Button button6;
    public void button6(){

        button81= (Button) findViewById(R.id.button6);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,bsc6.class);
                startActivity(toy1);
            }
        });
    }



    public Button button101;
    public void button101(){

        button101= (Button) findViewById(R.id.button101);
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(FICTProgrammes.this,bsc5.class);
                startActivity(toy1);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fictprogrammes);
        buttonbsc();buttonGraduates();button71();button101();
        buttonPRO();buttonGallery();button61();button81(); button6();
    }
}
