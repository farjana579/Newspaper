package com.example.newspaper;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] heading;
    private final String[] subHeading;
    private final Integer[] imageId;

    public CustomAdapter(Activity context, String[] heading, String[] subHeading, Integer[] imageId) {
        this.context = context;
        this.heading = heading;
        this.subHeading = subHeading;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return heading.length;
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

        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.custom_layout,null,true);

        ImageView customImg = (ImageView) rowview.findViewById(R.id.customImage);
        TextView customTextHeading = (TextView) rowview.findViewById(R.id.customTextHead);
        TextView customTextSubHeading = (TextView) rowview.findViewById(R.id.customTextSubHead);

        customImg.setImageResource(imageId[position]);
        customTextHeading.setText(heading[position]);
        customTextSubHeading.setText(subHeading[position]);

        return rowview;
    }
}
