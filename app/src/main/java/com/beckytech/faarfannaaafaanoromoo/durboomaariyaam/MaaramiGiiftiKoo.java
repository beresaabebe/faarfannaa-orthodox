package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaaramiGiiftiKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maarami giifti koo haadha Goftaa keenyaa\n" +
            "Waaqni haagalatoomu kan siikeene Addunya\n" +
            "Dhiifama naa kadhu ilma kee haadha keenya /2/\n" +
            "Haadha keenyaa /2/ naaf keedhu Waaqa keenyaa /2/   \n" +
            "Baleessera baayee maal jedheen dhiyaadhaa\n" +
            "Maaram na araarsii sumattan iyyadhaa \n" +
            "Addaam  daba hojjeetee   gatiin cubuu kiyyaa\n" +
            "Soodaadhee dhiyaachuuf Maaram maal naaf wayyaa\n" +
            "Ba’aa natii ta’ee dadhabee cubbuu koo\n" +
            "Rakkoon koo baay’ate beeke ballessaa koo\n" +
            "Otoon hindhiyaatin ta’uuf waamamuunkoo\n" +
            "Amanu dadhabe keessummaa ta’uu koo\n" +
            "Otoon daba hojjadhu dabruufi lubbun koo\n" +
            "Egaa nati hindhiisiin Maraami giftii koo\n" +
            "Araara naaf kadhu ilma kee haadha koo /2/\n";

    String title = "Maarami giifti koo";

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