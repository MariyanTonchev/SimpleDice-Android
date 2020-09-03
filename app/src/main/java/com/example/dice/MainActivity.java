package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private MediaPlayer mediaPlayer;
    private Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.dice_roll);
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                rollDice();
            }
        });
    }

    private void rollDice(){
        int randomNumber = random.nextInt(6) + 1;
        switch (randomNumber){
            case 1:
                imageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice6);
                break;
        }
    }
}