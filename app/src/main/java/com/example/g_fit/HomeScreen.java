package com.example.g_fit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.g_fit.databinding.ActivityHomescreenBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeScreen extends AppCompatActivity {


    ActivityHomescreenBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomescreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeNavFragment()).commit();

        }


        binding.bottomNavigationView.setOnItemSelectedListener(item -> {



            switch (item.getItemId()){

                case R.id.home:
                    replaceFragment(new HomeNavFragment());
                    break;
                case R.id.exercise:
                    replaceFragment(new ExerciseNavFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileNavFragment());
                    break;
            }

          return  true;
        });




    }
        private void replaceFragment(Fragment fragment){

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout,fragment );
            fragmentTransaction.commit();


        }



}