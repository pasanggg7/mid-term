package com.example.mymidterm;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.red) {
            findViewById(R.id.newActivityLayout).setBackgroundColor(getResources().getColor(R.color.red));
            return true;
        } else if (id == R.id.green) {
            findViewById(R.id.newActivityLayout).setBackgroundColor(getResources().getColor(R.color.green));
            return true;
        } else if (id == R.id.yellow) {
            findViewById(R.id.newActivityLayout).setBackgroundColor(getResources().getColor(R.color.yellow));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}