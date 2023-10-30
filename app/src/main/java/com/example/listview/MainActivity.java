package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    //int[] arry = new int[]{1,2,3,4,5}; we don't use it because we don't know the total number of item
    ArrayList<String > arrString = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        arrString.add("Anjana");
        arrString.add("Samjhana1");
        arrString.add("Kailash");
        arrString.add("Samjhana2");
        arrString.add("Swechha");
        arrString.add("Bibek");
        arrString.add("Asha");
        arrString.add("Umang");
        arrString.add("Bipin");
        arrString.add("Puja");
        arrString.add("Shiva");

        arrString.add("Anjana");
        arrString.add("Samjhana1");
        arrString.add("Kailash");
        arrString.add("Samjhana2");
        arrString.add("Swechha");
        arrString.add("Bibek");
        arrString.add("Asha");
        arrString.add("Umang");
        arrString.add("Bipin");
        arrString.add("Puja");
        arrString.add("Shiva");

        arrString.add("Anjana");
        arrString.add("Samjhana1");
        arrString.add("Kailash");
        arrString.add("Samjhana2");
        arrString.add("Swechha");
        arrString.add("Bibek");
        arrString.add("Asha");
        arrString.add("Umang");
        arrString.add("Bipin");
        arrString.add("Puja");
        arrString.add("Shiva");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1, arrString);
        listView.setAdapter( adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Toast.makeText(MainActivity.this, "First item is clicked", Toast.LENGTH_SHORT).show();
                }else  if(i == 1){
                    Toast.makeText(MainActivity.this, "Second item is clicked", Toast.LENGTH_SHORT).show();
                } else if(i == 2){
                    Toast.makeText(MainActivity.this, "Third item is clicked", Toast.LENGTH_SHORT).show();
                }else if(i == 3){
                    Toast.makeText(MainActivity.this, "Fourth item is clicked", Toast.LENGTH_SHORT).show();
                }else if(i == 4){
                    Toast.makeText(MainActivity.this, "Fifth item is clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}