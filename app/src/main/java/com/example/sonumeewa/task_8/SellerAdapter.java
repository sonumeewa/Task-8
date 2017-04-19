package com.example.sonumeewa.task_8;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sonumeewa on 4/19/2017.
 */

public class SellerAdapter extends ArrayAdapter<Seller> {
    private static final String LOG_TAG = SellerAdapter.class.getSimpleName();


    public SellerAdapter(Activity context, ArrayList<Seller> sellers) {

        super(context, 0, sellers);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

      Seller  currentSeller = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.seller_name);
        nameTextView.setText(currentSeller.getName());
        nameTextView.setAllCaps(true);
        TextView distanceTextView = (TextView) listItemView.findViewById(R.id.seller_distance);
         distanceTextView.setText(currentSeller.getDistance()+" km away");

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.message_icon);
        iconView.setImageResource(R.drawable.ic_chat_white_24dp);

         return listItemView;
    }


}
