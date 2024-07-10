package com.example.mymidterm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        Button buttonSendData = findViewById(R.id.buttonSendData);
        Button buttonAlertDialog = findViewById(R.id.buttonAlertDialog);

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer1, firstFragment)
                .replace(R.id.fragmentContainer2, secondFragment)
                .commit();

        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                firstFragment.setData(data);
                secondFragment.setData(data);
            }
        });

        buttonAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Alert")
                        .setMessage("Navigate to new activity?")
                        .setPositiveButton("OK", (dialog, which) -> {
                            Intent intent = new Intent(MainActivity.this, NewActivity.class);
                            startActivity(intent);
                        })
                        .setNegativeButton("Cancel", null)
                        .show();
            }
        });
    }
}