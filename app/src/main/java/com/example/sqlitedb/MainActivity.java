package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView ListViewContacts;
    private List<Contact> Listcontact;
    private ArrayAdapter<Contact> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewContacts = findViewById(R.id.ListViewContacts);
        Listcontact = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Listcontact);
        ListViewContacts.setAdapter(adapter);

        DbHelper dbHelper = new DbHelper(this);

        dbHelper.dbinsert(new Contact("Samjhana", "9845162379"));
        dbHelper.dbinsert(new Contact("Anjana", "9872162399"));
        dbHelper.dbinsert(new Contact("Kailash", "9866162310"));
        dbHelper.dbinsert(new Contact("Samjhana Silwal", "4598167923"));
        dbHelper.dbinsert(new Contact("Swechha", "1234567890"));
        dbHelper.dbinsert(new Contact("Asha", "1234857879"));
        dbHelper.dbinsert(new Contact("Puja", "9674212399"));
        dbHelper.dbinsert(new Contact("Bibek", "4567895279"));
        dbHelper.dbinsert(new Contact("Bipin", "9879312359"));

        //we display data
        Listcontact.addAll(DbHelper.getAllContact(this));
        adapter.notifyDataSetChanged();

        //delete items based on click
        ListViewContacts.setOnItemClickListener((parent,view, position, id) -> {
            Contact selectedContact = Listcontact.get(position);
            dbHelper.deleteContact(selectedContact.getId());
            Listcontact.remove(position);
            adapter.notifyDataSetChanged();;
            Toast.makeText(MainActivity.this, "Contact deleted", Toast.LENGTH_SHORT).show();

        });


    }
}