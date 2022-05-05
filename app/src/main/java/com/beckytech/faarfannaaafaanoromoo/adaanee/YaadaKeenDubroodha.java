package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaadaKeenDubroodha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaada keen Dubroodha\n" +
            "Foon keenis dubroodha\n" +
            "Yaa haadha danda’a\n" +
            "Nagaan siif ni ta'a\n" +
            "......................\n\n" +
            "Isayyaas dursee dubbate\n" +
            "Raajuudhaan isa hubate\n" +
            "Ulfoofte Durbi durummaan\n" +
            "Afuura qulqulluu dhaan\n" +
            "Ni deesse Beetelemitti\n" +
            "Magaalaa Daawitiitti\n" +
            "Arginee dhalachuu Gooftaa\n" +
            "Rawwate Raajiin raajootaa\n" +
            "......................\n\n" +
            "Raajichi Hizqeel argee\n" +
            "Balbala bahaa cufamee\n" +
            "Waan tokkoo bara baraanii\n" +
            "Garaa sheet gale Gooftaanii\n" +
            "Cufamee baraan jiraataa\n" +
            "Hin banamuum lammataa\n" +
            "Waa'ee Durbummaa ishee\n" +
            "Akkasitti ragaa bahee\n" +
            "......................\n\n" +
            "Lalistuu odoo hin gubatin\n" +
            "Siinarratti Arge muuseenii\n" +
            "Maariyaam Dubree si'iidha\n" +
            "Teessoof bultoon gooftadha\n" +
            "Dandeessee Abidda sanaa\n" +
            "Sin gubne yaa sooliyaanaa\n" +
            "Kan bulee garaa kee keessa\n" +
            "Waaqadha innoo Fayyisaa\n" +
            "......................\n\n" +
            "Gammadii biyya raajotaa\n" +
            "Yaa Harmee Addaam lammataa\n" +
            "Ilmi kee gorsaa Dhugaatii\n" +
            "Fayyisaa Foonif lubbuutii\n" +
            "Si'ool duwwaa hambisee\n" +
            "Gannatatti hunda ceesisee\n" +
            "Kanaaf mee Dhaloonni martuu\n" +
            "Maqaa keef ulfina laatu\n";

    String title = "Yaada keen dubroodha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(title);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(title);

        textContent = findViewById(R.id.textview);
        textContent.setText(content);

    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}