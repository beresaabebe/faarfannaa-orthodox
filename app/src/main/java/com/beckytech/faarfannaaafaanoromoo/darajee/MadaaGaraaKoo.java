package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MadaaGaraaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Madaa garaa koo\n" +
            "dhibee keessa koo\n" +
            "Kan bara dheeraa\n" +
            "Gooftaan koo argeera\n" +
            "Gooftaan fayyiseera.\n" +
            "    Ceesisa \n\n" +
            "Dhukkubsadhee ani\n" +
            "Firris na jibbaani\n" +
            "Yeroon qofaa ta'e\n" +
            "Situ anaaf ga'e.\n" +
            "    Ceesisa \n\n" +
            "Seenaa kan jijjiiru\n" +
            "Kan na faana hiriiru\n" +
            "Si qofaadha Abbaa koo\n" +
            "Galatoomi Gooftaa koo.\n" +
            "    Ceesisa \n\n" +
            "Dhiigni koo lola'ee\n" +
            "Qaamni koos aja'ee\n" +
            "Yoon tuqu wayyaasa\n" +
            "Naa fayyiise humniisa.\n" +
            "    Ceesisa \n\n" +
            "Jaamee ijji koo\n" +
            "Hin argu waan tokko\n" +
            "Harkasaan qaqqabee\n" +
            "Agartuu koo banee.\n" +
            "    Ceesisa \n\n" +
            "Dhala dhabee ani\n" +
            "Gaangoo naan jedhaani\n" +
            "Seenaa koo jijjiirtee\n" +
            "Deessuu na taasiiste.\n" +
            "    Ceesisa \n\n" +
            "Ergan isattii goree\n" +
            "Gooftaan na gargaaree\n" +
            "Furte dhiphina koo\n" +
            "Galatoomi Gooftaa koo.";

    String title = "Madaa garaa koo";

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