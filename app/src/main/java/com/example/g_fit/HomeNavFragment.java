package com.example.g_fit;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class HomeNavFragment extends Fragment {

    TextView currentDate;
    TextView greeting ;
    ImageView symbol;
    Drawable drawable;
    ConstraintLayout mFullBody;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_nav, container, false);


        currentDate = (TextView) view.findViewById(R.id.date);
        greeting = (TextView) view.findViewById(R.id.greeting);
        symbol = (ImageView) view.findViewById(R.id.hourOfTheDay);
        currentDate.setText(getCurrentDay());


        view.findViewById(R.id.fullBody_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), FullBodyExercise.class);
                startActivity(intent);

            }
        });


        view.findViewById(R.id.meditateCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), MeditationExercise.class);
                startActivity(intent);

            }
        });

        view.findViewById(R.id.cardioCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), CardioExercise.class);
                startActivity(intent);

            }
        });

        view.findViewById(R.id.partnerCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ExercsieWithAPartner.class);
                startActivity(intent);

            }
        });

        view.findViewById(R.id.equipmentCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ExerciseWithEquipments.class);
                startActivity(intent);

            }
        });






        Calendar calendar = Calendar.getInstance();

        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay <12) {
            //print out good morning
            greeting.setText("Good Morning");
            drawable = getResources().getDrawable(R.drawable.sun);
            symbol.setImageDrawable(drawable);


        }
        else if(timeOfDay >= 12 && timeOfDay <16){
            //Print out good afternoon
            greeting.setText("Good Afternoon");
            drawable = getResources().getDrawable(R.drawable.sunset);
            symbol.setImageDrawable(drawable);

        }
        else if(timeOfDay >= 12  && timeOfDay <21){
            //Print out good evening
            greeting.setText("Good Evening");
            drawable = getResources().getDrawable(R.drawable.moon);
            symbol.setImageDrawable(drawable);


        }
        else {
            //Print out good night
            greeting.setText("Good Night");
            drawable = getResources().getDrawable(R.drawable.moon);
            symbol.setImageDrawable(drawable);


        }


        return  view;







    }




    private static String getCurrentDay() {

        return new SimpleDateFormat("EEE,dd MMM ", Locale.getDefault()).format(new Date());






    }
}