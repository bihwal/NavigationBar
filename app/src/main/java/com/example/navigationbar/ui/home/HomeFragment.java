package com.example.navigationbar.ui.home;

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
public class HomeFragment extends Fragment implements View.OnClickListener {

    EditText etareacric;
    Button btnareacric;
    TextView tvdisplaya;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        etareacric = view.findViewById(R.id.etnareacirc);
        btnareacric = view.findViewById(R.id.btnareacirc);
        tvdisplaya = view.findViewById(R.id.tvdisplaya);
        btnareacric.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etareacric.getText())) {
            etareacric.setError("Enter Something to add ");
            ;
            return;
        }
        int radius = Integer.parseInt(etareacric.getText().toString());
        int result = radius * radius * (22 / 7);

        tvdisplaya.setText("Area of circle is : " + result);
    }
}