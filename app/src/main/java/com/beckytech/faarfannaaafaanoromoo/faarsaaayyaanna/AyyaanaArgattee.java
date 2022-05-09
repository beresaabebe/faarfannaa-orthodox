package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AyyaanaArgattee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Atii yaa haadha dhugaa x2 \n" +
            "Ayyaana argattee ulfina durbummaa\n" +
            "Maariyaamii siif bu’ee Afuurri Abbaa\n\n" +
            "Garaa Gisheen irraa…...yaa haadha dhugaa\n" +
            "Ulfinaan teesseertaa…\n" +
            "Eebba isaa guddaa…\n" +
            "Harkakeen qabdeertaa…\n" +
            "Si’ii ifni addunyaa…\n" +
            "Kabaja ulfinaa…\n" +
            "Maariyaamii Giiftii keenyaa…\n" +
            "Hedduu si jaalannaa…\n\n" +
            "Cimaadha gaarrisa…yaa haadha dhugaa\n" +
            "Fagoodha deemsisaa…\n" +
            "Naaf kadhuu Ilmakee…\n" +
            "Iyyasuu Uumaakoo…\n" +
            "Akka abaaboo birraa…\n" +
            "Mul’adhee akka hinbannee…\n" +
            "Cinaakoo dhaabbadhuu…\n" +
            "Raawwadhee akka hinkufnee…\n\n" +
            "Adaadii Maariyaamii…yaa haadha dhugaa\n" +
            "Nan dhufa manakee…\n" +
            "Na simadhu adaraa…\n" +
            "Harmeekoo mucaakee…\n" +
            "Yaadannoo Ilmakee…\n" +
            "Qabadhee fannoosaa…\n" +
            "Hinqaana’uu anoo…\n" +
            "Iliilcheen faarsaa…\n\n" +
            "Yoomuu si hindagadhuu…yaa haadha dhugaa\n" +
            "mamalakoo ganamaa…\n" +
            "Yaadannoo koo durii…\n" +
            "Daandiikoo fayyinaa…\n" +
            "Nakeessa jirawoo….\n" +
            "Dhiigni Ilmakeef foonsaa…\n" +
            "Kanaaf sijaalannaa…\n" +
            "Waan taateef haadhasaa…\n";

    String title = "Ayyaana Argattee";

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