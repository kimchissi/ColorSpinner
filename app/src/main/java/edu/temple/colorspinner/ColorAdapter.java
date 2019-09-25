package edu.temple.colorspinner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorAdapter extends BaseAdapter {

    private String[] colors = {"red", "yellow", "green", "blue", "purple", "orange", "magenta", "pink", "black", "white"};


    protected ColorAdapter(String[] colors) {
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
