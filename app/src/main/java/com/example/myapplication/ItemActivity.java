package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {
    private TextView locationName, locationDesc;
    private ImageView locationImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_item);

        Intent in = this.getIntent();
        Bundle bundle = in.getBundleExtra("data");

        locationName = (TextView) findViewById(R.id.location_name);
        locationDesc = (TextView) findViewById(R.id.location_des);
        locationImage = (ImageView) findViewById(R.id.location_image);

        locationName.setText(bundle.getString("name"));
        locationDesc.setText(bundle.getString("desc"));
        locationImage.setImageResource(bundle.getInt("image"));
    }
}
