package com.example.g_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private static int TIME = 5000;

    //Variables  declarationS
    ImageView Logo ;
    ImageView Artwork ;
    Animation SlideUp ;
    Animation SlideDown;
    Animation SlideLeft;
    ImageView Description ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //To Hide Status Bar (Battery percentage, time e.t.c)
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        // Variables initialization
         Logo =  findViewById(R.id.g_fit_logo);
         Artwork = findViewById(R.id.spashScreen_ArtworK);
         Description =  findViewById(R.id.splashscreen_project_by);
         SlideUp = AnimationUtils.loadAnimation(this,R.anim.slideup_animation);
         SlideDown= AnimationUtils.loadAnimation(this,R.anim.slidedown_animation);
         SlideLeft= AnimationUtils.loadAnimation(this,R.anim.slideleft_animation);


        //Setting Animation
        Logo.setAnimation(SlideDown);
        Artwork.setAnimation(SlideUp);
        Description.setAnimation(SlideLeft);

        //splash screen run time and start of next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,OnBoardingScreen.class);
                startActivity(intent);
                finish();
            }
        },TIME);





    }
}