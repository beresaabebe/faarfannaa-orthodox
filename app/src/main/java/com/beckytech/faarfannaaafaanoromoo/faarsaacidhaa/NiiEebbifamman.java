package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NiiEebbifamman extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ni Eebbifaman (2) har’aa isaanii\n" +
            "Dhiigaaf foon Gooftaan tokko ta’annii argammanni\n\n" +
            "Ni Eebbifaman  Isaaniif gammadde\n" +
            ">>           >>     Mannii kiristanna\n" +
            ">>           >>     Nufis gammachuudha kottan ililichin\n" +
            ">>           >>     Dinniisanin gidduu\n" +
            ">>           >>     Waan seenuf hin qabu\n" +
            ">>           >>     Waaqayyoo isaan egaa inniisani hin dhabu\n\n" +
            "Ni Eebbifaman ega isiin lamaan\n" +
            ">>           >>  Tokko tatanituu\n" +
            ">>          >>  umurii dheerassi sichi ni jiratu\n" +
            ">>          >>  Waliin morkaachunii\n" +
            ">>          >>  Isiinif hin ta’uu\n" +
            ">>          >>  Jireenyi keessani Waaqa waajjin haa ta’uu\n\n" +
            "Ni Eebbifaman  Kana booda hin jiru\n" +
            ">>        >>    Waaliin moorkaachunii\n" +
            ">>        >>     Bu’aa biraaf jecha walirra adda bahu\n" +
            ">>        >>    Jiraachuuf caarraqa\n" +
            ">>        >>    Akka Abrahmiif Saaraa\n" +
            ">>         >>   Akka aboota durii seena gaarii horaa\n";

    String title = "Ni Eebbifaman ";

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