package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button ask = (Button) findViewById(R.id.askbutton);

        final ImageView ball = (ImageView) findViewById(R.id.fortuneimage);

        final int [] ballarr = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Magic Eight Ball","The button has been pressed!");

                Random randomnogen1 = new Random();

                int no = randomnogen1.nextInt(5);

                Log.d("Magic Eight Ball","The no generated on the ball is:"+no);

                ball.setImageResource(ballarr[no]);



            }
        });














    }
}
