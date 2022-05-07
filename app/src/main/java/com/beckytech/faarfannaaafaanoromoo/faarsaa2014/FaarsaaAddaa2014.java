package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

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

public class FaarsaaAddaa2014 extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Agartuu koo",
            "Alaabaan kee isa",
            "Argameera",
            "Bu'uura yeedaloo",
            "Damaraa",
            "Dhaadannoo koo",
            "Fannoon argameera",
            "Fannoon gooftaa",
            "Fooliin koo",
            "Galata kee",
            "Gammadaa", "Haadhummaa keen hima", "Handarii nagaa", "Iddoo buufata kee", "Jaalalli kee addaa", "Jilbinfadhee",
            "Maariyaam ni caalti", "Mallattoo dhugaadha", "Mikaa'eel koottu", "Ni dandeessa yaa gooftaa", "Oolmaa kee",
            "Raajiif qabsuura kee", "Raajii ulfinni kee", "Sillaasee uumaa koo", "Uffata warqee", "Waa'ee keen hima",
            "Waa'ee keen hima Iyyesuus", "Waaqummaa kee"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarfataa Darajee");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(FaarsaaAddaa2014.this, AgartuuKoo.class));
                    break;
                case 1:
                    startActivity(new Intent(FaarsaaAddaa2014.this, AlaabanKeeIsa.class));
                    break;
                case 2:
                    startActivity(new Intent(FaarsaaAddaa2014.this, Argameera.class));
                    break;
                case 3:
                    startActivity(new Intent(FaarsaaAddaa2014.this, BuuuraYeedaloo.class));
                    break;
                case 4:
                    startActivity(new Intent(FaarsaaAddaa2014.this, Damaraa.class));
                    break;
                case 5:
                    startActivity(new Intent(FaarsaaAddaa2014.this, DhaadannooKoo.class));
                    break;
                case 6:
                    startActivity(new Intent(FaarsaaAddaa2014.this, FannoonArgameera.class));
                    break;
                case 7:
                    startActivity(new Intent(FaarsaaAddaa2014.this, FannoonGooftaa.class));
                    break;
                case 8:
                    startActivity(new Intent(FaarsaaAddaa2014.this, FooliinKee.class));
                    break;
                case 9:
                    startActivity(new Intent(FaarsaaAddaa2014.this, GalataKee.class));
                    break;
                case 10:
                    startActivity(new Intent(FaarsaaAddaa2014.this, Gammadaa.class));
                    break;
                case 11:
                    startActivity(new Intent(FaarsaaAddaa2014.this, HaadhummaaKeenHima.class));
                    break;
                case 12:
                    startActivity(new Intent(FaarsaaAddaa2014.this, HandariiNagaa.class));
                    break;
                case 13:
                    startActivity(new Intent(FaarsaaAddaa2014.this, IddooBuufataKee.class));
                    break;
                case 14:
                    startActivity(new Intent(FaarsaaAddaa2014.this, JaalallikeeAddaa.class));
                    break;
                case 15:
                    startActivity(new Intent(FaarsaaAddaa2014.this, Jilbinfadhee.class));
                    break;
                case 16:
                    startActivity(new Intent(FaarsaaAddaa2014.this, MaariyaamNiCaalti.class));
                    break;
                case 17:
                    startActivity(new Intent(FaarsaaAddaa2014.this, MallattooDhugaadha.class));
                    break;
                case 18:
                    startActivity(new Intent(FaarsaaAddaa2014.this, MikaaeelKoottu.class));
                    break;
                case 19:
                    startActivity(new Intent(FaarsaaAddaa2014.this, NiDandeessaaYaaGooftaa.class));
                    break;
                case 20:
                    startActivity(new Intent(FaarsaaAddaa2014.this, OolmaaKee.class));
                    break;
                case 21:
                    startActivity(new Intent(FaarsaaAddaa2014.this, RaajiifQabsuuraKee.class));
                    break;
                case 22:
                    startActivity(new Intent(FaarsaaAddaa2014.this, RajiiUlfinniKee.class));
                    break;
                case 23:
                    startActivity(new Intent(FaarsaaAddaa2014.this, SillaaseeUumaaKoo.class));
                    break;
                case 24:
                    startActivity(new Intent(FaarsaaAddaa2014.this, UffataWarqee.class));
                    break;
                case 25:
                    startActivity(new Intent(FaarsaaAddaa2014.this, WaaeeKeenHima.class));
                    break;
                case 26:
                    startActivity(new Intent(FaarsaaAddaa2014.this, WaaeeKeenHimaIyyesuus.class));
                    break;
                case 27:
                    startActivity(new Intent(FaarsaaAddaa2014.this, WaaqummaaKee.class));
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