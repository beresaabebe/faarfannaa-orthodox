package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Kidanemihireet extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kidaane mihireet yaa waadaa Araaraa\n" +
            "Ani siin abdadhee gara kee dhufeeraa\n" +
            "Si wajjin jiraachuuf umurii koo guutuu\n" +
            "Harmee si filadhee Diinni na hin argatu      \n     \n" +
            "Kidaanemihireet hawwii foon koo guutuuf            \n" +
            "\"\"   yommuun kufee ka’uu\n" +
            "\"\"   huurriif bubbee ta’ee\n" +
            "\"\"   na harka bittinnaa’ee\n" +
            "\"\"  si waamee naaf dhuftee  \n" +
            "\"\"   imimmaan koo koo haqxee  \n\n" +
            " Kidaanemihreet gadda koo jijjirtee\n" +
            "       “      yoomuu dhiphina koo\n" +
            "     “       dhabee rakkachuu koo\n" +
            "     “       gammadee diinni koo\n" +
            "     “       boo’ee si waammannaan\n" +
            "     “       gaddi koos ni hafe        \n        \n" +
            "Kidaanemihreet ani sirraa fagadhee \n" +
            "\"\"     jiraachuu hin fedhu\n" +
            "\"\"    abdii mana kooti \n";

    String title = "Kidaane mihireet";

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