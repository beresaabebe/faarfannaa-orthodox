package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class OolmaanKeeYaaGiiftii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Oolmaan kee yaa giiftii fuula kee na dhaabe\n" +
            "Bakkan tuffatamee situ harka na qabee\n" +
            "Naaf si duwwatu beeka iddoon turee haadha koo\n" +
            "Kanaaf jaalallikee na nyaate garaa koo\n\n" +
            "Lakkoofsa namoota keessa yeroon ba'ee\n" +
            "Tufattee na dhiisne situ haadha naaf ta'ee\n" +
            "Beela'ee dheebodhe yeroon taa'ee gadduu\n" +
            "Fakkii kee ilaaleetani kanan jajjabaadhu\n\n" +
            "Yeroo gadda kooti homtuu na hin yaadatu\n" +
            "Si qofaadha maariyaam kan na sossobatu\n" +
            "Halkan abjuu kootin guyyaa yaada kootiin\n" +
            "Na biraa hin dhabamnee yeroo hundumatti\n\n" +
            "Rakkinnis rakkinaa dhukkubnis dhukkubaa\n" +
            "Addunyaan wal furee dabareen na gubaa\n" +
            "Kana gidduu taa'ee yeroon mankaraaru\n" +
            "Haadhakoo si qofaadha firri na gargaaru\n\n" +
            "Oolmaa kee jechuudhaan dubbachuunkoo giiftii\n" +
            "Jaalaalan dirqameen malee ofiin mitii\n" +
            "Oolmaan kee narratti godaannisa ta'ee\n" +
            "Galmee laphee koorratti yaadannoodhaan taa'ee\n";

    String title = "Oolmaan kee yaa giiftii ";

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