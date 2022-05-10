package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

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

public class FaarsaaYerooHundaa extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Abbootiin qulqulluu amantiin ta’anii", "Adoonayii Ati Waqaa Jirataa", "Akka biyya lafaaf abdiinkoo dhumeera ",
            "Akka jecha kee kan ta’u deemsi koo", "Ana faana ta'i yaa gooftaa abbaa koo", "Anoo gocha kootiin dadhabaa ta'eeraa",
            "Baay'atus barri qoruumsaa", "Cuuphamuun kee fayyina nuuf ta’e", "Galanni isaa kan amalummaasaa", "Galma koo galgala iddoo boqonnaa koo",
            "Haadhakoo maal jedheen si faarsa", "Haa galateeffamu waaqni har’aan nu ga’ee", "Haa galateeffannu Waaqayyooni",
            "Hojiin kee raajii dhaa bahaa hamma lixaatti", "Hoosa'inaa jeennee farfaannaa", "Jaalalaan Hunda goote ", "Jaalatamaadha maqaan kee",
            "Kanan ittin boonee eenyuree", "Kan kaleessa darbe isa har'a dhufu", "Kootta Yaa Namootaa", "Lakkii gorfamii gorfamii ",
            "Maaloo yaa waaqa koo narraa hin fagatanii", "Madani Alem Nu Fayyisee", "Mooraa Loonii Keessatti", "Oolmaan kee yaa giiftii",
            "Siifan dhiise yaa haadhakoo jireenya Koo", "Teessuma Sillaasee qulqulloonni marsanii", "Waa'ee keen hima", "Waan Naaf Goote Hundaaf",
            "Yaa mana Waaqayyoo ulfina qabeetti", "Yaa uumaa koo anoo si waammadhaa"
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
                    startActivity(new Intent(this, AbbootiinQulqulluu.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AdoonayiiAtiWaqaaJirataa.class));
                    break;
                case 2:
                    startActivity(new Intent(this, AkkaBiyyaLafaaf.class));
                    break;
                case 3:
                    startActivity(new Intent(this, AkkaJechaaKee.class));
                    break;
                case 4:
                    startActivity(new Intent(this, AnaFaanaTai.class));
                    break;
                case 5:
                    startActivity(new Intent(this, AnooGochaKootiin.class));
                    break;
                case 6:
                    startActivity(new Intent(this, BaayatusBarriQoruumsaa.class));
                    break;
                case 7:
                    startActivity(new Intent(this, CuuphamuunKee.class));
                    break;
                case 8:
                    startActivity(new Intent(this, GalanniIsaaKanAmalummaasaa.class));
                    break;
                case 9:
                    startActivity(new Intent(this, GalmaKoo.class));
                    break;
                case 10:
                    startActivity(new Intent(this, HaadhaKoo.class));
                    break;
                case 11:
                    startActivity(new Intent(this, HaaGalateeffamuWaaqniHaraanNuGaee.class));
                    break;
                case 12:
                    startActivity(new Intent(this, HaaGalateeffannu.class));
                    break;
                case 13:
                    startActivity(new Intent(this, HojiinKeeRaajiidhaa.class));
                    break;
                case 14:
                    startActivity(new Intent(this, Hoosainaa.class));
                    break;
                case 15:
                    startActivity(new Intent(this, JaalalaanHundaGoote.class));
                    break;
                case 16:
                    startActivity(new Intent(this, JaalatamaadhaMaqaanKee.class));
                    break;
                case 17:
                    startActivity(new Intent(this, KananIttinBoonee.class));
                    break;
                case 18:
                    startActivity(new Intent(this, KanKaleessaDarbe.class));
                    break;
                case 19:
                    startActivity(new Intent(this, KoottaYaaNamootaa.class));
                    break;
                case 20:
                    startActivity(new Intent(this, LakkiiGorfamii.class));
                    break;
                case 21:
                    startActivity(new Intent(this, MaalooYaaWaaqakoo.class));
                    break;
                case 22:
                    startActivity(new Intent(this, MadaniAlemNuFayyisee.class));
                    break;
                case 23:
                    startActivity(new Intent(this, MooraaLooniiKeessatti.class));
                    break;
                case 24:
                    startActivity(new Intent(this, OolmaanKeeYaaGiiftii.class));
                    break;
                case 25:
                    startActivity(new Intent(this, SiifanDhiiseYaaHaadhaKoo.class));
                    break;
                case 26:
                    startActivity(new Intent(this, TeessumaSillaasee.class));
                    break;
                case 27:
                    startActivity(new Intent(this, WaaeeKeenHima.class));
                    break;
                case 28:
                    startActivity(new Intent(this, WaanNaafGooteHundaaf.class));
                    break;
                case 29:
                    startActivity(new Intent(this, YaaManaWaaqayyoo.class));
                    break;
                case 30:
                    startActivity(new Intent(this, YaaUumaaKoo.class));
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