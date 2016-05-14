package com.example.salim.bigapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first extends AppCompatActivity {
    public Button Abuot1;
    public void Abuot(){

        Abuot1= (Button) findViewById(R.id.button);
        Abuot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(first.this,second.class);
                startActivity(toy);
            }
        });
    }
    public Button Student1;
    public void Student(){

        Student1= (Button) findViewById(R.id.button3);
        Student1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(first.this,secondone.class);
                startActivity(toy1);
            }
        });
    }

    public Button FICT1;
    public void FICT(){

        FICT1= (Button) findViewById(R.id.FICT);
        FICT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(first.this,FICT.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Abuot();
        Student();
        FICT();

    }
}