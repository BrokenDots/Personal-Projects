package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<ListItemView> {


    public ItemAdapter(Activity context, ArrayList<ListItemView> androidFlavors) {
        super(context, 0, androidFlavors);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }

        ListItemView currentItem = getItem(position);

        TextView TitleTextView = (TextView) listItemView.findViewById(R.id.title_view);
        TitleTextView.setText(currentItem.getMtitle());


        TextView InfoTextView = (TextView) listItemView.findViewById(R.id.otherinfo_view);
        InfoTextView.setText(currentItem.getmOtherInfo());

        ImageView picView = (ImageView) listItemView.findViewById(R.id.image_view);
        picView.setImageResource(currentItem.getmImage());


        return listItemView;
    }


}
