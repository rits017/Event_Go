// Generated by view binder compiler. Do not edit!
package com.example.event_go.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.event_go.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain9Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button b91;

  @NonNull
  public final EditText ed91;

  @NonNull
  public final EditText ed92;

  @NonNull
  public final EditText ed93;

  @NonNull
  public final EditText ed94;

  @NonNull
  public final EditText ed95;

  @NonNull
  public final EditText ed96;

  @NonNull
  public final EditText ed97;

  @NonNull
  public final EditText ed98;

  private ActivityMain9Binding(@NonNull ConstraintLayout rootView, @NonNull Button b91,
      @NonNull EditText ed91, @NonNull EditText ed92, @NonNull EditText ed93,
      @NonNull EditText ed94, @NonNull EditText ed95, @NonNull EditText ed96,
      @NonNull EditText ed97, @NonNull EditText ed98) {
    this.rootView = rootView;
    this.b91 = b91;
    this.ed91 = ed91;
    this.ed92 = ed92;
    this.ed93 = ed93;
    this.ed94 = ed94;
    this.ed95 = ed95;
    this.ed96 = ed96;
    this.ed97 = ed97;
    this.ed98 = ed98;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain9Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain9Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main9, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain9Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.b91;
      Button b91 = ViewBindings.findChildViewById(rootView, id);
      if (b91 == null) {
        break missingId;
      }

      id = R.id.ed91;
      EditText ed91 = ViewBindings.findChildViewById(rootView, id);
      if (ed91 == null) {
        break missingId;
      }

      id = R.id.ed92;
      EditText ed92 = ViewBindings.findChildViewById(rootView, id);
      if (ed92 == null) {
        break missingId;
      }

      id = R.id.ed93;
      EditText ed93 = ViewBindings.findChildViewById(rootView, id);
      if (ed93 == null) {
        break missingId;
      }

      id = R.id.ed94;
      EditText ed94 = ViewBindings.findChildViewById(rootView, id);
      if (ed94 == null) {
        break missingId;
      }

      id = R.id.ed95;
      EditText ed95 = ViewBindings.findChildViewById(rootView, id);
      if (ed95 == null) {
        break missingId;
      }

      id = R.id.ed96;
      EditText ed96 = ViewBindings.findChildViewById(rootView, id);
      if (ed96 == null) {
        break missingId;
      }

      id = R.id.ed97;
      EditText ed97 = ViewBindings.findChildViewById(rootView, id);
      if (ed97 == null) {
        break missingId;
      }

      id = R.id.ed98;
      EditText ed98 = ViewBindings.findChildViewById(rootView, id);
      if (ed98 == null) {
        break missingId;
      }

      return new ActivityMain9Binding((ConstraintLayout) rootView, b91, ed91, ed92, ed93, ed94,
          ed95, ed96, ed97, ed98);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}