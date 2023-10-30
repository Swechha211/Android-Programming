package com.example.jsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private UserAdapter adapter;
    private List<User> userList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.ListView);
        userList = new ArrayList<>();
        adapter = new UserAdapter(this, userList);
        listView.setAdapter(adapter);

        String url ="https://jsonplaceholder.typicode.com/users";

        //create a new volley request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //create a json array request
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //process json
                        for(int i= 0; i< response.length(); i++){
                            try{
                                JSONObject jsonObject = response.getJSONObject(i);
                                int id = jsonObject.getInt("id");
                                String name = jsonObject.getString("name");
                                String username = jsonObject.getString("username");
                                String email = jsonObject.getString("email");

                                User user = new User(id, name, username, email);
                                userList.add(user);

                            }catch(JSONException e){
                                e.printStackTrace();
                            }
                        }
                        //Notify the adapter that the data has changed
                        adapter.notifyDataSetChanged();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();

            }
        });

        //add the request to the request queue
        requestQueue.add(jsonArrayRequest);

    }
}