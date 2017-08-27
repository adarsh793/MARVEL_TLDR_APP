package com.example.windows10.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class defenders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defenders);

        Button button28= (Button) findViewById(R.id.button28);

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dare = new Intent(getApplicationContext(),daredevil.class);
                startActivity(dare);
            }
        });

        Button button29= (Button) findViewById(R.id.button29);

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jones = new Intent(getApplicationContext(),jessica.class);
                startActivity(jones);
            }
        });

        Button button30= (Button) findViewById(R.id.button30);

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cage = new Intent(getApplicationContext(),Luke.class);
                startActivity(cage);
            }
        });

        Button button31= (Button) findViewById(R.id.button31);

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fist = new Intent(getApplicationContext(),Iron.class);
                startActivity(fist);
            }
        });

        Button button32= (Button) findViewById(R.id.button32);

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pun = new Intent(getApplicationContext(),Punisher.class);
                startActivity(pun);
            }
        });
    }

}
