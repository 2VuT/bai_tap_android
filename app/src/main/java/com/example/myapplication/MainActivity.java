package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] locations = new String[] {
            "Ho Tay",
            "Lang Bac",
            "Thap Rua",
            "Chua Mot Cot",
            "Quoc Tu Giam",
            "Thu Vien QG"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.location_list);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, locations);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemPosition = listView.getItemAtPosition(i).toString();

                Intent intent = new Intent(MainActivity.this, ItemActivity.class);
                intent.putExtra("value", itemPosition);
                intent.putExtra("desc", "Some information about your destination!");
                startActivity(intent);
            }
        });
    }
}
