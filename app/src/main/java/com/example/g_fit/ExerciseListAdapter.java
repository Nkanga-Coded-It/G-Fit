package com.example.g_fit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ExerciseListAdapter extends ArrayAdapter<User2> {


    public ExerciseListAdapter(Context context, ArrayList<User2> user2ArrayList) {
        super(context,R.layout.exercise_list, user2ArrayList);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        User2 user2 = getItem(position);

        if(convertView == null){



            convertView = LayoutInflater.from(getContext()).inflate(R.layout.exercise_list, parent, false);

        }

        ImageView imageView = convertView.findViewById(R.id.exercise_image);
        TextView nameOfExercise = convertView.findViewById(R.id.exercise_name);
        TextView difficultyOfExercise = convertView.findViewById(R.id.exercise_difficulty);
        TextView musclesInvolvedInExercise = convertView.findViewById(R.id.muscles_involved);




        imageView.setImageResource(user2.imageID);
        nameOfExercise.setText(user2.exerciseName);
        difficultyOfExercise.setText(user2.exerciseDifficulty);
        musclesInvolvedInExercise.setText(user2.musclesInvolved);



        return convertView;





    }
}
