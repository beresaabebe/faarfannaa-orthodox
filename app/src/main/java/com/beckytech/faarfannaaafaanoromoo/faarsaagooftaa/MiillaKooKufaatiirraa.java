package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MiillaKooKufaatiirraa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Miilla koo kufaatiirraa lubbuu koos du'arraa(2)\n" +
            "Waaqni qaraaniyoo anaan fayyiseeraa\n" +
            "Ani duneeammayyuu jira\n\n" +
            "Hundumtuu dhufanii warri na gaadanii\n" +
            "Waliin dudubbatu du'eera jedhanii\n" +
            "Alazaar nan jedhe waaqni koo na waamee\n" +
            "Boolli awwala koos duwwasat cufamee\n\n" +
            "Waggaa bara baayyee dhukkubsachaan turee\n" +
            "Dhiphuun koos baayyateeittin oole bulee\n" +
            "Hin fayyu jedhanii diinan murteeffamee\n" +
            "Waaqni murtii diigee anaaf fannifamee\n\n" +
            "Waaqni narraa haqee imimmaan ija koo\n" +
            "Kan darbee ni gahaa barri bo’icha koo\n" +
            "Ka'i deemi nan jedhe badhadhe siree koo\n" +
            "Diinota qaneessee jijjiiree seenaa koo\n\n" +
            "Falasaas dhabanii waa'ee dhiphuu kootii\n" +
            "Baayyees ni gaddanii firoonni koo martii\n" +
            "Dhagaheetan bahee fayyina harka kee\n" +
            "Nyaadhee dhugeen fayyee fooniif dhiiga kee\n\n" +
            "Dn f/taa fayyisaa yaadataa\n";

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