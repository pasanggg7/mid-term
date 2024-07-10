package com.example.mymidterm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    private TextView fragmentTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        fragmentTextView = view.findViewById(R.id.text_in);
        return view;
    }
    public void setData(String data) {
        fragmentTextView.setText(data);
    }

}