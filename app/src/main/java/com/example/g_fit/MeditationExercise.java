package com.example.g_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MeditationExercise extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_exercise);

    }

    public void play(View V){
        if (player == null) {
            player =MediaPlayer.create(this,R.raw.senses_and_breath);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }


    public void pause(View V){
        if (player != null) {
            player.pause();
        }

    }

    public void stop(View V){
        stopPlayer();

        }

    private void stopPlayer() {
            if (player != null) {
                player.release();
                player = null;

            }


            }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
