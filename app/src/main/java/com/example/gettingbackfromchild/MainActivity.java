package com.example.gettingbackfromchild;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextNumber1, mEditTextNumber2;
    private TextView mTextResult;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextNumber1 = findViewById(R.id.mEditTextNumber1);
        mEditTextNumber2 = findViewById(R.id.mEditTextNumber2);
        mTextResult = findViewById(R.id.mTextResult);
        mButton = findViewById(R.id.mButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                int number2 = Integer.parseInt(mEditTextNumber2.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("number1", number1);
                intent.putExtra("number2", number2);

                startActivityForResult(intent, 1);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                int result = data.getIntExtra("result", 0);
                mTextResult.setText(""+ result);
            }

            if(resultCode == RESULT_CANCELED){
                mTextResult.setText("Nothing selected");
            }


        }
    }
}

