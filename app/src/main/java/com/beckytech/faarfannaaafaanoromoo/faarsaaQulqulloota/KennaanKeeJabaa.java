package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KennaanKeeJabaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ulfinni kee kennaan kee jabaa \n" +
            "Simboo keetu harka nu qaba\n" +
            "Gooticha abbaa amantii\n" +
            "Taklee haymaanooti nuuf kootu ati\n" +
            "           Ceesisa\n" +
            "Biyyaa lafarraa kan adda baate\n" +
            "Waaqayyoo keetif kan kaadhimamte\n" +
            "Biyyaa keenyaf ati har'a kennaadha\n" +
            "Ajaa’iba keetu nuuf ragaadha\n" +
            "         Ceesisa\n" +
            "Kabaja waaqatu sii badhaase\n" +
            "Eebba kee hunda keenyaf facaasee\n" +
            "Mana kee jiraannaa nus kanaaf\n" +
            "Kakuun kee har'as humna qabaf\n" +
            "         Ceesisa\n" +
            "Kadhaa keetin nuti har'a geenyerraa\n" +
            "Barumsaa amantaa sirraa barreerraa\n" +
            "Inni ati nuf kadhattee waaqa biraa\n" +
            "Har'as nu eega nu faana jiraa\n" +
            "         Ceesisa\n" +
            "Nutis jabaanne akka dhaabannuf\n" +
            "Amantii guutuun akka jiraannuuf\n" +
            "Harka keenya nuuf qabi abbaa keenya\n" +
            "Si'in si ilaallee jabaannee teenya\n";

    String title = "Ulfinni kee kennaan kee jabaa";

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