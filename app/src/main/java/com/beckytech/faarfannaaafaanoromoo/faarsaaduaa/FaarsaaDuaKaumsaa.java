package com.beckytech.faarfannaaafaanoromoo.faarsaaduaa;

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

public class FaarsaaDuaKaumsaa extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Du'aa ka'eeraa ilmi maariyaamii",
            "Hafuurri Qulqulluun Bu’e",
            "Har’a ta’e gaammachuu",
            "Isin Garuu Turaa",
            "Kan hin duune du’ee",
            "Kiristoos ka’eera du’aatii",
            "Lafti Qulqullooft"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Yeroo Dhaloota - Gannaa");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, DuaaKaeera.class));
                    break;
                case 1:
                    startActivity(new Intent(this, HafuurriQulqulluunBue.class));
                    break;
                case 2:
                    startActivity(new Intent(this, HaraTaeGammachuun.class));
                    break;
                case 3:
                    startActivity(new Intent(this, IsinGaruuTuraa.class));
                    break;
                case 4:
                    startActivity(new Intent(this, KanHinDuuneDuee.class));
                    break;
                case 5:
                    startActivity(new Intent(this, KiristoosKaeera.class));
                    break;
                case 6:
                    startActivity(new Intent(this, LaftiQulqulloofte.class));
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
            TextView btn = row.findViewById(R.id.textView1);
            btn.setText(title[position]);
            return row;
        }

    }
}