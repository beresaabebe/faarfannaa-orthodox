package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ErgamaMikaaeel extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ergamaa mikaa'el ana wajjin jiraa \n" +
            "Isati narraa qolee rakkoo fi gidiraa\n" +
            "Boollatti gatamnani hin hafnee na bira\n" +
            "Isadha eegaan koo kan naaf ta'ee firaa(2)    \n      \n" +
            "Akka Afoomiyaa suuraa kee qabaanne\n" +
            "Si waamna yoomu Mikaa'eel jennee\n" +
            "Ulfaata suura keen diina injifannee\n" +
            "Si kadhanna yoomu nuto jilbifannee\n\n" +
            "Ummata Isra'eel hin dhibne dukkanni\n" +
            "Utubaa Abiddaan isaan oofee inni\n" +
            "Ergamaa Mikaa'eelif haa ta'u ulfinni\n" +
            "Reefa muuseetif  falmateera innii\n\n" +
            "Qulqulluu Dani'eel miilaf harka hidhamee\n" +
            "Kan baayyee beela'an leeccootaaf laattamee\n" +
            "Boolla faana bu'ee wajjiniin Argamee\n" +
            "Baasera Mikaa'eel innoo yoom nyaatame    \n        \n" +
            "Mikaa'eel nu ganne numa wajjin turee\n" +
            "Xalayaa Bahiraan kan irraa cicciree\n" +
            "Kan jireenyaf nagaa taasisun jijjiree\n" +
            "Akka inni hin duneef lubbuusaa bararee\n\n" +
            "          F/taa Dn Abarraa Baqqalaa \n";

    String title = "Ergamaa Mikaa'eel";

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