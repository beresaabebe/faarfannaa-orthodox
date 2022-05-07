package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Damaraa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Damaraa walitti qabaa muka bobeessa \n" +
            "Aarrisaa nii ta'aa mallattoosaa \n" +
            "Bakkichaa gadfageessaati qotaa\n" +
            "Achumaa argattu fannoo gooftaa/2 \n" +
            "\n\n" +
            "Birraan nuuf ga’ee egaa kunoo\n" +
            "Booqaan Masqalaa nuuf bari'ee \n" +
            "Dukkanni addunyaa rakkoon namaas \n" +
            "Fannoo Iyyesuusiin isaan hafee \n" +
            "\n\n" +
            "Bara dheeraadhaaf badee turus \n" +
            "Dhokatee hin hafne ni argamee\n" +
            "Dawaan dhukkubaa nama hundaa \n" +
            "Humna Seexanaa cabsee mo'ee \n" +
            "\n\n" +
            "Kiriyaakoosiin nii gorfamte \n" +
            "Mootittii Illeeniin fanno argatte\n" +
            "Qusxinxiinosii fannoo isaatiin \n" +
            "Diinotasaa hundaa injifatee \n" +
            "\n\n" +
            "Masqalli waggaa kabajamuu \n" +
            "Dhaloota dhufuun ittifufa \n" +
            "Diinonni nurratti humna hinqabu \n" +
            "Fannoosaa arginaan nahee kufaa \n" +
            "\n\n" +
            "Saba Kiristaanaa  hawwiin kee raawwatee\n" +
            "Kan gooftaa Iyyesuus irratti dhiphate " +
            "Bara dheeraadhaaf badee dhokatee \n" +
            "Mootittii Illeeniitu Mul’ataan argatte/2\n";

    String title = "Damaraa";

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