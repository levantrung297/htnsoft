package com.htnsoft.htnsoft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TRUNG VAN on 1/23/2018.
 */

public class KhoaHocAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<khoahoc> khoahocList;

    public KhoaHocAdapter(Context context, int layout, List<khoahoc> khoahocList) {
        this.context = context;
        this.layout = layout;
        this.khoahocList = khoahocList;
    }

    @Override
    public int getCount() {
        return khoahocList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTenKhoaHoc, txtMoTa;
        ImageView imgDelete, imgEdit, imgHinhAnh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txtTenKhoaHoc    = (TextView) view.findViewById(R.id.txtTenKhoaHoc);
            holder.txtMoTa          = (TextView) view.findViewById(R.id.txtMoTa);
            holder.imgDelete        = (ImageView) view.findViewById(R.id.imgViewDelete);
            holder.imgEdit          = (ImageView) view.findViewById(R.id.imgViewEdit);
            holder.imgHinhAnh       = (ImageView) view.findViewById(R.id.imgHinhAnh);
            view.setTag(holder);
        } else{
            holder = (ViewHolder) view.getTag();
        }

        khoahoc khoahoc = khoahocList.get(i);
        holder.txtTenKhoaHoc.setText(khoahoc.getTenKhoaHoc());
        holder.txtMoTa.setText(khoahoc.getTenKhoaHoc());
        return view;
    }
}
