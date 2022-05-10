package com.beckytech.faarfannaaafaanoromoo.faarsaafannoo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.MobileAds;

public class FaarsaaFannoo extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Aarsaatu agarsiise", "Aniyyuu Gaabbeerraa Dammaqii ", "Argaamee Fannoon Gooftaa", "Argameera Fannoon Gooftaa",
            "Ayyaana waggaa eebbifamaa ", "Damaraa Walitti", "Fannoo Goofta ifaa argannee ", "Fannoo ifaa addunyaa hundaafi",
            "Fannoon argameera", "Fannoon Gooftaa Argamee", "Jaalalli waaqayyoo guyyaa jimaata fannoorratti",
            "Lola  fannoosaatiin ajjeesee", "Mallattoo dhugaadha", "Damaraa walitti qabaa muka bobeessaa",
            "Ayyaana waggaa eebbifamaa ", "Yaa waaqayyoo gooftaa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Yeroo Ayyaana Fannoo");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AarsaatuAgarsiisee.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AniyyuuGaabberraa.class));
                    break;
                case 2:
                    startActivity(new Intent(this, ArgaameeFannoonGooftaa.class));
                    break;
                case 3:
                    startActivity(new Intent(this, Argameera.class));
                    break;
                case 4:
                    startActivity(new Intent(this, AyyaanaWaggaa.class));
                    break;
                case 5:
                    startActivity(new Intent(this, DamaraaWalitti.class));
                    break;
                case 6:
                    startActivity(new Intent(this, FannooGooftan.class));
                    break;
                case 7:
                    startActivity(new Intent(this, FannooIfaa.class));
                    break;
                case 8:
                    startActivity(new Intent(this, FannoonArgameera.class));
                    break;
                case 9:
                    startActivity(new Intent(this, FannoonGooftaa.class));
                    break;
                case 10:
                    startActivity(new Intent(this, JaalalliWaaqayyoo.class));
                    break;
                case 11:
                    startActivity(new Intent(this, LoolaFannoosaatin.class));
                    break;
                case 12:
                    startActivity(new Intent(this, MallattooDhugaadha.class));
                    break;
                case 13:
                    startActivity(new Intent(this, SabaKiristannaa.class));
                    break;
                case 14:
                    startActivity(new Intent(this, SabaKootiifi.class));
                    break;
                case 15:
                    startActivity(new Intent(this, YaaWaaqayyooGooftaa.class));
                    break;
            }
        });
    }

    static class CustomAdapter extends ArrayAdapter<String> {
        Context context;
        String[] title;

        CustomAdapter(Context context, String[] title) {
            super(context, R.layout.listitem, title);
            this.context = context;
            this.title = title;
        }

        @SuppressLint("SetTextI18n")
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = inflater.inflate(R.layout.listitem, parent, false);
            TextView textView = row.findViewById(R.id.textView1);
            String symbolSign = "\uD83C\uDF39✝\uD83C\uDF39";
            textView.setText(symbolSign +" "+ title[position]);
            return row;
        }

    }
}