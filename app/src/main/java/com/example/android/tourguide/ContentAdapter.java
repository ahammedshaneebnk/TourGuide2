package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SHANEEB on 17-Mar-17.
 */

public class ContentAdapter extends ArrayAdapter<ContentClass> {
    public ContentAdapter(Activity context, ArrayList<ContentClass> contents) {
        super(context, 0, contents);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        ContentClass currentContent = getItem(position);

        TextView textData = (TextView) listItemView.findViewById(R.id.textId);
        textData.setText(currentContent.getmTextData());
        ImageView imageData = (ImageView) listItemView.findViewById(R.id.imageId);

        if (currentContent.hasImage()) {
            imageData.setImageResource(currentContent.getmImageData());
            imageData.setVisibility(View.VISIBLE);
        } else {
            imageData.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
