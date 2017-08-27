package com.example.windows10.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class inhumans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inhumans);

        Button button38 = (Button) findViewById(R.id.button38);

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent med = new Intent(getApplicationContext(),Medusa.class);
                startActivity(med);
            }
        });

        Button button39 = (Button) findViewById(R.id.button39);

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent blt = new Intent(getApplicationContext(),bolt.class);
                startActivity(blt);
            }
        });

        Button button40 = (Button) findViewById(R.id.button40);

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent max = new Intent(getApplicationContext(),Maximus.class);
                startActivity(max);
            }
        });

        Button button41 = (Button) findViewById(R.id.button41);

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kar = new Intent(getApplicationContext(),Karnak.class);
                startActivity(kar);
            }
        });

        Button button42 = (Button) findViewById(R.id.button42);

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lock = new Intent(getApplicationContext(),jaw.class);
                startActivity(lock);
            }
        });
    }
}
