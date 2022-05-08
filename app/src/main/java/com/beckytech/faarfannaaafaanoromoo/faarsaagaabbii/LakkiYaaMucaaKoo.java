package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LakkiYaaMucaaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Lakki yaa mucaa koo maalif naa baqataa\n" +
            "Naa jalati baate kan diina maaf taata\n" +
            "       Ceesisa\n" +
            "Kuno ani siif jira Abbaan Lubbuu keeti\n" +
            "Anarraa baqate eessaa dhaquu keeti\n" +
            "Anu siifan Kennaa dhadhabata kooti\n" +
            "Annarra hin baqatin ati mucaa kooti\n" +
            "         Ceesisa\n" +
            "Ano siin jijjiira bar tokko seenaa kee\n" +
            "Ano naan dhaabadha dhufeetan bukke kee\n" +
            "Nan dhadhabee jette abdii hin kutatinii\n" +
            "Anu siin jabeessaa hooma hin yaada'inii\n" +
            "      Ceesisa\n" +
            "Biyyii lafa kuni isheen ni dabarti\n" +
            "Tolchiti naqaphuu ani dahoo keeti\n" +
            "Maalumaaf raafamta maaloo yaa mucaa koo\n" +
            "Ba'aa kee ulfaate fidaadhuu gara koo\n" +
            "       Ceesisa\n" +
            "Dandiin ishee qaloodha bayyee itti dhiphatti\n" +
            "Bakkee boqonnaatti qabadhu dandiitti\n" +
            "Kootu sii gameera gali gara Abbaa kee\n" +
            "Ano siin qulleessa dhiqeetan cubbuu kee\n";

    String title = " Lakki yaa mucaa koo maalif naa baqataa ";

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