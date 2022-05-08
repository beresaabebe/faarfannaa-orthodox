package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaWaaqayyooNuutiSikadhannaa  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa Waaqayyoo nuuti sikadhannaa kadhannaa keenya dhaga’i/2/\n" +
            "Yeroo rakkoo keenya maqaa kee waammannaa\n" +
            "Akka nuu qaqqabduus abdiidhaan eggannaa\n" +
            "Daandii seexannarra akka nuu deebistu\n" +
            "Yaa Waaqa sii kadhannaa akka nuu fayyistuu\n\n" +
            "Jechi fi goorsi kee jireenya nuuf keenna\n" +
            "Hiirkoo nuu haa ta’u nutiis dafne kaana\n" +
            "Goofta nu simadhu harka kee ballisi\n" +
            "Dhufneera gara kee kunoo nu ebbiisi\n\n" +
            "Goorsa keetiin deemuun hundee jireenyaati\n" +
            "Seerri kee qulqulluun daandii fayyinaati\n" +
            "Toolaaf arjummaa kee gaachana godhanne\n" +
            "Ulfinaan jiraanna garbummaadha bane\n\n" +
            "Yeroo bara bara si wajjiin jiraachuuf diina harka bane\n" +
            "Diina harka baane mootummaa kee dhaaluuf\n" +
            "Qoophofnee sii eeguuf wangeela raawwanne\n" +
            "Dandeetti nu kenni yaa Waaqa sii kadhanne\n";

    String title = " Yaa namaa deebi’ii gara Waaqa keetti ";

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