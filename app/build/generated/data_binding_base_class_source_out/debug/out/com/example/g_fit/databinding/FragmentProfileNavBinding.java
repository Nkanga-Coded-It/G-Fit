// Generated by view binder compiler. Do not edit!
package com.example.g_fit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class FragmentProfileNavBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button logoutButton;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView userEmail;

  @NonNull
  public final TextView useremail3;

  @NonNull
  public final View view;

  private FragmentProfileNavBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button logoutButton, @NonNull TextView textView2, @NonNull TextView userEmail,
      @NonNull TextView useremail3, @NonNull View view) {
    this.rootView = rootView;
    this.logoutButton = logoutButton;
    this.textView2 = textView2;
    this.userEmail = userEmail;
    this.useremail3 = useremail3;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileNavBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileNavBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile_nav, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileNavBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logout_button;
      Button logoutButton = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.user_email;
      TextView userEmail = ViewBindings.findChildViewById(rootView, id);
      if (userEmail == null) {
        break missingId;
      }

      id = R.id.useremail3;
      TextView useremail3 = ViewBindings.findChildViewById(rootView, id);
      if (useremail3 == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new FragmentProfileNavBinding((ConstraintLayout) rootView, logoutButton, textView2,
          userEmail, useremail3, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}