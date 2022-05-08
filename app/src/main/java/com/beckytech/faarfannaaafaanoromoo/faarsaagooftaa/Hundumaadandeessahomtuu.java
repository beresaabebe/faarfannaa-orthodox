package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Hundumaadandeessahomtuu extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Hundumaa dandeessa homtuu hinjiruu kan ati dadhabduu\n" +
            "Waaqa hiyeessotaa gargaaraa rakkataa\n" +
            "Suma kadhanna /2/ yeroo hundumaa\n" +
            "………………………………………..\n" +
            "Hirkoo hiyyessotaa abdi kan namootaa\n" +
            "Kan dandessuu hunduumaa kan kufee ni kaastaa\n" +
            "Cubbuun osoo hin badin nu gargaari gooftaa\n" +
            "......................................\n" +
            "Addam yeroo yakke jannataa ari’ame\n" +
            "Boyee  sikadhatee ijoollummaa dhabee\n" +
            "Ni fayyita jettee fannoo dhaan fayyiiste\n" +
            "Waaqa qulqullootaa nun hin irraaffatini\n" +
            "……………………….\n" +
            "Saba israa’eelii far’oon yemmuu bulchetti\n" +
            "Rakkoo fi dhiphina yeroo itti cimsetti\n" +
            "Boyicha raaheeliin musee ergiteef ati\n" +
            "…………………………..\n" +
            "Nutis ijoolleen kee garakeetti iyyinaa\n" +
            "Akka nu baastuuf rakkoo fi dhiphiina\n" +
            "Gargaaran rakkataa gooftaan sumaan waammanna\n";

    String title = " Haa galateeffanu Waaqayyoni ";

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