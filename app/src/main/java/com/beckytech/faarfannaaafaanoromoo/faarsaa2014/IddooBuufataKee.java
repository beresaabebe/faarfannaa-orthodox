package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class IddooBuufataKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Iddoo buufata kee sodaadhanan dhufa\n" +
            "Dhaga’i kadhannaa koo yaa Waaqa siif ifa\n" +
            "Iddoo aarsaa keetii yemmuun jilbiiffadhu\n" +
            "Biyyoo saan arraaba Gooftaa na mil'adhu \n\n" +
            "      Ganama sursuraa akkuma sinbiraa\n" +
            "      Ganamasoo barii nan dhufaa sibira\n" +
            "      Yaa Waaqa raajotaa na mil'adhu anani\n" +
            "      Jireenyi hin argamu sirraa fagaannani \n\n" +
            "Foolii ixaanaa kee yemmuu itti aarsani\n" +
            "Foonii fi dhiiga kee yemmuu dhiyeessani\n" +
            "Namoonni sodaadhan yemmuu fudhatanii\n" +
            "Boo’ichat na qaba ittiin dhaabbatanii \n\n" +
            "      Dhaadannoo koo jabaa kanan ittin boonu\n" +
            "      Ililleen na guuta galma kee yoon seenu\n" +
            "      Oolmaa keetan hima qooqa koo olkaasee\n" +
            "      Sagadeen faarfadha weedduun si leellisee\n";

    String title = "Iddoo buufata kee";

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