package com.example.g_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeScreen extends AppCompatActivity {


    TextView users_email,user_name;
    Button mLogout;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);



        users_email = findViewById(R.id.useremail);
        mLogout = findViewById(R.id.logout_button);
        user_name = findViewById(R.id.username);
        mAuth = FirebaseAuth.getInstance();
    }


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            users_email.setText(currentUser.getEmail());
            user_name.setText(currentUser.getDisplayName());
        }


        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                users_email.setText("Working");
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(HomeScreen.this, LogInScreen.class);
                startActivity(intent);
            }
        });

    }
}