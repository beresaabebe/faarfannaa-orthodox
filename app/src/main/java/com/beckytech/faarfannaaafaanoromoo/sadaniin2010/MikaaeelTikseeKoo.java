package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MikaaeelTikseeKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Mikaa'eel tiksee koo gargaara koo koottu    \n" +
            "hinaftuun Diinni koo qaanofte haa baddu\n" +
            "jaalalan na bittee ati hooma  hin dadhabdu\n" +
            "maqaa kee waammadheen argadhe gammachuu\n\n" +
            "Mikaa’eel tiksee koo  Dhiphuun baay’atuu\n" +
            "            “         gidiraan lafarraa\n" +
            "             “         Dinaatiin qabamee\n" +
            "             “        yoon dhabeyyuu karaa\n" +
            "              “        Maqaa kee yoon waamuu \n" +
            "              “       daandiin koo naa ifaa\n\n" +
            " Mikaa’eel tiksee koo  Maqaa kee yoon waamuu\n" +
            "          “       Mika'eel jechuunii\n" +
            "           “      Anarra fagaatuu\n" +
            "           “      warri diia kootii\n" +
            "           “      Maqaa keen waammadhaa\n" +
            "           “      koottu garaa koottii\n\n" +
            "Mikaa’eel tiksee koo Uummata isiraa'eel \n" +
            "           “             biyya gibxii baaftee\n" +
            "           “            Galaana addaan kuttee\n" +
            "           “            kan isaan ceesiftee\n" +
            "          “           Biyya kaana’aanitti\n" +
            "          “           nagaadhaan galchitee\n\n" +
            "Mikaa’eel tiksee koo Harka diinaa keessaa\n" +
            "            “      Afomiyaa olchitee \n" +
            "            “       Afaan  leencaa keessaa \n" +
            "           “        Daan’eeliin baastee\n" +
            "           “       nuti si waammannaa\n" +
            "           “       ati yoom nu gaattee\n";

    String title = "Mikaa'eel tiksee koo";

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