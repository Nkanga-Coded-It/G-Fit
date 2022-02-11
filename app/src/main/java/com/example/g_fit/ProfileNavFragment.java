package com.example.g_fit;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class ProfileNavFragment extends Fragment {

    TextView dEmail;
    Button mLogout;
    FirebaseAuth mAuth;

    FirebaseUser user;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_nav, container, false);
        dEmail = (TextView) view.findViewById(R.id.user_email);
        mLogout = (Button) view.findViewById(R.id.logout_button);
        mAuth = FirebaseAuth.getInstance();
        return  view;
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            dEmail.setText(currentUser.getEmail());
           //dUsername.setText("currentUser.getUid()");









        }
        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dEmail.setText("Working");
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getActivity(), LogInScreen.class);
                startActivity(intent);
            }
        });

        user = mAuth.getCurrentUser();












    }
}