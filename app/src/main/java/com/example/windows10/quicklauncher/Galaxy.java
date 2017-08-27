package com.example.windows10.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Galaxy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxy);

        Button button33= (Button) findViewById(R.id.button33);

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent star = new Intent(getApplicationContext(),lord.class);
                startActivity(star);
            }
        });

        Button button34= (Button) findViewById(R.id.button34);

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rock = new Intent(getApplicationContext(),Rocket.class);
                startActivity(rock);
            }
        });

        Button button35= (Button) findViewById(R.id.button35);

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent grut = new Intent(getApplicationContext(),groot.class);
                startActivity(grut);
            }
        });

        Button button36= (Button) findViewById(R.id.button36);

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rax = new Intent(getApplicationContext(),drax.class);
                startActivity(rax);
            }
        });

        Button button37= (Button) findViewById(R.id.button37);

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gam = new Intent(getApplicationContext(),Gamora.class);
                startActivity(gam);
            }
        });
    }
}
