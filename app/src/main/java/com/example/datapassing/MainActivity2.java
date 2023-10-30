package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        String  myname = getIntent().getStringExtra("myname");
        String  adr = getIntent().getStringExtra("adr");
        t1.setText(myname);
        t2.setText(adr);
    }
}