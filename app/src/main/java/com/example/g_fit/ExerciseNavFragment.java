package com.example.g_fit;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import com.example.g_fit.databinding.FragmentExerciseNavBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class ExerciseNavFragment extends Fragment {

    FragmentExerciseNavBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentExerciseNavBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        int[] imageID = {R.drawable.situp,R.drawable.meditate,R.drawable.stretching,R.drawable.pushup};
        String [] exerciseName = {"Bicep Curl","Squat","Standing Press","PushUp"};
        String [] musclesInvolved = {"Biceps","Leg and Ass","Shoulders","Chest"};
        String [] exerciseDifficulty = {"Hard","Easy","Intermediate","Easy"};
        String [] exerciseDescription = {"asasasasasas","asasasasasasasa","asassasas","1.Keep your arms straight, your butt clenched, your core tightened, and your elbows as even with the floor as you can.\n" +
                "2.Gradually lower yourself until each elbow is at a 90-degree angle or less.\n" +
                "3.Try to go all the way down until either your chest or nose or chin lightly touches the floor, inhaling along the way.\n" +
                "4.Once your chest or nose or chin is touching the floor, hold for a brief pause before thrusting yourself back into the starting position, exhaling as you go.\n" +
                "5.Prevent your elbows from flying outward during each rep and keep them somewhat close to your body.\n" +
                "6.Maintain a steady and consistent formation throughout each rep.\n" +
                "7.Perform as many reps as you can until you feel that you can no longer maintain the plank-like formation or prevent your elbows from pointing away from you."};


        ArrayList<User2> user2ArrayList = new ArrayList<>();


        for(int i = 0;i< imageID.length;i++){

            User2 user2 = new User2(exerciseName[i],musclesInvolved[i],exerciseDifficulty[i],exerciseDescription[i],imageID[i]);
            user2ArrayList.add(user2);


        }

        ExerciseListAdapter exerciseListAdapter = new ExerciseListAdapter(getActivity(),user2ArrayList);


        binding.exerciseLists.setAdapter(exerciseListAdapter);
        binding.exerciseLists.setClickable(true);
        binding.exerciseLists.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {




                Intent intent = new Intent(getActivity(),ExercisePage.class);
                intent.putExtra("imageID",imageID[position]);
                intent.putExtra("exerciseDescription",exerciseDescription[position]);
                intent.putExtra("exerciseName",exerciseName[position]);
                intent.putExtra("musclesInvolved",musclesInvolved[position]);
                intent.putExtra("exerciseDifficulty",exerciseDifficulty[position]);
                startActivity(intent);





            }
        });







    }
}