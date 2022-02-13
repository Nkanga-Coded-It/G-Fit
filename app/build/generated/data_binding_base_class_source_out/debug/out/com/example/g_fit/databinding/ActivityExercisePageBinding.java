// Generated by view binder compiler. Do not edit!
package com.example.g_fit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.g_fit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExercisePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView descriptionOfTheExercise;

  @NonNull
  public final TextView difficulty;

  @NonNull
  public final ImageView imageOfWorkout;

  @NonNull
  public final TextView muslcesTargerted;

  @NonNull
  public final TextView nameOfTheExercise;

  private ActivityExercisePageBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView descriptionOfTheExercise, @NonNull TextView difficulty,
      @NonNull ImageView imageOfWorkout, @NonNull TextView muslcesTargerted,
      @NonNull TextView nameOfTheExercise) {
    this.rootView = rootView;
    this.descriptionOfTheExercise = descriptionOfTheExercise;
    this.difficulty = difficulty;
    this.imageOfWorkout = imageOfWorkout;
    this.muslcesTargerted = muslcesTargerted;
    this.nameOfTheExercise = nameOfTheExercise;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExercisePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExercisePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_exercise_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExercisePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description_of_the_exercise;
      TextView descriptionOfTheExercise = ViewBindings.findChildViewById(rootView, id);
      if (descriptionOfTheExercise == null) {
        break missingId;
      }

      id = R.id.difficulty;
      TextView difficulty = ViewBindings.findChildViewById(rootView, id);
      if (difficulty == null) {
        break missingId;
      }

      id = R.id.image_of_workout;
      ImageView imageOfWorkout = ViewBindings.findChildViewById(rootView, id);
      if (imageOfWorkout == null) {
        break missingId;
      }

      id = R.id.muslces_targerted;
      TextView muslcesTargerted = ViewBindings.findChildViewById(rootView, id);
      if (muslcesTargerted == null) {
        break missingId;
      }

      id = R.id.name_of_the_exercise;
      TextView nameOfTheExercise = ViewBindings.findChildViewById(rootView, id);
      if (nameOfTheExercise == null) {
        break missingId;
      }

      return new ActivityExercisePageBinding((ConstraintLayout) rootView, descriptionOfTheExercise,
          difficulty, imageOfWorkout, muslcesTargerted, nameOfTheExercise);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}