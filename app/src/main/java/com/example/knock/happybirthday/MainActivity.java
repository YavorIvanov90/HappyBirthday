package com.example.knock.happybirthday;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     MediaPlayer hbSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hbSound = MediaPlayer.create(this, R.raw.happy_birthday);


    }

    public void playSong (View view){

        final Button playSong = (Button) findViewById(R.id.play);

            if (hbSound.isPlaying()) {
                hbSound.pause();
                playSong.setText("Play");
            } else {
                hbSound.start();
                playSong.setText("Pause");
            }
        }
    }