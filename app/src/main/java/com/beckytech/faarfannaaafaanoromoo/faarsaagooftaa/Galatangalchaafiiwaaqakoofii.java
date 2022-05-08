package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Galatangalchaafiiwaaqakoofii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Galatan galchaafii waaqakoofii\n" +
            "Bultoosaatti seenee sagadee isaafii\n" +
            "Hallee(2) luyaa jedhee\n" +
            "Oolmaasaan dubbadha wanta inni naaf godhee\n\n" +
            "   Jabaadha waaqayyoo hundaa nii danda'a\n" +
            "   Jecha sagaleesaan hundumtuu nii ta'aa\n" +
            "   Isaanan argadhee nagaa manakootii\n" +
            "   Alfaadhaaf omeegaa inni abdiikootii\n\n" +
            "Afaan leencaa cufee abiddas ni dhaamse\n" +
            "Jiraataa nu godhee du'a keessaa baasee\n" +
            "Mootiin samiif lafaa gooftaan maal dadhabaa\n" +
            "Qilleessa keessaanis innoo karaa qabaa 《2》\n" +
            ".......................\n" +
            "Bakkeetti gatamee miidhamee qaamnikoo\n" +
            "Calisetoo darbee nalaalee firrikoo\n" +
            "Suphee olnakaasee cabakoos dhidhibee\n" +
            "Galanni isaaf haata'u fuulasaa nadhaabee\n" +
            ".........................\n" +
            "Dhigasaa qulqulluun mallatteeffameeraa\n" +
            "Damee meexxii qaphee galataaf ka'eeraa\n" +
            "Sagalee moo'ichaan nanwaama maqaasaa \n" +
            "Bara jireenya koon dubbadha waa'eesaa\n";

    String title = " Galatan galchaafii waaqakoofii ";

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