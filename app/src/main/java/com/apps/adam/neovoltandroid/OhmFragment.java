package com.apps.adam.neovoltandroid;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class OhmFragment extends Fragment {


    //Class constructor
    public OhmFragment() {}



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        //Initialize EditText and TextView variables
        EditText firstInput = view.findViewById(R.id.firstInput);
        EditText secondInput = view.findViewById(R.id.secondInput);
        TextView result = view.findViewById(R.id.resultsDisplay);
        TextView resultLabel = view.findViewById(R.id.resultsLabel);
        //Set hints and labels
        firstInput.setHint(R.string.voltage);
        secondInput.setHint(R.string.current);
        resultLabel.setText(R.string.resistance);
        return view;
    }
}