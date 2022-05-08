package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaqaaabbaakanIlmaaAfuuraQulqulluu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maqaa abbaa kan Ilmaa Afuura Qulqulluu  \n" +
            "Hallee/2/ luyaa jennee haa eegalluu  \n" +
            "Jennee eegalla galata/2/ waaqayyoof  \n" +
            "Hanga yeroo kanaan eegee waan nu ga’eef/2/  \n" +
            "Waaqni yoo dhalatu Dubroorraa gola loonititti/2/  \n" +
            "Nageenya bu’uure uumama addunyaati/2/   \n\n" +
            "Ilmi yoo cuuphamu bishaaniin \n" +
            "Bishaan Yoordaanosiin  \n" +
            "Bifa gugeen bu’e afuurri qulqulluun/2/  \n\n" +
            "Gooftaa fannisnaan ayihudoonni fannoo mukaarratti/2/  \n" +
            "Qulqulluu Gabri’eeliin itti dheekkameeti/2/\n   \n" +
            "Seexanni hidhame ilma namaaf nageenyis ni ta’e/2/ \n" +
            "Akkuma dubbate du’a moo’ee ka’e/2/    \n\n" +
            "Fayyisaan addunyaa olba’e olba’e ililliin/2/  \n" +
            "Duuti aangoo dhabe hidhameera diinni/2/   \n \n" +
            "Loogii hin qabu murtiin kee/2/ yeroo hundaa   \n" +
            "Dureessa fi hiyyeessa kan hin jenne sidha/2/\n  \n" +
            "Dubroo Maariyaamii qulqulleettii haadha gooftaa keenyaa/2/  \n" +
            "Karaa keen arganne jannata jireenyaa/2/  \n" +
            "Ilil/2/ jennee si galateeffanna/2/  \n";

    String title = " Maqaa abbaa kan Ilmaa Afuura Qulqulluu";

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