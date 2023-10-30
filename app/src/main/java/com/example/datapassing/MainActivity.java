package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText e1, e2;
    public Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myname = e1.getText().toString();
                String adr = e2.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("myname" , myname);
                intent.putExtra("adr", adr);
                startActivity(intent);
            }
        });

    }
}