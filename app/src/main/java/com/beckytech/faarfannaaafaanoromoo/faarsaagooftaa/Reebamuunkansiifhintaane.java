package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Reebamuunkansiifhintaane extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Reebamuun kan siif hin taane gooftaa ni reebamte\n" +
            "Madaa'uun kan siif hin mallee gooftaa ni madoofte\n" +
            "Jaalala keenyaf waan hedduu taatee\n" +
            "Hoolicha dhugaa ati nuuf qalamtee\n" +
            "Ceesisa\n" +
            "Fannoo muka jiidhaa ati qofa kee baate\n" +
            "Goonfoo qoraaticha mataatti godhatee\n" +
            "Mirga abbaa keeti samii irraa buutee\n" +
            "Nuu jiraachisuf ofi kee duutee\n" +
            "       ceesisa\n" +
            "Kan sii waaqessinuu waaqummaa kee barre\n" +
            "Fannoo kee batanne sii faana hiriiree\n" +
            "Waaqni sii qofa kan waaqeessinuu\n" +
            "Bara jiraata kan siin jajaanjuu\n" +
            "         ceesisa\n" +
            "Garbuummaa hadhaa ati nurra diigdee\n" +
            "Cabaa dhagna keenya ati nuuf dhidhibdee\n" +
            "Hooma hin sodaannu sii faana baanee\n" +
            "Gargaarsa keetin humna argannee\n";

    String title = " Reebamuun kan siif hin taane gooftaa ni reebamte ";

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