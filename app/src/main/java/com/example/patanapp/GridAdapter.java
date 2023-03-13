package com.example.patanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] name;
    String[] description;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] name, String[] description) {
        this.context = context;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCount() {
        return name.length;
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

        
        return null;
    }
}
