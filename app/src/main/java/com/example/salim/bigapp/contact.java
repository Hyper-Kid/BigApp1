package com.example.salim.bigapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class contact extends AppCompatActivity {


    public ImageButton mail1;
    private void mail(){

        mail1= (ImageButton) findViewById(R.id.button4);
        mail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(contact.this,mail.class);
                startActivity(toy);
            }
        });
    }

    public ImageButton location1;
    private void location(){

        location1= (ImageButton) findViewById(R.id.imageButton);
        location1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(contact.this,Location.class);
                startActivity(toy);
            }
        });
    }

    public ImageButton call1;
    private void call(){

        call1= (ImageButton) findViewById(R.id.button5);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(contact.this,call.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        call();location();mail();

    }
}
