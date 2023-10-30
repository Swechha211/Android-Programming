package com.example.logindialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();

            }
        });
    }
    public  void  openDialog(){
//         LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
//        loginDialogFragment.show();  error while doing this
        //coz we made mistake while making java class from app and we have to i

        loginDialogFragment loginDialogFragment = new loginDialogFragment();
        loginDialogFragment.show(getSupportFragmentManager(), "login dialog");


    }
}