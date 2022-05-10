package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

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

public class FaarsaaTawaahido extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Amma reefu tolee eeyyee amma reef tolee", "Ayyaana Argatte Ulfina Durbummaa", "Kan Akka Waaqayyo Arjooman Eenyudhaa",
            "Kan laphee kiyyaa Eenyuttan himaa", "Kasoomni Kee Dinqii Garraammummaan Kee", "Lapheen Koo Haa Baasu Galata Uumaa Koo",
            "Nan carromee nan duromee", "Nagaadhaan nuukottu", "Nan carromee nan duromee", "Sin dagadhuu na gudistee tawaahidoo",
            "Ulfina toloota yaa giiftii", "Yaa Haadha koo waanan sitti himadhe", "Yaa mikaa’eel hangafa ergamootaa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Tawaahidoo");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AmmaReefuTolee.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AyyaanaArgatteUlfinaDurbummaa.class));
                    break;
                case 2:
                    startActivity(new Intent(this, KanAkkaWaaqayyoArjoomanEenyudhaa.class));
                    break;
                case 3:
                    startActivity(new Intent(this, KanLapheeKiyyaa.class));
                    break;
                case 4:
                    startActivity(new Intent(this, KasoomniKeeDinqiiGarraammummaanKee.class));
                    break;
                case 5:
                    startActivity(new Intent(this, LapheenKooHaaBaasuGalataUumaaKoo.class));
                    break;
                case 6:
                    startActivity(new Intent(this, Maariyaamiidhaafi.class));
                    break;
                case 7:
                    startActivity(new Intent(this, NagaadhaanNuukottu.class));
                    break;
                case 8:
                    startActivity(new Intent(this, NanCarroome.class));
                    break;
                case 9:
                    startActivity(new Intent(this, SinDagadhuu.class));
                    break;
                case 10:
                    startActivity(new Intent(this, UlfinaTolootaYaaGiiftii.class));
                    break;
                case 11:
                    startActivity(new Intent(this, YaaHaadhaKooWaananSittiHimadhe.class));
                    break;
                case 12:
                    startActivity(new Intent(this, YaaMikaaeelHangafaErgamootaa.class));
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