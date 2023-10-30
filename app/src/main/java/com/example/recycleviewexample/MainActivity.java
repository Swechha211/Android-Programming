package com.example.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    //ImageView imgContact;
    //TextView txtName, txtNumber;
    //now we create a arraylist of ContactModel data type (struct type)
    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        recyclerView = findViewById(R.id.Contactrecyler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //now we add the data item
        arrContacts.add(new ContactModel(R.drawable.images, "Samjhana", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.user, "Swechha", "11111111111"));
        arrContacts.add(new ContactModel(R.drawable.images, "Asha", "3333333333"));
        arrContacts.add(new ContactModel(R.drawable.user, "Puja", "11111666666"));
        arrContacts.add(new ContactModel(R.drawable.logo, "JBC", "6666666666"));
        arrContacts.add(new ContactModel(R.drawable.upload, "Upload", "999995555"));
        arrContacts.add(new ContactModel(R.drawable.images, "Samjhana", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.user, "Swechha", "11111111111"));
        arrContacts.add(new ContactModel(R.drawable.images, "Asha", "3333333333"));
        arrContacts.add(new ContactModel(R.drawable.user, "Puja", "11111666666"));
        arrContacts.add(new ContactModel(R.drawable.logo, "JBC", "6666666666"));
        arrContacts.add(new ContactModel(R.drawable.upload, "Upload", "999995555"));

        //now we set the recycler view to the RecyclerContactAdapter
        RecyclerConatctAdapter adapter = new RecyclerConatctAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);



    }
}