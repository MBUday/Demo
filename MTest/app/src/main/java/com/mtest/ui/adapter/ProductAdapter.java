package com.mtest.ui.adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import android.widget.TextView;

import com.mtest.R;
import com.mtest.entity.Product;


import java.util.ArrayList;

/**
 * Created by udaya on ic_two/12/16.
 */
public class ProductAdapter extends BaseAdapter {

    private final LayoutInflater mInflater;

    private final ArrayList<Product> mProductList;

    private final int[] products = {R.drawable.ic_one, R.drawable.ic_two, R.drawable.ic_three, R.drawable.ic_four, R.drawable.ic_five, R.drawable.ic_six,R.drawable.ic_seven, R.drawable.ic_eight, R.drawable.ic_nine, R.drawable.ic_ten};


    public ProductAdapter(Context mContext, ArrayList<Product> productList) {
        Context context = mContext;
        mProductList = productList;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 10;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = mInflater.inflate(R.layout.grid_item, parent, false);


        ImageView ivLogo = (ImageView) convertView.findViewById(R.id.ivLogo);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvAuthor = (TextView) convertView.findViewById(R.id.tvAuthor);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.tvPrice);


        tvTitle.setText(mProductList.get(position).getTitle());
        tvAuthor.setText(mProductList.get(position).getAuthor());
        String price = "$" + mProductList.get(position).getCost();
        tvPrice.setText(price);
        ivLogo.setImageResource(products[position]);





        return convertView;
    }
}
