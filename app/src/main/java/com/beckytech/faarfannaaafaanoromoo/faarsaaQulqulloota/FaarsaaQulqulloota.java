package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

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

public class FaarsaaQulqulloota extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Abbootiin qulqulluu", "Arseemaa qulqulluu", "Ba'e biyya kaaraanitii", "Bu'uura yeedaloo eegalee", "Giyoorgisiin jabaadha",
            "Kadhatan Baasiliyoosi", "Kan isa rukkutaniif", "Kennaan kee jabaa", "Qabsurrii kee addaa", "Qulqulloonni hundinuu",
            "Raajii giyoorgisii", "Takla hayimaanoot", "Urjii ifaan qulqulluu", "Wareegama Isxifaanoos"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Qulqulloota");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AbbootiinQulqulluu.class));
                    break;
                case 1:
                    startActivity(new Intent(this, ArseemaaQulqulluu.class));
                    break;
                case 2:
                    startActivity(new Intent(this, BaeBiyyaKaaraanitii.class));
                    break;
                case 3:
                    startActivity(new Intent(this, BuuraYeedalooEegale.class));
                    break;
                case 4:
                    startActivity(new Intent(this, GiyoorgisiinJaabadha.class));
                    break;
                case 5:
                    startActivity(new Intent(this, KadhatanBaasiliyoosi.class));
                    break;
                case 6:
                    startActivity(new Intent(this, KanIsaRukkutaniif.class));
                    break;
                case 7:
                    startActivity(new Intent(this, KennaanKeeJabaa.class));
                    break;
                case 8:
                    startActivity(new Intent(this, QabsurriiKeeAddaa.class));
                    break;
                case 9:
                    startActivity(new Intent(this, QulqulloonniHinduunu.class));
                    break;
                case 10:
                    startActivity(new Intent(this, RaajiiGiyoorgisii.class));
                    break;
                case 11:
                    startActivity(new Intent(this, TaklaHayimaanoot.class));
                    break;
                case 12:
                    startActivity(new Intent(this, UrjiiIfaanQulqulluu.class));
                    break;
                case 13:
                    startActivity(new Intent(this, WareegamaIsxifaanoos.class));
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