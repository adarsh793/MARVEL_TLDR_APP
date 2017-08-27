package com.example.windows10.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.button);
        ImageView image=(ImageView) findViewById(R.id.image);

        //Attempts to launch an activity within our own app
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startIntent = new Intent(getApplicationContext(),SecondActivity.class);
                //pass information to another activity
                startIntent.putExtra("com.example.windows10.quicklauncher.SOMETHING" ,"Hello! Welcome to second slide");
                startActivity(startIntent);
            }
        });

        //Attempts to launch an activity outside our app

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String google = "https://www.google.co.in";
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);

                if(gotoGoogle.resolveActivity(getPackageManager())!= null) {
                    startActivity(gotoGoogle);
                }
            }
        });

        Button button7= (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String marvel = "https://www.marvel.com";
                Uri address = Uri.parse(marvel);
                Intent go = new Intent(Intent.ACTION_VIEW, address);

                if(go.resolveActivity(getPackageManager())!=null){
                    startActivity(go);
                }
            }
        });
    }
}
