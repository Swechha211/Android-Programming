package com.example.gettingbackfromchild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        final int number1 = intent.getIntExtra("number1", 0);
        final int number2 = intent.getIntExtra("number2", 0);

        TextView mTextResult2 = findViewById(R.id.mTextResult2);
        mTextResult2.setText("Numbers: "+ number1 + "," + number2);

        Button mButton2 = findViewById(R.id.mButton2);

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = number1 + number2;

                Intent resultIntent = new Intent();//to present informTIOn bacck we create intent
                resultIntent.putExtra("result",result);

                setResult(RESULT_OK, resultIntent); //to check later if this result is success or not
                finish();


            }
        });


    }
}