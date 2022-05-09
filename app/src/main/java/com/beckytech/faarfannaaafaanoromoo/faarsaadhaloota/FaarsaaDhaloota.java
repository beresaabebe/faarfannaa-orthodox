package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

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

public class FaarsaaDhaloota extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Ati ati Beteliheem lafa Yihudaa",
            "Beeteliyeemitti raajiin raawwateera",
            "Dalla keessa ciisee huccuudhaan marame",
            "Galanni haa ga'u Amanu'eeliin",
            "Ishoo Gooftaan Nuu Dhalate Qorichi Keenya",
            "Ishoo ishoo nuu dhalate",
            "Kunoo dhalatera fayyisaan addunyaa",
            "Mooraa Loonii Keessatti",
            "Nu fayyisudhaf Kan dhalate Amanu’elidha",
            "Beeteliyeemitti raajiin raawwateera",
            "Warri haayyoota dhufan Urjii hordofani"
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
                    startActivity(new Intent(this, AtiAtiBeteliheem.class));
                    break;
                case 1:
                    startActivity(new Intent(this, Beeteliyeemitti.class));
                    break;
                case 2:
                    startActivity(new Intent(this, DallaKeessaCiisee.class));
                    break;
                case 3:
                    startActivity(new Intent(this, GalanniHaaGauAmanueeliini.class));
                    break;
                case 4:
                    startActivity(new Intent(this, IshooGooftaanNuuDhalateQorichiKeenya.class));
                    break;
                case 5:
                    startActivity(new Intent(this, IshooIshooNuuDhalate.class));
                    break;
                case 6:
                    startActivity(new Intent(this, KunooDhalatera.class));
                    break;
                case 7:
                    startActivity(new Intent(this, MooraaLooniiKeessatti.class));
                    break;
                case 8:
                    startActivity(new Intent(this, NuFayyisudhaf.class));
                    break;
                case 9:
                    startActivity(new Intent(this, SamiiIrraaNiBuee.class));
                    break;
                case 10:
                    startActivity(new Intent(this, UrjiidhaanDhufan.class));
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