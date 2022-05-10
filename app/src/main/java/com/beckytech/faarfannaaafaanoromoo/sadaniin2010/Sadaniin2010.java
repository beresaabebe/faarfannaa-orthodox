package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

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

public class Sadaniin2010 extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Araarsituudha" ,
            "Bara gaddaa kootii" ,
            "Fannoon humna keenya" ,
            "Fannoon humna kootii",
            "Gabri'eel" ,
            "Gabre menfes qiddus" ,
            "Gorfadhuu lubbuu koo" ,
            "Haadha waaqa kootii" ,
            "Hundumma caaltii haati gooftaa" ,
            "Kidane mihireet" ,
            "Mikaa'eel tiksee koo" ,
            "Tawaahidoodha"};

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
                startActivity(new Intent(this, Araarsituudha.class));
            }
            if (i == 1) {
                startActivity(new Intent(this, BaraGaddaKootii.class));
            }
            if (i == 2) {
                startActivity(new Intent(this, FannoonHumnaKeenya.class));
            }
            if (i == 3) {
                startActivity(new Intent(this, FannoonHumnaKootii.class));
            }
            if (i == 4) {
                startActivity(new Intent(this, GabrieelSadaan.class));
            }
            if (i == 5) {
                startActivity(new Intent(this, GebreMenfesQiddus.class));
            }
            if (i == 6) {
                startActivity(new Intent(this, GorfadhuuLubbuuKee.class));
            }
            if (i == 7) {
                startActivity(new Intent(this, HaadhaWaaqaKootii.class));
            }
            if (i == 8) {
                startActivity(new Intent(this, HundummaCaaltiiHaatiGooftaa.class));
            }

            if (i == 9) {
                startActivity(new Intent(this, Kidanemihireet.class));
            }
            if (i == 10) {
                startActivity(new Intent(this, MikaaeelTikseeKoo.class));
            }
            if (i == 11) {
                startActivity(new Intent(this, Tawaahidoodha.class));
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