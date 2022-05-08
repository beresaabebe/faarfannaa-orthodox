package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

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

public class FaarsaaGaabbii extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Akka biyya lafaaf", "Akka jecha kee kan ta'uu deemsi koo", "Anaaf waaqayyoodha", "Anoo gochaa kootiin",
            "Dandeetti isaattin", "Gooftaan qorameera diina hamaadhaani", "Gooftaan keenya nuuf tsoome", "Jaalalli samiirraa",
            "Jaalalli waaqayyoo", "Kan tsoome", "Kitaaba qulqulluu hunduu ni dubbisaa", "Kottaa yaa namootaa", "lakki gorfamii gorfamii",
            "Lakki yaa mucaa koo", "Lubbuu sif abbomamu", "Maaloo yaa waaqa koo", "Malaan himaa anii", "Museen tsoomera", "Nan dhibiin lubbuu koo",
            "Narraa baay'atee olmaan kee", "Oolmaan waaqa koo", "Siifan dhiise yaa haadha koo", "Waaqayyoo gooftaa koo", "Yaa mana waaqayyoo",
            "Yaa namaa", "Yaa nama deebi'ii deebi'ii", "Yaa uumaa koo", "Yaa Waaqayoo nuutti si kadhannaa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Gaabbii");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AkkaBiyyaLafaaf.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AkkaJechaKeeKan.class));
                    break;
                case 2:
                    startActivity(new Intent(this, AnaafWaaqayyoodha.class));
                    break;
                case 3:
                    startActivity(new Intent(this, AnooGochaKootiin.class));
                    break;
                case 4:
                    startActivity(new Intent(this, DandettiiIsaatiin.class));
                    break;
                case 5:
                    startActivity(new Intent(this, GoftaanQorameeraDiinaHamaadhaani.class));
                    break;
                case 6:
                    startActivity(new Intent(this, GooftaanKeenyaNuufSome.class));
                    break;
                case 7:
                    startActivity(new Intent(this, JaalalliiSamirraa.class));
                    break;
                case 8:
                    startActivity(new Intent(this, JaalalliWaaqayyoo.class));
                    break;
                case 9:
                    startActivity(new Intent(this, KanSome.class));
                    break;
                case 10:
                    startActivity(new Intent(this, KitaabaQulqulluuHunduuNiDubbisaa.class));
                    break;
                case 11:
                    startActivity(new Intent(this, KottaaYaaNamootaa.class));
                    break;
                case 12:
                    startActivity(new Intent(this, LakkiiGorfamiiGorfamii.class));
                    break;
                case 13:
                    startActivity(new Intent(this, LakkiYaaMucaaKoo.class));
                    break;
                case 14:
                    startActivity(new Intent(this, LubbuuSiifAbbomamu.class));
                    break;
                case 15:
                    startActivity(new Intent(this, MaalooYaaWaaqaKoo.class));
                    break;
                case 16:
                    startActivity(new Intent(this, MalaanHimaaAnii.class));
                    break;
                case 17:
                    startActivity(new Intent(this, MuseenSoomeera.class));
                    break;
                case 18:
                    startActivity(new Intent(this, NanDhibinLubbuuKoo.class));
                    break;
                case 19:
                    startActivity(new Intent(this, NarraaBaayateeOlmaa.class));
                    break;
                case 20:
                    startActivity(new Intent(this, OolmaaWaaqaKoo.class));
                    break;
                case 21:
                    startActivity(new Intent(this, SiifanDhiiseYaaHaadhakoo.class));
                    break;
                case 22:
                    startActivity(new Intent(this, WaaqayyooGooftaaKoo.class));
                    break;
                case 23:
                    startActivity(new Intent(this, YaaManaWaaqayyoo.class));
                    break;
                case 24:
                    startActivity(new Intent(this, YaaNamaa.class));
                    break;
                case 25:
                    startActivity(new Intent(this, YaaNamaaDeebii.class));
                    break;
                case 26:
                    startActivity(new Intent(this, YaaUumaaKoo.class));
                    break;
                case 27:
                    startActivity(new Intent(this, YaaWaaqayyooNuutiSikadhannaa.class));
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