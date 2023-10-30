package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    int logos[];
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int [] logos){
        this.context = applicationContext;
        this.logos = logos;
        inflater = (LayoutInflater.from(applicationContext));

    }


    @Override
    public int getCount() {
        return logos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_gridlayout, null);
        ImageView icon = view.findViewById(androidx.core.R.id.icon);
        icon.setImageResource(logos[i]);

        return view;
    }
}
