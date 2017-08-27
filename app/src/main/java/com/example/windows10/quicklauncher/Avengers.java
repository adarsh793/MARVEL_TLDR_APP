package com.example.windows10.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Avengers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers);

        Button button14 = (Button) findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ironman = new Intent(getApplicationContext(),iron_man.class);
                startActivity(ironman);

            }
        });

        Button button15 = (Button) findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent camerica = new Intent(getApplicationContext(),captain.class);
                startActivity(camerica);
            }
        });

        Button button16 = (Button) findViewById(R.id.button16);

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent thr= new Intent(getApplicationContext(),thor.class);
                startActivity(thr);
            }
        });

        Button button17 = (Button) findViewById(R.id.button17);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent eye = new Intent(getApplicationContext(),Hawkeye.class);
                startActivity(eye);
            }
        });

        Button button18 = (Button) findViewById(R.id.button18);

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hlk = new Intent(getApplicationContext(),Hulk.class);
                startActivity(hlk);

            }
        });

        Button button19 = (Button) findViewById(R.id.button19);

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent widow = new Intent(getApplicationContext(),black.class);
                startActivity(widow);

            }
        });

        Button button20 = (Button) findViewById(R.id.button20);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent flcn = new Intent(getApplicationContext(),falcon.class);
                startActivity(flcn);

            }
        });


    }
}
