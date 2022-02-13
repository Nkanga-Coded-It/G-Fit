package com.example.g_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.g_fit.databinding.ActivityExercisePageBinding;

public class ExercisePage extends AppCompatActivity {

    ActivityExercisePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExercisePageBinding.inflate(getLayoutInflater());
                setContentView(binding.getRoot());


        Intent intent = this.getIntent();

        if (intent != null) {
            int imageID = intent.getIntExtra("imageID",R.drawable.situp);
            String exerciseDescription = intent.getStringExtra("exerciseDescription");
            String nameOfTheExercise = intent.getStringExtra("exerciseName");
            String musclesInvolvedInTheExercise = intent.getStringExtra("musclesInvolved");
            String difficultyOfTheExercise = intent.getStringExtra("exerciseDifficulty");

            binding.imageOfWorkout.setImageResource(imageID);
            binding.descriptionOfTheExercise.setText(exerciseDescription);
            binding.nameOfTheExercise.setText(nameOfTheExercise);
            binding.muslcesTargerted.setText(musclesInvolvedInTheExercise);
            binding.difficulty.setText(difficultyOfTheExercise);


        }
    }
}