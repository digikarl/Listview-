package com.carlospaz.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by carlospaz on 30/6/16.
 */
public class ProductsListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Products> mProductsList;

    // Constructor


    public ProductsListAdapter(Context mContext, List<Products> mProductsList) {
        this.mContext = mContext;
        this.mProductsList = mProductsList;
    }

    @Override
    public int getCount() {
        return mProductsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_produts, null);
        TextView tvname = (TextView)v.findViewById(R.id.tv_name);
        TextView tvprice = (TextView)v.findViewById(R.id.tv_price);
        TextView tvdescription = (TextView)v.findViewById(R.id.tv_description);

        //preparar text parta textview

        tvname.setText(mProductsList.get(position).getName());
        tvprice.setText(String.valueOf(mProductsList.get(position).getPrice())+ " €" );
        tvdescription.setText(mProductsList.get(position).getDescription());

        // guardar id del procuto en el tag

        v.setTag(mProductsList.get(position).getId());


        return v;
    }
}
