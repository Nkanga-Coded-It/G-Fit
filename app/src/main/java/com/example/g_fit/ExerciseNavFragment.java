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


        int[] imageID = {R.drawable.bicep_curl_header,R.drawable.squats_header,R.drawable.pullup_header,R.drawable.pushup};
        String [] exerciseName = {"Bicep Curl","Squat","Standing Press","PushUp"};
        String [] musclesInvolved = {"Biceps","Leg and Ass","Shoulders","Chest"};
        String [] exerciseDifficulty = {"Hard","Easy","Intermediate","Easy"};
        String [] exerciseDescription = {"1.Start standing with a dumbbell in each hand. Your elbows should rest at your sides and your forearms should extend out in front of your body.\n" +" \n"+
                "2.Bring the dumbbells all the way up to your shoulders by bending your elbows.\n" +" \n"+
                "3.Reverse the curl slowly and repeat.", " 1.Stand straight with feet hip-width apart.\n" + " \n"+ "2.Tighten your stomach muscles.\n" + " \n"+ "3: Lower down, as if sitting in an invisible chair.\n" + " \n"+
                        "4.Straighten your legs to lift back up.\n" + " \n"+
                        "5.Repeat the movement.",



                "1.Exhale while pulling yourself up so your chin is level with the bar. Pause at the top.\n" +" \n"+
                        "2.Lower yourself (inhaling as you go down) until your elbows are straight.\n" +" \n"+
                        "3.Repeat the movement without touching the floor.\n" +" \n"+
                        "4.Complete the number of repetitions your workout requires.","1.1Get down on all fours, placing your hands slightly wider than your shoulders.\n" +" \n"+
                "2.Straighten your arms and legs.\n" +" \n"+
                "3.Lower your body until your chest nearly touches the floor.\n" +" \n"+
                "4.Pause, then push yourself back up.\n" +" \n"+
                "5.Repeat."};


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