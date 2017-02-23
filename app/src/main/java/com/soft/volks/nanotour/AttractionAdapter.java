package com.soft.volks.nanotour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.*;

import java.util.ArrayList;

/**
 * Created by nkarayev on 10/26/16.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attraction)
    {
        super(context, 0, attraction);
    }
    @Override
    public View getView(int pos, View convertView, ViewGroup parent)
    {
        Attraction currentAttraction = getItem(pos);
        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_list_layout, parent, false);
        }

        ImageView thumb = (ImageView) listItemView.findViewById(R.id.attraction_thumb);
        thumb.setImageResource(currentAttraction.getmThumbId());

        TextView title = (TextView) listItemView.findViewById(R.id.attraction_list_name);
        title.setText(currentAttraction.getmName());

        return listItemView;
    }
}
