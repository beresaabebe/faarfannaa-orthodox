package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WabiiKiyyaTaii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Wabbii kiyya ta’ii dhaabbadhuu na bukkee\n" +
            "Du’atti na laachuuf Diinni natti morkee\n" +
            "Yaa kakuu Araaraa si’ii agarraan sokkee (2)         \n                   \n" +
            "Keessummaa fakkaate      yaa kakuu Araaraa                          \n" +
            "Nattii seenee Diinni           “                           \n" +
            "Fakkeesse dubbatee          “                            \n" +
            "Naa mo’aatee inni            “\n\n" +
            "Ilma kee naaf kadhuu haadha bara baraa\n" +
            "Lubbuu koo haa boqotuu maaloo haadha Araaraa\n\n" +
            "Na dhisnee haati koo  yaa kakuu Araaraa\n" +
            "Cubbamaadha jettee        “\n" +
            "Dadhabbii koo laaltee           “\n" +
            "Harmee na fo’attee          “         \n\n" +
            "Ilma kee naaf kadhuu haadha bara baraa\n" +
            "Lubbuu koo haa boqotuu maaloo haadha Araaraa\n\n" +
            "Arasummaa kan keen yaa kakuu araaraa                      \n" +
            "Yoonaa nuu ga’eraa              “                     \n" +
            "Ulfaadhuu haadha koo         “                   \n" +
            "Maqaa kee waameraa         “\n\n" +
            "Ilma kee naaf kadhuu haadha bara baraa\n" +
            "Lubbuu koo haa boqotuu maaloo haadha Araaraa\n\n";

    String title = "Wabii kiyya ta'ii";

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