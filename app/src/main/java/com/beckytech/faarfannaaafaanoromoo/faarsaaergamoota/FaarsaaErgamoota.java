package com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota;

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

public class FaarsaaErgamoota extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Afoomiyaadhannii", "Akka anaaniya", "Akka nuu eebbistuuf", "Ergamaa Gabri'eel", "Galaana dhaabee",
            "Maqaa kee ajaa'iba", "Naannoo warra waaqayyoon", "Qulqulluu Mikaa'eel", "Yaa gabri'eeli nuu araarsi"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Ergamoota");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, Afoomiyaadhanii.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AkkaAnaaniya.class));
                    break;
                case 2:
                    startActivity(new Intent(this, AkkaNuuEebbistuuf.class));
                    break;
                case 3:
                    startActivity(new Intent(this, DandeetiiWaanDhabdeef.class));
                    break;
                case 4:
                    startActivity(new Intent(this, ErgamaaGabrieel.class));
                    break;
                case 5:
                    startActivity(new Intent(this, GalaanaDhaabee.class));
                    break;
                case 6:
                    startActivity(new Intent(this, MaqaaKeeAjaaiba.class));
                    break;
                case 7:
                    startActivity(new Intent(this, NaannooWarraWaaqayyoon.class));
                    break;
                case 8:
                    startActivity(new Intent(this, QulqulluuMikaeel.class));
                    break;
                case 9:
                    startActivity(new Intent(this, YaaGabreeliiNuuAraarsi.class));
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