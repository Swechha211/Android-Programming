package com.example.listviewbyspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   Spinner spinner;
    ArrayList<String> arrID = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        arrID.add("Anjana");
        arrID.add("Samjhana1");
        arrID.add("Kailash");
        arrID.add("Samjhana2");
        arrID.add("Swechha");
        arrID.add("Bibek");
        arrID.add("Asha");
        arrID.add("Umang");
        arrID.add("Bipin");
        arrID.add("Puja");
        arrID.add("Shiva");
        arrID.add("Barun");
        arrID.add("Ranjana");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(),android.R.layout.simple_spinner_dropdown_item, arrID);
        spinner.setAdapter(adapter);

    }
}