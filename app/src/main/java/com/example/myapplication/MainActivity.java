package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.location_list);
        String[] locations = new String[] {
                "Ho Tay",
                "Lang Bac",
                "Thap Rua",
                "Chua Mot Cot",
                "Quoc Tu Giam",
                "Thu Vien QG"
        };

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, locations);
        listView.setAdapter(arrayAdapter);
    }
}
