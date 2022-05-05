package com.beckytech.faarfannaaafaanoromoo.lameen2011;

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

public class Lameen2011 extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Amaanu'eel abbaa koo" ,
            "Eenyuttan gammadaree" ,
            "Ergamaa mikaa'eel" ,
            "Kakuu araaraa" ,
            "Kennaan kee hin badu" ,
            "Maaloo hin goyyominaa" ,
            "Nuuf dhalattee" ,
            "Qulqulleetti arseemaa" ,
            "Si malee" ,
            "Sillaasee" ,
            "Tiksee gaariidha ati"};

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
                startActivity(new Intent(this, AmaanueelAbbaaKoo.class));
            }
            if (i == 1) {
                startActivity(new Intent(this, EenyuttanGammadaree.class));
            }
            if (i == 2) {
                startActivity(new Intent(this, ErgamaMikaaeel.class));
            }
            if (i == 3) {
                startActivity(new Intent(this, KakuuAraaraa.class));
            }
            if (i == 4) {
                startActivity(new Intent(this, KennaanKeeHinBadu.class));
            }
            if (i == 5) {
                startActivity(new Intent(this, MaalooHinGoyyominaa.class));
            }
            if (i == 6) {
                startActivity(new Intent(this, NuufDhalattee.class));
            }

            if (i == 7) {
                startActivity(new Intent(this, QulqulleettiArseema.class));
            }
            if (i == 8) {
                startActivity(new Intent(this, Sillaasee.class));
            }
            if (i == 9) {
                startActivity(new Intent(this, SiMalee.class));
            }
            if (i == 10) {
                startActivity(new Intent(this, TikseeGaariidhaAti.class));
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