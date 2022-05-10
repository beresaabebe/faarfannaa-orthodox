package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

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

public class FaarsaaAyyaana extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Akka ergamaa gabri’eelii", "Akka yoosef akka solomee osoo taane", "Ayyaana Argattee", "Betelemittii dhalatee", "Bu'ee jedhaa", "Bultoo Waaqayyo Ilmaa(ማሕደረመለኮት)",
            "Dallaa keessa ciisa", "Dubartoota keessaa filatamtee", "Eenyumtuu Hin Jiru (ወመኑ መሐሪ ዘከማከ)", "Galanni sillaasef በመላእክቲሁ ስቡህ ዘለዓለም",
            "Galateeffamaadha hanga bara baraatti", "Hundaa dabarsitee kan yoonan nugeessee", "Isheen nuuf kadhatti isheen nuuf kadhatti",
            "Ishoo ishoo nuu dhalatee", "Koottu mikaa’eel koottu", "Kunoo dhalateera fayyisaan addunyaa",
            "Maariyaam Ni Caalti (ማርያምተዐቢ)", "Mee dubbadhaa ajaa’ibasaa ተናገሩ ድንቅ ሥራውንም", "Misiraachoo nu gammaneerra",
            "Mootichi kana(ንጉስዉእቱ)", "Ni amannaa abbaatti እናምናለን በአብ", "Ni Dhalate Beeteliheemitti", "Nuuf kadhadhu giiftii keenyaa", "Samiii irraa ni bu’e",
            "Sigalateeffanna dubroo maariyamii", "Si waamnaa Amaanu’eelii", "Tiksee gaarii keenya", "Tsillaatii Musee(ፅላት)", "Urjiidhan dhufanii",
            "Waaqayyoon nu fayyise (መዳኒዓለምአዳነን)", "Wangeelatti kan amantan በወንጌሉ ያመናችሁ", "Yaa Garaa Laafeetii ኦ ርኀርኀተ ህሊና", "Yaa Waaqayyoo Gooftaa Si Galateeffannaa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Yeroo Ayyaana");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AkkaErgamaaGabrieeli.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AkkaYoosefAkkaSolomeeOsooTaane.class));
                    break;
                case 2:
                    startActivity(new Intent(this, AyyaanaArgattee.class));
                    break;
                case 3:
                    startActivity(new Intent(this, Betelememitti.class));
                    break;
                case 4:
                    startActivity(new Intent(this, BueeJedhaa.class));
                    break;
                case 5:
                    startActivity(new Intent(this, BultooWaaqayyooIlmaaDha.class));
                    break;
                case 6:
                    startActivity(new Intent(this, DallaaKeessaCiisa.class));
                    break;
                case 7:
                    startActivity(new Intent(this, DubartootaKeessaaFilatamtee.class));
                    break;
                case 8:
                    startActivity(new Intent(this, EenyumtuuHinJiru.class));
                    break;
                case 9:
                    startActivity(new Intent(this, GalanniSillaasef.class));
                    break;
                case 10:
                    startActivity(new Intent(this, Galateeffamaadha.class));
                    break;
                case 11:
                    startActivity(new Intent(this, HundaaDabarsitee.class));
                    break;
                case 12:
                    startActivity(new Intent(this, IsheenNuufKadhatti.class));
                    break;
                case 13:
                    startActivity(new Intent(this, IshooIshooNuuDhalatee.class));
                    break;
                case 14:
                    startActivity(new Intent(this, KoottuMikaaeelkoottu.class));
                    break;
                case 15:
                    startActivity(new Intent(this, KunooDhalateeraFayyisaanAddunyaa.class));
                    break;
                case 16:
                    startActivity(new Intent(this, MaariyaamNiCaalti.class));
                    break;
                case 17:
                    startActivity(new Intent(this, MeeDubbadhaa.class));
                    break;
                case 18:
                    startActivity(new Intent(this, MisiraachooNuGammaneerra.class));
                    break;
                case 19:
                    startActivity(new Intent(this, MootichiKana.class));
                    break;
                case 20:
                    startActivity(new Intent(this, NiAmannaaAbbaattii.class));
                    break;
                case 21:
                    startActivity(new Intent(this, NiDhalateBeeteliheemitti.class));
                    break;
                case 22:
                    startActivity(new Intent(this, NuufKadhadhuGiiftiiKeenyaa.class));
                    break;
                case 23:
                    startActivity(new Intent(this, SamiirraaNiBue.class));
                    break;
                case 24:
                    startActivity(new Intent(this, SiGalateeffannaDubrooMaariyamii.class));
                    break;
                case 25:
                    startActivity(new Intent(this, SiWaamnaaAmaanueel.class));
                    break;
                case 26:
                    startActivity(new Intent(this, TikseeGaariiKeenya.class));
                    break;
                case 27:
                    startActivity(new Intent(this, TsillaatiiMusee.class));
                    break;
                case 28:
                    startActivity(new Intent(this, UrjiidhanDhufanii.class));
                    break;
                case 29:
                    startActivity(new Intent(this, WaaqayyoonNuFayyise.class));
                    break;
                case 30:
                    startActivity(new Intent(this, WangeelattiKanAmantan.class));
                    break;
                case 31:
                    startActivity(new Intent(this, YaaGaraaLaafeetii.class));
                    break;
                case 32:
                    startActivity(new Intent(this, YaaWaaqayyooGooftaaSiGalateeffannaa.class));
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