package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {
    TextView locationName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.show_item);

        locationName = (TextView) findViewById(R.id.location_name);

        String name = getIntent().getStringExtra("Listviewclickvalue");
        locationName.setText(name);
    }
}
