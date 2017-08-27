package com.example.windows10.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class X_men extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_men);

        Button button21 = (Button) findViewById(R.id.button21);

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent logan = new Intent(getApplicationContext(),Wolverine.class);
                startActivity(logan);

            }
        });


        Button button22 = (Button) findViewById(R.id.button22);

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent professor = new Intent(getApplicationContext(),X.class);
                startActivity(professor);

            }
        });

        Button button23 = (Button) findViewById(R.id.button23);

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cyc = new Intent(getApplicationContext(),cycle.class);
                startActivity(cyc);

            }
        });

        Button button24 = (Button) findViewById(R.id.button24);

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent strm = new Intent(getApplicationContext(),storm.class);
                startActivity(strm);

            }
        });

        Button button25 = (Button) findViewById(R.id.button25);

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jean = new Intent(getApplicationContext(),gray.class);
                startActivity(jean);

            }
        });

        Button button26 = (Button) findViewById(R.id.button26);

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mg = new Intent(getApplicationContext(),magneto.class);
                startActivity(mg);

            }
        });

        Button button27 = (Button) findViewById(R.id.button27);

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent my = new Intent(getApplicationContext(),mys.class);
                startActivity(my);

            }
        });
    }
}
