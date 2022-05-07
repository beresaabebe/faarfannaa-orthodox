package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class OolmaaKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Oolmaa kee  Mana waaqayyoo \n" +
            "Inni isheen hundumaaf taatee \n" +
            "Dhiiga gooftaatin hundooftee \n" +
            "Ilmaan ishee nu kunuunsitee\n" +
            "       @Ceesisa\n" +
            "Ijoollummaarraa eegaltee\n" +
            "Kunuunsitee kan guddiste\n" +
            "Soorata lubbuu laachafi \n" +
            "Jiraataa baraa taasiftee \n" +
            "             @Ceesisa\n" +
            "Ogummaa jireenyaa gaarii \n" +
            "Kan nama goonfachiistedha\n" +
            "Qulqulleettiin Mana kiristiyaanaa\n" +
            "Soorettii waan hundumaadha \n" +
            "             @Ceesisa\n" +
            "Waltajjii namaa fi waaqaa\n" +
            "Kan irratti Wal arganii \n" +
            "Yaada fii hawwii garaa \n" +
            "Ofii iddoo waaqatti himanii \n" +
            "            @Ceesisa\n" +
            "Gurriif ijji waaqayyoo \n" +
            "Yeroo hunda gara shee laala \n" +
            "Galma cubbamootaatirraa \n" +
            "Obdii waaqayyootu caala\n";

    String title = "Oolmaa kee";

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