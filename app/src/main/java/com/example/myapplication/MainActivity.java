package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView countryName;
    private ImageView countryImage;
    private ArrayList<Country> countries;
    private Button btnSave;
    SharedPreferences spr;
    int position;
    Locale locale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        countryName = findViewById(R.id.country_name);
        countryImage = findViewById(R.id.country_image);
        btnSave = findViewById(R.id.btn_save);
        countries = new ArrayList<>();
        spr = getSharedPreferences("dataw", MODE_PRIVATE);
        if (spr != null) {
            countryName.setText(spr.getString("name", ""));
            countryImage.setImageResource(spr.getInt("image", R.drawable.ic_launcher_foreground));
            spinner.setSelection(spr.getInt("position", 0));
        }
        countries.add(new Country("Anh", "Tiếng Anh", R.drawable.anh));
        countries.add(new Country("Nhật", "Tiếng Nhật", R.drawable.china));
        countries.add(new Country("Pháp", "Tiếng Pháp", R.drawable.vn));
        String[] ngonngu = new String[] {countries.get(0).getLanguage(), countries.get(1).getLanguage(),
                countries.get(2).getLanguage()};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, ngonngu);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                countryName.setText(countries.get(i).getName());
                countryImage.setImageResource(countries.get(i).getImage());
                position = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = spr.edit();
                editor.putString("name", countries.get(position).getName());
                editor.putInt("image", countries.get(position).getImage());
                editor.putInt("position", position);
                editor.commit();
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
