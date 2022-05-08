package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AnaafWaaqayyoodha extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Anaaf Waaqayyoodha abdiin lubbukootii /2/\n" +
            "Isattan himadhaa yeroo rakkoo kootii /2/\n" +
            "Abdiin jireenyaa koo jabeenyi lubbuu koo /2/\n" +
            "Waaqayyoo gooftaadha humna qabeessi koo /2/\n\n" +
            "Waaqayyoo gooftaan koo anaaf hirkoo koodha /2/\n" +
            "Rakkina koo hundaaf anaaf abdii koodha /2/\n" +
            "Abdiin koo siirratti yaa arjaa gooftaa koo /2/ \n" +
            "Ati irraa na qabi yeroo gidiraa koo/2/\n\n" +
            "Maariyaam haadha Iyyesuus araara qabeettii /2/\n" +
            "Nagaan siif haata’u yeroo hunduumaatti /2/\n" +
            "Fannoon gooftaakootii anaaf fayyiisaadha /2/\n" +
            "Warraa itti hin amanneef garuu goowwummaadha /2/\n\n" +
            "Anaaf Waaqayyoodha abdiin cuubu kootii /2/\n" +
            "Isattan himadha yeroo rakkoo kootii /2/\n";

    String title = " Anaaf Waaqayyoodha abdiin lubbukootii ";

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