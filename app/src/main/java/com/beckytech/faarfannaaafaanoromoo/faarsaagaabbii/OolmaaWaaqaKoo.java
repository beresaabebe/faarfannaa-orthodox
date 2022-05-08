package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class OolmaaWaaqaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Oolmaa waaqa koo hin dagatamu na dubbadha\n" +
            "Osoon danda'uu hin callisuu nan faarfadha\n" +
            "Ifatti haa ba'u hundi haa baruu jaalalasaa\n" +
            "Na dhowwinaa nan dubbadhaa gaarummaasaa\n\n" +
            "      Qomatti nu baate dugdaasaan reebame\n" +
            "      Dugdatti nu baate laphee waranamee\n" +
            "      Hangana hin jedhamuu oolmaa inni nuuf oole  \n" +
            "      Kanaaf hin callisu dhugaan ba'a malee\n\n" +
            "Dhiigasaa nuuf laate osoo ofii dheebotuu\n" +
            "Foonsammoo nuuf laate osoo ofii beela'uu\n" +
            "Arjaadha gooftaan koo jaalallisaa guddaa\n" +
            "Waa'eensa yeroo ka'u kanaafan gammadaa\n\n" +
            "      An kanan lallabu afaankoo saaqamee\n" +
            "      Iyyeesuus kiristoos isa fannifame\n" +
            "      Maqaasa jajachuuf baay'e dhiphifamna\n" +
            "      Garuu jaalalasaaf kana caalaa taana\n\n" +
            "Sodaa tokko hin qabnu ifatti baaneerraa\n" +
            "Waa'eesaa dubbachuuf kutannee kaneerra\n" +
            "Lapheen keenyas dhiige jaalalasaatini\n" +
            "Maal goonet callisnaa ni faarfanna nutii\n";

    String title = " Oolmaa waaqa koo hin dagatamu ";

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