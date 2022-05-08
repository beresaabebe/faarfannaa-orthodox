package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BaayatusBarriQoruumsaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Baay'atus barri qoruumsaa \n" +
            "Waaqayyoo nu baayisaa\n" +
            "Eebbasaan mirga dhaabbanne\n" +
            "Waaqayyoon tasa nu hin dhiisne (x2)\n\n" +
            "          Jaalalaaf shittoo naardoosii\n" +
            "         Naaf ta'e gooftaa iyyeesuusi\n" +
            "         Bakakkaan ennaa bu'eeyyuu\n" +
            "          Nutillee jirraa ammayyuu (x2)\n\n" +
            "Motootaaf balabala banaa\n" +
            "Dibata eebbaa dibannee\n" +
            "Ba'aa keenya nuuf baateera\n" +
            "Dhiigasaa nuuf lolaaseera (x2)\n\n" +
            "         Boqotee keessi garaakoo\n" +
            "         Naaf ta'ee kennaa da'ookoo\n" +
            "         Hundumtuu tasa hin mul'amnuu\n" +
            "         Waaqa jabaa osoo qabnuu(x2)\n\n" +
            "Jireenya gaaddisasf da'oo\n" +
            "Waan gaarii anaaf yaa ta'uu\n" +
            "Dhugaati nyaataa jireenyaa\n" +
            "Arjaadha waaqayyoon keenyaa(x2)\n";

    String title = "Baay'atus barri qoruumsaa";

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