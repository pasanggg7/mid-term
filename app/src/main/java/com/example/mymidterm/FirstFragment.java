package com.example.mymidterm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    private EditText email;
    private EditText password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        email = view.findViewById(R.id.email);
        password = view.findViewById(R.id.password);
        Button buttonLogin = view.findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to send email and password data to TextView in MainActivity
            }
        });

        return view;
    }
    public void setData(String data) {
        email.setText(data);
    }

}