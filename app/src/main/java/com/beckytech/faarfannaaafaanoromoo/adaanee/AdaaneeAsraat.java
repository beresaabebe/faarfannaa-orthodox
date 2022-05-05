package com.beckytech.faarfannaaafaanoromoo.adaanee;

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

public class AdaaneeAsraat extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Akka bishaan darbee",
            "An siin eebbifamee",
            "Fayyisuu kee",
            "Foonsaa muree",
            "Guddina kee",
            "Horree bulleerra",
            "Kan akka waaqayyoo",
            "Kennaa guyyaa jimaataa",
            "Kiristoos isumaa",
            "Mikaa'eel naaf dhufee",
            "Qaraniyoo",
            "Tiksee gaariin qabaa",
            "Yaa maariyamii giiftii koo",
            "Yaada keen dubroodha"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Adaanee Asraat");

        listView = findViewById(R.id.list_item);

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, songTitles);
        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
           switch (i) {
               case 0:
                   startActivity(new Intent(AdaaneeAsraat.this, AkkaBishaanDarbee.class));
                   break;
               case 1:
                   startActivity(new Intent(AdaaneeAsraat.this, AnSiinEebbifamee.class));
                   break;
               case 2:
                   startActivity(new Intent(AdaaneeAsraat.this, FayyisuuKee.class));
                   break;
               case 3:
                   startActivity(new Intent(AdaaneeAsraat.this, FoonsaaMuree.class));
                   break;
               case 4:
                   startActivity(new Intent(AdaaneeAsraat.this, GuddinaaKee.class));
                   break;
               case 5:
                   startActivity(new Intent(AdaaneeAsraat.this, HorreeBulleerra.class));
                   break;
               case 6:
                   startActivity(new Intent(AdaaneeAsraat.this, KanAkkaWaaqayyoo.class));
                   break;
               case 7:
                   startActivity(new Intent(AdaaneeAsraat.this, KennaaGuyyaaJimaata.class));
                   break;
               case 8:
                   startActivity(new Intent(AdaaneeAsraat.this, KiristoosIsuma.class));
                   break;
               case 9:
                   startActivity(new Intent(AdaaneeAsraat.this, MikaaeelNaafDhufee.class));
                   break;
               case 10:
                   startActivity(new Intent(AdaaneeAsraat.this, Qaraniyoo.class));
                   break;
               case 11:
                   startActivity(new Intent(AdaaneeAsraat.this, TikseeGaariinQabaa.class));
                   break;
               case 12:
                   startActivity(new Intent(AdaaneeAsraat.this, YaadaKeenDubroodha.class));
                   break;
               case 13:
                   startActivity(new Intent(AdaaneeAsraat.this, YaaMaariyamiiGiiftiiKoo.class));
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
            textView.setText(title[position]);
            return row;
        }

    }
}