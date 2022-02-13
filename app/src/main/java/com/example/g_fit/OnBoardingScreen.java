package com.example.g_fit;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class OnBoardingScreen extends AppCompatActivity {

    ViewPager mSliderAdapter;
    LinearLayout mDotLayout;
    Button backBtn,  skipBtn, nextBtn;
    FirebaseAuth mAuth;


    TextView[] dots;
    ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onStart() {
        super.onStart();
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Intent i = new Intent(OnBoardingScreen.this,HomeScreen.class);
            startActivity(i);;

        }



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);

        skipBtn = findViewById(R.id.skipbtn);
        nextBtn = findViewById(R.id.nextbtn);
        backBtn = findViewById(R.id.backbtn);








        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OnBoardingScreen.this,GetStartedScreen.class);
                startActivity(i);
                finish();

            }
        });


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getitem(0) < 3)
                    mSliderAdapter.setCurrentItem(getitem(1),true);

                else {

                    Intent i = new Intent(OnBoardingScreen.this,GetStartedScreen.class);
                    startActivity(i);
                    finish();

                }

            }
        });


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getitem(0) > 0) {

                    mSliderAdapter.setCurrentItem(getitem(-1), true);
                }
            }
        });

        mSliderAdapter = (ViewPager) findViewById(R.id.viewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.indicator_layout);

        viewPagerAdapter = new ViewPagerAdapter(this);

        mSliderAdapter.setAdapter(viewPagerAdapter);

        setUpindicator (0);
        mSliderAdapter.addOnPageChangeListener(viewListener);

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void setUpindicator(int position){
        dots = new TextView[4];
        mDotLayout.removeAllViews();


        for (int i = 0; i < dots.length;i++){
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(50);
            dots[i].setTextColor(getResources().getColor(R.color.inactive, getApplicationContext().getTheme()));
            mDotLayout.addView(dots[i]);


        }

        dots[position].setTextColor(getResources().getColor(R.color.active, getApplicationContext().getTheme()));
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        public void onPageSelected(int position) {

            setUpindicator(position);

            if(position > 0){

                backBtn.setVisibility(View.VISIBLE);
            }else{
                backBtn.setVisibility(View.INVISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private int getitem(int i){

        return mSliderAdapter.getCurrentItem() + i;
    }
}