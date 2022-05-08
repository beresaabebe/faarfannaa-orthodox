package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class JaalalliWaaqayyoo  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Jaalalli Waaqayyoo anaaf baay’ateera\n" +
            "Aangoo mucummaa isaa tolaan naa kenneera\n" +
            "Jaalala isaa guddaa fannoodhan mullisee\n" +
            "Innumti nuu du’ee du’a irraa nu baasee\n" +
            "\n\n" +
            "Mucummaa koo dhiisee isaa irraa fagaannan\n" +
            "Addunya jaalladhe hiyyummaa filannaan\n" +
            "Cubbudhaaf bitamuus na hin jibbine Gooftaan\n" +
            "Na deebisee malee nawaame jaalalan\n" +
            "\n\n" +
            "Na fayyisuuf jedhee baay’ee gidiramee\n" +
            "Finciluu koo obsee ofitti na waamee\n" +
            "Bittaa seexana irraa bilisa nu baase\n" +
            "Uffata ulfinaa narrati deebise\n" +
            "\n\n" +
            "Du’a isaan ulfina kan na gonfachiiseef\n" +
            "Dukkana na baasee kan  ifa naa kenneef\n" +
            "Arjummaa kanaaf maalan dhiyyeefadhaa\n" +
            "Uumaa samiif lafaa nan galateeffadhaa\n";

    String title = "Jaalalli Waaqayyoo anaaf baay’ateera";

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