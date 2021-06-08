package com.example.user.nursery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView c1, c2,c3, c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = (CardView)findViewById(R.id.c1);
        c2 = (CardView)findViewById(R.id.c2);
        c3 = (CardView)findViewById(R.id.c3);
        c4 = (CardView)findViewById(R.id.c4);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Plants.class);
                startActivity(intent);

            }
        });


        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Seeds.class);
                startActivity(intent);
            }
        });





    }
}
