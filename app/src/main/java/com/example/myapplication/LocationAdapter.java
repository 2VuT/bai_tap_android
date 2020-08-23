package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class LocationAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Location> locationList;

    public LocationAdapter(Context context, int layout, ArrayList<Location> locationList) {
        this.context = context;
        this.layout = layout;
        this.locationList = locationList;
    }

    @Override
    public int getCount() {
        return locationList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        TextView tvTen = view.findViewById(R.id.location_name);
        Location diadanh = locationList.get(i);
        tvTen.setText(diadanh.getName());
        return view;
    }
}
