// Generated by view binder compiler. Do not edit!
package com.example.g_fit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityLogInScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button siButton;

  @NonNull
  public final EditText siEmail;

  @NonNull
  public final EditText siPassword;

  @NonNull
  public final TextView suPageButton;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView7;

  private ActivityLogInScreenBinding(@NonNull ConstraintLayout rootView, @NonNull Button siButton,
      @NonNull EditText siEmail, @NonNull EditText siPassword, @NonNull TextView suPageButton,
      @NonNull TextView textView, @NonNull TextView textView3, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.siButton = siButton;
    this.siEmail = siEmail;
    this.siPassword = siPassword;
    this.suPageButton = suPageButton;
    this.textView = textView;
    this.textView3 = textView3;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLogInScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLogInScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_log_in_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLogInScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.siButton;
      Button siButton = ViewBindings.findChildViewById(rootView, id);
      if (siButton == null) {
        break missingId;
      }

      id = R.id.siEmail;
      EditText siEmail = ViewBindings.findChildViewById(rootView, id);
      if (siEmail == null) {
        break missingId;
      }

      id = R.id.siPassword;
      EditText siPassword = ViewBindings.findChildViewById(rootView, id);
      if (siPassword == null) {
        break missingId;
      }

      id = R.id.suPageButton;
      TextView suPageButton = ViewBindings.findChildViewById(rootView, id);
      if (suPageButton == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityLogInScreenBinding((ConstraintLayout) rootView, siButton, siEmail,
          siPassword, suPageButton, textView, textView3, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
