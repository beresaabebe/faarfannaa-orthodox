package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

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

public class FaarsaaCidhaa extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Akkaa Abrahamiif Saaraa",
            "Akkaa  Yaaqemif Hannaa",
            "Baga gammadanii misiroon lachuu",
            "Baga gammaddanii Eeyyee",
            "Baga isin ga’e gammachuu kanaanii",
            "ዳዊት ይሴብሕ ወይዜምር ዕዝራ",
            "Dinqii hojjate Gooftani",
            "Gammachuudha kan amantii keenyaa",
            "Miidhaganii Bareedu ",
            "Miisiroon Dhuufni (መጽአ መርዓዊ)",
            "Misiroon baga geessanii ciidhaa gaa’ila",
            "Ni Eebbifaman",
            "Qaanaa galilaatti",
            "Qanna gaalilatti በቃና ዘገሊላ",
            "Raajiidha dinqiidha hojiin Waaqadha",
            "ትዊድሶ መርዓት ወትብ"
     };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Yeroo Cidhaa");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AkkaaAbrahamiifSaaraa.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AkkaaYaaqemiifHannaa.class));
                    break;
                case 2:
                    startActivity(new Intent(this, BagaGammadanii.class));
                    break;
                case 3:
                    startActivity(new Intent(this, BagaGammadanni.class));
                    break;
                case 4:
                    startActivity(new Intent(this, BagaIsiinGaee.class));
                    break;
                case 5:
                    startActivity(new Intent(this, DawitYisebiho.class));
                    break;
                case 6:
                    startActivity(new Intent(this, DinqiiHojjette.class));
                    break;
                case 7:
                    startActivity(new Intent(this, Gammachuudha.class));
                    break;
                case 8:
                    startActivity(new Intent(this, MiidhaganiiBareedu.class));
                    break;
                case 9:
                    startActivity(new Intent(this, MiisiroonDhuufni.class));
                    break;
                case 10:
                    startActivity(new Intent(this, MisirroonBagaGeessanii.class));
                    break;
                case 11:
                    startActivity(new Intent(this, NiiEebbifamman.class));
                    break;
                case 12:
                    startActivity(new Intent(this, QaanaaGalilaatti.class));
                    break;
                case 13:
                    startActivity(new Intent(this, QannaGaalilatti.class));
                    break;
                case 14:
                    startActivity(new Intent(this, RaajiidhaDinqiidha.class));
                    break;
                case 15:
                    startActivity(new Intent(this, Tiwedisewa.class));
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