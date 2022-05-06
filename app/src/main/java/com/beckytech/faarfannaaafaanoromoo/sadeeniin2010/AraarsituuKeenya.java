package com.beckytech.faarfannaaafaanoromoo.sadeeniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AraarsituuKeenya extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Araarsituu keenya isheen maariyaamiin \n" +
            "Araarsituu  keenya isheen haati waaqaa\n" +
            "Nutoo ishee wamaannaa ganamaf galgala          \n              \n" +
            "Maqaa kee yoon waamuu  maariyaamii\n" +
            " Diinni ni qanaa’aa                  “       \n" +
            "Yaa haadha Gooftaa koo           \n" +
            "Maqaa kee nan waama         “\n" +
            "Yaa haadha Gooftaa koo maqaa keen nan waamaa\n\n" +
            "Dhiphinni dookimaasi   maariyaamii\n" +
            "Si'in kan guutamee         “\n" +
            "Eenyutu qana’ee           “  \n" +
            "Maqaa ekaan kee waamee    “\n" +
            "Eenyutu qana'ee maqaa kan kee waamee                 \n\n" +
            "Hirkoo fayyina koo  maariyaamii    \n" +
            "Yaa durbee haadha koo    “          \n" +
            "Ani sinan boonaa        “ \n" +
            "Bara jireenya koo       “\n" +
            "Ani sinan boonaa bara jireenya koo\n\n" +
            "Yeeroo dhiphinaatii  maariyaamii\n" +
            "Maaqakee wammanaa     “\n" +
            "Maariyaam nuuf koottu   “ \n" +
            "Jennee si kadhanna           “\n" +
            "Maariyaam nuuf koottu jennee si kadhanna\n";

    String title = "Araarsituu keenya";

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