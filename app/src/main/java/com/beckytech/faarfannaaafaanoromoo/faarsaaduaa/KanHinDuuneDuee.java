package com.beckytech.faarfannaaafaanoromoo.faarsaaduaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KanHinDuuneDuee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maaloo! Kan hin duune du’ee /2/\n" +
            "Deeme Qaraaniyoo namaan haarkifame\n" +
            "Kufee osoo ka’uu baay’ee gidiramee\n" +
            "Du’aa  nuhaambisuuf kan hin duune du’ee/2/\n\n" +
            "Harka fi miila hidhame gara fannoo deeme\n" +
            "Dhukkuba isa obsee yeroo akkas reebame\n" +
            "Baayistee niboosse Maariyaam dubrooni\n" +
            "Kiristoos Ilmi ishee fannifamnaan Gooftaan\n\n" +
            "Ayihudoota birat murtiin dogoggoree\n" +
            "Cubbamaan hiikamee qulqulluun qabame\n" +
            "Jaalala keenyaaf kan hin duune du’ee\n" +
            "Qaraaniyoo oole fannoon fannifame\n\n" +
            "Yoosef Niqoodimoos foon isaa kadhatani\n" +
            "Akka isaanii kennuuf mootummaan isaani\n" +
            "Foon isaa awwaallani awwaala haaraattii\n" +
            "Qulqulluuu  qulqulluu ulfaataa jechuun\n";

    String title = "Kan hin duune du’ee";

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