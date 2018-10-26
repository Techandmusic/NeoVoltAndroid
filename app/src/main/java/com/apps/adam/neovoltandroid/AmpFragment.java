package com.apps.adam.neovoltandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AmpFragment extends Fragment {
    @BindView(R.id.firstInput)
    EditText firstInput;
    @BindView(R.id.secondInput)
    EditText secondInput;
    @BindView(R.id.resultsDisplay)
    TextView result;
    @BindView(R.id.resultsLabel)
    TextView resultLabel;
    @BindView(R.id.calcButton)
    Button calcButton;
//TODO Add handler for divide by zero exception, possibly with toast message

    //Class constructor
    public AmpFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        ButterKnife.bind(this, view);
        //Set hints and labels
        firstInput.setHint(R.string.voltage);
        secondInput.setHint(R.string.resistance);
        resultLabel.setText(R.string.current);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstValue = Double.parseDouble(firstInput.getText().toString());
                Double secondValue = Double.parseDouble(secondInput.getText().toString());
                Double solution = firstValue / secondValue;
                if (solution.isInfinite()) {
                    Toast.makeText(getContext(), R.string.divide_by_zero, Toast.LENGTH_SHORT).show();
                } else {
                    result.setText(solution.toString());
                }


            }
        });
        return view;
    }

}
