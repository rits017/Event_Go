// Generated by view binder compiler. Do not edit!
package com.example.event_go.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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

public final class ActivityMain8Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button b81;

  @NonNull
  public final Button b82;

  @NonNull
  public final Button b83;

  @NonNull
  public final Button b84;

  @NonNull
  public final Button b85;

  @NonNull
  public final ImageView iv81;

  @NonNull
  public final TextView t81;

  private ActivityMain8Binding(@NonNull ConstraintLayout rootView, @NonNull Button b81,
      @NonNull Button b82, @NonNull Button b83, @NonNull Button b84, @NonNull Button b85,
      @NonNull ImageView iv81, @NonNull TextView t81) {
    this.rootView = rootView;
    this.b81 = b81;
    this.b82 = b82;
    this.b83 = b83;
    this.b84 = b84;
    this.b85 = b85;
    this.iv81 = iv81;
    this.t81 = t81;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain8Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain8Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main8, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain8Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.b81;
      Button b81 = ViewBindings.findChildViewById(rootView, id);
      if (b81 == null) {
        break missingId;
      }

      id = R.id.b82;
      Button b82 = ViewBindings.findChildViewById(rootView, id);
      if (b82 == null) {
        break missingId;
      }

      id = R.id.b83;
      Button b83 = ViewBindings.findChildViewById(rootView, id);
      if (b83 == null) {
        break missingId;
      }

      id = R.id.b84;
      Button b84 = ViewBindings.findChildViewById(rootView, id);
      if (b84 == null) {
        break missingId;
      }

      id = R.id.b85;
      Button b85 = ViewBindings.findChildViewById(rootView, id);
      if (b85 == null) {
        break missingId;
      }

      id = R.id.iv81;
      ImageView iv81 = ViewBindings.findChildViewById(rootView, id);
      if (iv81 == null) {
        break missingId;
      }

      id = R.id.t81;
      TextView t81 = ViewBindings.findChildViewById(rootView, id);
      if (t81 == null) {
        break missingId;
      }

      return new ActivityMain8Binding((ConstraintLayout) rootView, b81, b82, b83, b84, b85, iv81,
          t81);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}