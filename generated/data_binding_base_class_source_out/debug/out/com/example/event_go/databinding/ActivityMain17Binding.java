// Generated by view binder compiler. Do not edit!
package com.example.event_go.databinding;

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
import com.example.event_go.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain17Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button b171;

  @NonNull
  public final Button b172;

  @NonNull
  public final EditText ed171;

  @NonNull
  public final TextView tv171;

  @NonNull
  public final TextView tv172;

  private ActivityMain17Binding(@NonNull ConstraintLayout rootView, @NonNull Button b171,
      @NonNull Button b172, @NonNull EditText ed171, @NonNull TextView tv171,
      @NonNull TextView tv172) {
    this.rootView = rootView;
    this.b171 = b171;
    this.b172 = b172;
    this.ed171 = ed171;
    this.tv171 = tv171;
    this.tv172 = tv172;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain17Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain17Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main17, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain17Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.b171;
      Button b171 = ViewBindings.findChildViewById(rootView, id);
      if (b171 == null) {
        break missingId;
      }

      id = R.id.b172;
      Button b172 = ViewBindings.findChildViewById(rootView, id);
      if (b172 == null) {
        break missingId;
      }

      id = R.id.ed171;
      EditText ed171 = ViewBindings.findChildViewById(rootView, id);
      if (ed171 == null) {
        break missingId;
      }

      id = R.id.tv171;
      TextView tv171 = ViewBindings.findChildViewById(rootView, id);
      if (tv171 == null) {
        break missingId;
      }

      id = R.id.tv172;
      TextView tv172 = ViewBindings.findChildViewById(rootView, id);
      if (tv172 == null) {
        break missingId;
      }

      return new ActivityMain17Binding((ConstraintLayout) rootView, b171, b172, ed171, tv171,
          tv172);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
