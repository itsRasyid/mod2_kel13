package com.example.modul2_kel13;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        listView =findViewById(R.id.listview);

        ArrayList<anggota> arrayList = new ArrayList<>();

        arrayList.add(new anggota(R.drawable.inipp,"Abimanyu Putro Yulianto","21120119140120"));
        arrayList.add(new anggota(R.drawable.inipp,"Aryo Binatoro Srie Tanto","21120119140121"));
        arrayList.add(new anggota(R.drawable.inipp,"Yohanes Kukuh Niti Cahya Bagaskara","21120119130095"));
        arrayList.add(new anggota(R.drawable.inipp,"Rasyid Muliya Irawan","21120119130068"));

        //customadaptor
        anggotaadaptor anggotaadaptor = new anggotaadaptor(this, R.layout.activity_wajah,arrayList);
        listView.setAdapter(anggotaadaptor);
    }

}