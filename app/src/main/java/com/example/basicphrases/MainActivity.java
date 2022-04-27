package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play1(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.goodby);
        music.start();

    }

    public void play2(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.howareyou);
        music.start();
    }

    public void play3(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.iamfine);
        music.start();
    }

    public void play4(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.ihateyou);
        music.start();
    }

    public void play5(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.iloveyou);
        music.start();
    }

    public void play6(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.mynameis);
        music.start();
    }

    public void play7(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.nicetomeetyou);
        music.start();
    }

    public void play8(View view) {
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.welcome);
        music.start();
    }
}