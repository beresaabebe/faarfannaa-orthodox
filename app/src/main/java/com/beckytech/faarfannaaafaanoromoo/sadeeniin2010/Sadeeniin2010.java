package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

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

public class Sadeeniin2010 extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Amaanu'eel uumaa koo", "Araarsituu keenya", "Bakka ati deemtu", "Deessuu waaqa", "Eegaa afoomiyaa",
            "Gaaddisa manasaa", "Hangafa ergamoota", "Harmee Iyyesuus", "Kennaa fannoo jalaa", "Wabii kiyya ta'ii", "Yoo turee iyuu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarfataa Obbolaa lameen");

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            if (i == 0) {
                startActivity(new Intent(this, AmaanueelUumaaKoo.class));
            }
            if (i == 1) {
                startActivity(new Intent(this, AraarsituuKeenya.class));
            }
            if (i == 2) {
                startActivity(new Intent(this, BakkaAtiDeemtu.class));
            }
            if (i == 3) {
                startActivity(new Intent(this, DeessuuWaaqa.class));
            }
            if (i == 4) {
                startActivity(new Intent(this, EegaaAfoomiyaa.class));
            }
            if (i == 5) {
                startActivity(new Intent(this, GaaddisaManasaa.class));
            }
            if (i == 6) {
                startActivity(new Intent(this, HangafaErgamootaa.class));
            }
            if (i == 7) {
                startActivity(new Intent(this, HarmeeIyyesuus.class));
            }
            if (i == 8) {
                startActivity(new Intent(this, KennaaFannooJalaa.class));
            }

            if (i == 9) {
                startActivity(new Intent(this, WabiiKiyyaTaii.class));
            }
            if (i == 10) {
                startActivity(new Intent(this, YooTureeyyuu.class));
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
            textView.setText(title[position]);
            return row;
        }

    }
}