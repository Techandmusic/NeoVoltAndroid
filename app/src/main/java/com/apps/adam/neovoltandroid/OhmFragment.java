package com.apps.adam.neovoltandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OhmFragment extends Fragment {
    @BindView(R.id.firstInput) EditText firstInput;
    @BindView(R.id.secondInput) EditText secondInput;
    @BindView(R.id.resultsDisplay) TextView result;
    @BindView(R.id.resultsLabel) TextView resultLabel;


    //Class constructor
    public OhmFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        ButterKnife.bind(this, view);
        //Set hints and labels
        firstInput.setHint(R.string.voltage);
        secondInput.setHint(R.string.current);
        resultLabel.setText(R.string.resistance);
        return view;
    }
}
