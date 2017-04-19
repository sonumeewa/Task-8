package com.example.sonumeewa.task_8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by MG on 17-07-2016.
 */
public class MyBottomSheetDialogFragment extends BottomSheetDialogFragment {

    static MyBottomSheetDialogFragment newInstance(String seller, String location, String type, String category) {
        MyBottomSheetDialogFragment f = new MyBottomSheetDialogFragment();
        Bundle args = new Bundle();
        args.putString("seller", seller);
        args.putString("location", location);
        args.putString("type", type);
        args.putString("category", category);
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bottom_sheet_modal, container, false);

        TextView sellerName = (TextView) v.findViewById(R.id.seller_name_bottomsheet);
        sellerName.setText(getArguments().getString("seller"));

        TextView cityName = (TextView) v.findViewById(R.id.city_textview_bottomsheet);
        cityName.setText(getArguments().getString("location"));

        TextView typeName=(TextView)v.findViewById(R.id.type_textview_bottomsheet);
        typeName.setText(getArguments().getString("type"));

        TextView categoryName=(TextView)v.findViewById(R.id.category_textview_bottomsheet);
        categoryName.setText(getArguments().getString("category"));
        return v;
    }
}