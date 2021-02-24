package edu.temple.lab_3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private Context context; //context
    private ArrayList<TextView> items; //data source of the list adapter
    private ArrayList<ImageView> pics;

    public ImageAdapter(Context context, ArrayList<TextView> items, ArrayList<ImageView> pics) {
        this.context = context;
        this.items = items;
        this.pics = pics;
    }

    @Override
    public int getCount() {
        return items.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return items.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public TextView getView(int position, View convertView, ViewGroup parent) {
        TextView contentView = new TextView(context);
        contentView = (TextView) getItem(position);
        contentView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        return contentView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        convertView = pics.get(position);
        return convertView;
    }
}