package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class JaalallikeeAddaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maariyaam (2) 'n jedhaa \n" +
            "Giiftiikoo Ani SinWaammadhaa\n" +
            "Rakkoonkoo Martinuu Tareeraa\n" +
            "Hundumtuu  Seenaa Naaf Ta'eera\n\n" +
            "  Maariyaam Dhaloonni Martinuu\n" +
            "   >>>> >>> >> Maqaakee Haa Waaman\n" +
            " >>>> >>> >> Siin Darbanii Jiruu\n" +
            " >>>> >>> >> Dhiiga Ilmakeetiin\n\n" +
            "Jaalallikee Adda Maal Jedhu Ayyookoo\n" +
            "Dhiifama Naaf Laatte Gooftaa Kadhatteetoo\n" +
            "Arjummaakee Maraaf Kennaa Hin Qabu Anii\n" +
            "Halkaniifi Guyyaa Sin Farfaadha Anii\n\n" +
            "      Maariyaam Addaamiif Sanyiinsaa \n" +
            "       >>>> >>> >> Maariyaam Haa Jedhan\n" +
            "        >>>> >>> >> Sitti Hirkataniitii\n" +
            "        >>>> >>> >> Gannnati Kan Argan\n\n" +
            "Dukkanni HinJiru Ifa Jiruun Kankoo\n" +
            "Eebba Maariyaamiitiin Guutame Keessikoo\n" +
            "Gammadeen Burraaqa Ani Akka Waatii\n" +
            "Gannata Galuudhaaf Ayyoonkoo Naaf Jirtii\n\n" +
            "   Maariyaam Warri Sitti Abdatee\n" +
            "   >>>> >>> >> Eenyuutu Rakkatee\n" +
            "    >>>> >>> >> Oolee Osoo Hin Buliin\n" +
            "      >>>> >>> >> Furmaata Argatee\n\n" +
            "Qilee NaFuulduraa Laalee Sodaadhullee\n" +
            "Bidiruunkoo Si'i Nan Ka'a Kufullee\n" +
            "Waadaa Fannoo Jalaa Maariyaamii Jechuun\n" +
            "Eenyumtuu Hin Qaana'uu Harmee Si Kadhachuun\n";

    String title = "Jaalalli kee addaa";

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