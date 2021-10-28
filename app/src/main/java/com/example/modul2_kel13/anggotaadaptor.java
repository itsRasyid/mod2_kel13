package com.example.modul2_kel13;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class anggotaadaptor extends ArrayAdapter<anggota> {
    private Context mContext;
    private int mResourc;

    public anggotaadaptor(@NonNull Context context, int resource, @NonNull ArrayList<anggota> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResourc = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResourc,parent,false);

        ImageView imageView = convertView.findViewById(R.id.muka);
        TextView nama = convertView.findViewById(R.id.nama);
        TextView nim = convertView.findViewById(R.id.nim);
        imageView.setImageResource(getItem(position).getMuka());
        nama.setText(getItem(position).getNama());
        nim.setText(getItem(position).getNim());

        return convertView;
    }
}
