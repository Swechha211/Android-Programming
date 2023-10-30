package com.example.jsondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UserAdapter extends ArrayAdapter <User> {

    private List<User> userList;
    public UserAdapter(Context context, List<User> userList){
        super(context, 0, userList);
        this.userList = userList;
    }

    //ctrl+o and implement getView


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //write code
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1,parent, false);
        }
        User user = userList.get(position);
        TextView textView = convertView.findViewById(android.R.id.text1);
        textView.setText(user.getName());
// can add email, id too using   textView.setText(user.getUsername());
        return convertView;
    }
}
