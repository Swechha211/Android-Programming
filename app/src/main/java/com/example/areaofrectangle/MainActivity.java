package com.example.areaofrectangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText e1, e2, e3;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        b1 = findViewById(R.id.b1);
        output = findViewById(R.id.output);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Finding the area of rectangle", Toast.LENGTH_SHORT).show();
                double n1 = Double.parseDouble(e1.getText().toString());
                double n2 = Double.parseDouble(e2.getText().toString());
                double n3 = Double.parseDouble(e3.getText().toString());

                double c = n1 * n2 * n3;
                output.setText("Result is "+ c);
            }
        });


    }
}