package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {
    TextView locationName, locationDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_item);

        Intent in = this.getIntent();
        locationName = (TextView) findViewById(R.id.location_name);
        locationDesc = (TextView) findViewById(R.id.location_des);

        locationName.setText(in.getStringExtra("value"));
        locationDesc.setText(in.getStringExtra("desc"));
    }
}
