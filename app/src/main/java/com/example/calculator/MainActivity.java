package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText e1, edt2;
    private Button btn, b2, btn3, btn4;
    private  TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        e1 = findViewById(R.id.e1);
        edt2 = findViewById(R.id.edt2);
        btn = findViewById(R.id.btn);
        b2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        output = findViewById(R.id.output);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Given number is successfully subtracted", Toast.LENGTH_SHORT).show();
                int n1 = Integer.parseInt(e1.getText().toString());//toString() the getText() method get the content inside editText and to String() will convert it into string format
                int n2 = Integer.parseInt(edt2.getText().toString());
                int sub = n1 - n2;
                output.setText("result is " + sub);


            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "long pressed", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Given number is successfully added", Toast.LENGTH_SHORT).show();
                int n1 = Integer.parseInt(e1.getText().toString());//toString() the getText() method get the content inside editText and to String() will convert it into string format
                int n2 = Integer.parseInt(edt2.getText().toString());
                int sub = n1 + n2;
                output.setText("result is " + sub);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Given number is successfully multiplied", Toast.LENGTH_SHORT).show();
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(edt2.getText().toString());
                int mul = n1 * n2;
                output.setText("result is" + mul);

            }


        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Given number is successfully divided", Toast.LENGTH_SHORT).show();
                int n1 = Integer.parseInt(e1.getText().toString());//toString() the getText() method get the content inside editText and to String() will convert it into string format
                int n2 = Integer.parseInt(edt2.getText().toString());
                int sub = n1 / n2;
                output.setText("result is " + sub);

            }
        });







    }
}