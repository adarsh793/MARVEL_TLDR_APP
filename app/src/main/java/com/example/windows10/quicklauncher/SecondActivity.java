package com.example.windows10.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.windows10.quicklauncher.SOMETHING")) {
           // TextView tv = (TextView) findViewById(R.id.textView2);
            //String text = getIntent().getExtras().getString("com.example.windows10.quicklauncher.SOMETHING");
            //tv.setText(text);

        }

        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent avg = new Intent(getApplicationContext(),Avengers.class);
                startActivity(avg);
            }
        });

        Button button8 = (Button) findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent men = new Intent(getApplicationContext(),X_men.class);
                startActivity(men);
            }
        });

        Button button9=(Button) findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent humans = new Intent(getApplicationContext(),inhumans.class);
                startActivity(humans);
            }
        });

        Button button10 = (Button) findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent defenders = new Intent(getApplicationContext(),defenders.class);
                startActivity(defenders);
            }
        });

        Button button11 = (Button) findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent galaxy = new Intent(getApplicationContext(),Galaxy.class);
                startActivity(galaxy);
            }
        });

        Button button12 = (Button) findViewById(R.id.button12);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent spidey = new Intent(getApplicationContext(),spider.class);
                startActivity(spidey);
            }
        });

        Button button13 = (Button) findViewById(R.id.button13);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent deadpool = new Intent(getApplicationContext(),dead.class);
                startActivity(deadpool);
            }
        });



    }
}
