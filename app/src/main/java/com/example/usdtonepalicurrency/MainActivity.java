package com.example.usdtonepalicurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText e1;
    private Button b1;
    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        b1 = findViewById(R.id.b1);
        output = findViewById(R.id.output);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converting to Nepali Currency", Toast.LENGTH_SHORT).show();
                double n1 = Double.parseDouble(e1.getText().toString());
                double exchange = 132.13;
                double c = n1 * exchange;
                output.setText("result is " +c);
            }
        });
    }
}