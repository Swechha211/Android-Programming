package com.example.viewidentification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
   private Button btn_1;
    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btn_1 = findViewById(R.id.btn_1);
       edt = findViewById(R.id.edt);

       btn_1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "button is clicked", Toast.LENGTH_SHORT).show();
           }
       });


       edt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "I am clicked", Toast.LENGTH_SHORT).show();
           }
       });

    }
}