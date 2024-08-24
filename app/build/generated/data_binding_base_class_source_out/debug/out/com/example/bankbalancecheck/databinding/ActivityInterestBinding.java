// Generated by view binder compiler. Do not edit!
package com.example.bankbalancecheck.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bankbalancecheck.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInterestBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView InterestClearAll;

  @NonNull
  public final TextView ansInterestAmount;

  @NonNull
  public final CardView cvInterestCalc;

  @NonNull
  public final TextInputEditText edtIntTime;

  @NonNull
  public final TextInputLayout edtIntTimeLayout;

  @NonNull
  public final TextInputEditText edtInterestRate;

  @NonNull
  public final TextInputLayout edtInterestRateLayout;

  @NonNull
  public final TextInputEditText edtPrincipalAmt;

  @NonNull
  public final TextInputLayout edtPrincipalAmtLayout;

  @NonNull
  public final ImageView imgInterestBack;

  @NonNull
  public final LinearLayout lnrResultSec1;

  @NonNull
  public final LinearLayout lnrResultSec2;

  @NonNull
  public final RelativeLayout main;

  @NonNull
  public final LinearLayout relIntTime;

  @NonNull
  public final LinearLayout relInterestRate;

  @NonNull
  public final RelativeLayout relPrincipal;

  @NonNull
  public final LinearLayout relPrincipalAmt;

  @NonNull
  public final TextView txtIntTime;

  @NonNull
  public final TextView txtInterestRate;

  @NonNull
  public final TextView txtPrincipalAmt;

  private ActivityInterestBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView InterestClearAll, @NonNull TextView ansInterestAmount,
      @NonNull CardView cvInterestCalc, @NonNull TextInputEditText edtIntTime,
      @NonNull TextInputLayout edtIntTimeLayout, @NonNull TextInputEditText edtInterestRate,
      @NonNull TextInputLayout edtInterestRateLayout, @NonNull TextInputEditText edtPrincipalAmt,
      @NonNull TextInputLayout edtPrincipalAmtLayout, @NonNull ImageView imgInterestBack,
      @NonNull LinearLayout lnrResultSec1, @NonNull LinearLayout lnrResultSec2,
      @NonNull RelativeLayout main, @NonNull LinearLayout relIntTime,
      @NonNull LinearLayout relInterestRate, @NonNull RelativeLayout relPrincipal,
      @NonNull LinearLayout relPrincipalAmt, @NonNull TextView txtIntTime,
      @NonNull TextView txtInterestRate, @NonNull TextView txtPrincipalAmt) {
    this.rootView = rootView;
    this.InterestClearAll = InterestClearAll;
    this.ansInterestAmount = ansInterestAmount;
    this.cvInterestCalc = cvInterestCalc;
    this.edtIntTime = edtIntTime;
    this.edtIntTimeLayout = edtIntTimeLayout;
    this.edtInterestRate = edtInterestRate;
    this.edtInterestRateLayout = edtInterestRateLayout;
    this.edtPrincipalAmt = edtPrincipalAmt;
    this.edtPrincipalAmtLayout = edtPrincipalAmtLayout;
    this.imgInterestBack = imgInterestBack;
    this.lnrResultSec1 = lnrResultSec1;
    this.lnrResultSec2 = lnrResultSec2;
    this.main = main;
    this.relIntTime = relIntTime;
    this.relInterestRate = relInterestRate;
    this.relPrincipal = relPrincipal;
    this.relPrincipalAmt = relPrincipalAmt;
    this.txtIntTime = txtIntTime;
    this.txtInterestRate = txtInterestRate;
    this.txtPrincipalAmt = txtPrincipalAmt;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInterestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInterestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_interest, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInterestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.InterestClearAll;
      TextView InterestClearAll = ViewBindings.findChildViewById(rootView, id);
      if (InterestClearAll == null) {
        break missingId;
      }

      id = R.id.ansInterestAmount;
      TextView ansInterestAmount = ViewBindings.findChildViewById(rootView, id);
      if (ansInterestAmount == null) {
        break missingId;
      }

      id = R.id.cvInterestCalc;
      CardView cvInterestCalc = ViewBindings.findChildViewById(rootView, id);
      if (cvInterestCalc == null) {
        break missingId;
      }

      id = R.id.edtIntTime;
      TextInputEditText edtIntTime = ViewBindings.findChildViewById(rootView, id);
      if (edtIntTime == null) {
        break missingId;
      }

      id = R.id.edtIntTimeLayout;
      TextInputLayout edtIntTimeLayout = ViewBindings.findChildViewById(rootView, id);
      if (edtIntTimeLayout == null) {
        break missingId;
      }

      id = R.id.edtInterestRate;
      TextInputEditText edtInterestRate = ViewBindings.findChildViewById(rootView, id);
      if (edtInterestRate == null) {
        break missingId;
      }

      id = R.id.edtInterestRateLayout;
      TextInputLayout edtInterestRateLayout = ViewBindings.findChildViewById(rootView, id);
      if (edtInterestRateLayout == null) {
        break missingId;
      }

      id = R.id.edtPrincipalAmt;
      TextInputEditText edtPrincipalAmt = ViewBindings.findChildViewById(rootView, id);
      if (edtPrincipalAmt == null) {
        break missingId;
      }

      id = R.id.edtPrincipalAmtLayout;
      TextInputLayout edtPrincipalAmtLayout = ViewBindings.findChildViewById(rootView, id);
      if (edtPrincipalAmtLayout == null) {
        break missingId;
      }

      id = R.id.imgInterestBack;
      ImageView imgInterestBack = ViewBindings.findChildViewById(rootView, id);
      if (imgInterestBack == null) {
        break missingId;
      }

      id = R.id.lnrResultSec1;
      LinearLayout lnrResultSec1 = ViewBindings.findChildViewById(rootView, id);
      if (lnrResultSec1 == null) {
        break missingId;
      }

      id = R.id.lnrResultSec2;
      LinearLayout lnrResultSec2 = ViewBindings.findChildViewById(rootView, id);
      if (lnrResultSec2 == null) {
        break missingId;
      }

      RelativeLayout main = (RelativeLayout) rootView;

      id = R.id.relIntTime;
      LinearLayout relIntTime = ViewBindings.findChildViewById(rootView, id);
      if (relIntTime == null) {
        break missingId;
      }

      id = R.id.relInterestRate;
      LinearLayout relInterestRate = ViewBindings.findChildViewById(rootView, id);
      if (relInterestRate == null) {
        break missingId;
      }

      id = R.id.relPrincipal;
      RelativeLayout relPrincipal = ViewBindings.findChildViewById(rootView, id);
      if (relPrincipal == null) {
        break missingId;
      }

      id = R.id.relPrincipalAmt;
      LinearLayout relPrincipalAmt = ViewBindings.findChildViewById(rootView, id);
      if (relPrincipalAmt == null) {
        break missingId;
      }

      id = R.id.txtIntTime;
      TextView txtIntTime = ViewBindings.findChildViewById(rootView, id);
      if (txtIntTime == null) {
        break missingId;
      }

      id = R.id.txtInterestRate;
      TextView txtInterestRate = ViewBindings.findChildViewById(rootView, id);
      if (txtInterestRate == null) {
        break missingId;
      }

      id = R.id.txtPrincipalAmt;
      TextView txtPrincipalAmt = ViewBindings.findChildViewById(rootView, id);
      if (txtPrincipalAmt == null) {
        break missingId;
      }

      return new ActivityInterestBinding((RelativeLayout) rootView, InterestClearAll,
          ansInterestAmount, cvInterestCalc, edtIntTime, edtIntTimeLayout, edtInterestRate,
          edtInterestRateLayout, edtPrincipalAmt, edtPrincipalAmtLayout, imgInterestBack,
          lnrResultSec1, lnrResultSec2, main, relIntTime, relInterestRate, relPrincipal,
          relPrincipalAmt, txtIntTime, txtInterestRate, txtPrincipalAmt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
