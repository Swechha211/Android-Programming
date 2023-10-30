package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    //define array and items used
    int logos[] = {
            R.drawable.im,
            R.drawable.imag,
            R.drawable.img1,
            R.drawable.images,
            R.drawable.user
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);

        //now we create adapter
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), logos);
        grid.setAdapter(adapter);


    }
}