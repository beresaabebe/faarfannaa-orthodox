package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GiiftiiKooMaariyaam extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Giiftiikoo Maariyaam(x3)\n" +
            "Ergamoonni waaqaa kan si faarsanii(x2)\n\n" +
            "Harmee waaqayyooi ati jedhanii\n" +
            "    Daawwit kiraaranii   Maariyaami\n" +
            "    Kan sifarfaatee ''''''''\n" +
            " Izraan maseenqoon\n" +
            "  Kan sifarfaate\n" +
            "   (nutis sifarfaanna ijoolleenkee\n" +
            "    Nagaan siifa haata'u qulqulleettii \tjennee)(2x)\n\n" +
            "Biyyaa lafaarraa  maariyaam\n" +
            "Abbaan ilaale \n" +
            "Qulquulleetti akkaakee\n" +
            "Tokko hin arganne\n" +
            "Qulqullummaakee waaqni jaallate\n\n" +
            "Uumama hundumaarra bultoosaa sigodhate\n\n" +
            "        Boo'uu fi waawwaachuu maariyaamii\n" +
            "        Akka ooluufi\n" +
            "        Guyyaa dhumaatti\n" +
            "        Gannata galuufi \n" +
            "       Gargarsa hin qabnu Nuti kan biraa\n" +
            "        Ati nuuf kadhadhu ilmakee biraa\n\n" +
            "Umamamni    maariyaami\n" +
            "Suma kadhatuu\n" +
            "Kadhannaa keetiin\n" +
            "Dhiifama argatuu\n" +
            "Giiftii maariyaam kakuu dhiifamaa\n" +
            "Sumaan argama fayyinni namaa       \n";

    String title = "Giiftii koo maariyaam";

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