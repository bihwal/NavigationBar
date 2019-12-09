package com.example.navigationbar.ui.gallery;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigationbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment implements View.OnClickListener {

    EditText etprincple, ettime,etrate;
    Button btnSI;
    TextView tvdisplaya;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etprincple = view.findViewById(R.id.etprincple);
        ettime=view.findViewById(R.id.etnareacirc);
        etrate=view.findViewById(R.id.etrate);
        btnSI = view.findViewById(R.id.btnSI);
        tvdisplaya=view.findViewById(R.id.tvresult);
        return view;
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etprincple.getText()))
        {
            etprincple.setError("Enter Principle ");
            return;
        }

        if (TextUtils.isEmpty(etrate.getText()))
        {
            etrate.setError("Enter Rate");
            return;
        }
        if (TextUtils.isEmpty(ettime.getText()))
        {
            ettime.setError("Enter Time");
            return;
        }
        float principle,rate,time,result;
        principle=Float.parseFloat(etprincple.getText().toString());
        rate=Float.parseFloat(etrate.getText().toString());
        time=Float.parseFloat(ettime.getText().toString());

        result=(principle*rate*time)/100;

        tvdisplaya.setText(Float.toString(result));

    }
}