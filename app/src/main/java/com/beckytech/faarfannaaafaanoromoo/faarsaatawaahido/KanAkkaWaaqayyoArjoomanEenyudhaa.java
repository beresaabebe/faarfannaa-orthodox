package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KanAkkaWaaqayyoArjoomanEenyudhaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan akka waaqayyo arjooman eenyudhaa\n" +
            "Kan akka waaqayyo olaanaan eenyudhaa\n" +
            "Ilil jedhaa galataaf dhaabbadhaa\n\n" +
            "Galaanni eertiraa nu duraa saaqamee\n" +
            "Fara’oon ni kufee galaanaan nyaatame\n" +
            "Dhadhaboonnis jabaachuun deemanii\n" +
            "Warri irrees kunoo hin leeyya’an\n\n" +
            "Galmi iyyaarikoo inni sodaatamaan\n" +
            "Kunoo ni diigame kadhannaaf faarfannaan\n" +
            "Gara jaboonni nutti jabaatanis\n" +
            "Ni jabaanna waaqa keenyan nutis\n\n" +
            "Kan nutti darbame waraanni diinotaa\n" +
            "Nu bira tareera yoo kadhannu gooftaa\n" +
            "Sillaaseedhaaf haa ta’uu galanni\n" +
            "Moo’ameera aangoo dhabe diinni\n\n" +
            "Galaanarra deemuf surraa qaba inni\n" +
            "Dambalii ni dhaabaa aangoo isaatini\n" +
            "Ilmi dubroo kan nu waaqeffannuu\n" +
            "Jiraatadhaa baruma baraanuu\n";

    String title = "Kan Akka Waaqayyo Arjooman Eenyudhaa";

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