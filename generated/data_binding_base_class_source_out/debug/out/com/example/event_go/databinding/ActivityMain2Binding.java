// Generated by view binder compiler. Do not edit!
package com.example.event_go.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
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

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button b233;

  @NonNull
  public final EditText ed211;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ListView lv211;

  @NonNull
  public final TextView tv211;

  @NonNull
  public final TextView tv212;

  private ActivityMain2Binding(@NonNull ConstraintLayout rootView, @NonNull Button b233,
      @NonNull EditText ed211, @NonNull LinearLayout linearLayout, @NonNull ListView lv211,
      @NonNull TextView tv211, @NonNull TextView tv212) {
    this.rootView = rootView;
    this.b233 = b233;
    this.ed211 = ed211;
    this.linearLayout = linearLayout;
    this.lv211 = lv211;
    this.tv211 = tv211;
    this.tv212 = tv212;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.b233;
      Button b233 = ViewBindings.findChildViewById(rootView, id);
      if (b233 == null) {
        break missingId;
      }

      id = R.id.ed211;
      EditText ed211 = ViewBindings.findChildViewById(rootView, id);
      if (ed211 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.lv211;
      ListView lv211 = ViewBindings.findChildViewById(rootView, id);
      if (lv211 == null) {
        break missingId;
      }

      id = R.id.tv211;
      TextView tv211 = ViewBindings.findChildViewById(rootView, id);
      if (tv211 == null) {
        break missingId;
      }

      id = R.id.tv212;
      TextView tv212 = ViewBindings.findChildViewById(rootView, id);
      if (tv212 == null) {
        break missingId;
      }

      return new ActivityMain2Binding((ConstraintLayout) rootView, b233, ed211, linearLayout, lv211,
          tv211, tv212);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
