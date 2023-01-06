package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redyToPlay();
    }

    public void redyToPlay() {
        mp = MediaPlayer.create(this, R.raw.angel);
    }

    public void playButtonClicked(View view) {
        mp.start();
    }

    public void PauseButtonClicked(View view) {
        mp.pause();
    }

    public void StopButonClicked(View view) {
        mp.stop();
        redyToPlay();
    }
}
