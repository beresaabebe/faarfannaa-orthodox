package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NuufCuuphame extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ishoo kaa Gooftaan nuuf cuuphame (4)\n" +
            "Xalayaan garbummaa nurraa barnadaa'ee\n" +
            "...........\n" +
            "Balleessaa Addaamiif samiirraa gad bu'e(2)\n" +
            "Durbee keessa bulee kuno nu cuuphame\n" +
            "Ishoo kaa Gooftaan nuuf cuuphame\n" +
            "..........\n" +
            "Kuno nuuf cuuphame harka Yohaannisin(2)\n" +
            "Nuuf fayyifateeraa Gooftaan Iyyesuus\n" +
            " Ishoo kaa Gooftaan nuuf cuuphame\n" +
            ".............\n" +
            "Xalayaan garbummaa yordaanos turee(2)\n" +
            "Cuuphamu isaatiin Gooftaatu nuuf furee\n" +
            " Ishoo kaa Gooftaan nuuf cuuphame\n" +
            ".................\n" +
            "Gammadaa namootaa ililleen faarfadhaa(2)\n" +
            "Gooftaan nuuf cuuphame hiidha nu baaseraa\n" +
            " Ishoo kaa Gooftaan nuuf cuuphame\n" +
            ".......\n" +
            "Ati Yordaanos maaf sodaatta?(4)\n" +
            "Waaqayyoon simadhu maaf duubatti kaatta?\n" +
            "Duubatti deebi'in waaqa uumaa keetii(2)\n" +
            "Ofitti simadhuu nuuf cuuphamuf innii\n" +
            "Ati Yordaanos maaf sodaatta?\n" +
            ".............\n" +
            "Nuuf faaqudhaaf xalayaa garbummaa(2)\n" +
            "Samiirraa gad bu'e kuno Abbaan hundumaa\n" +
            "Ati Yordaanos maaf sodaatta?\n" +
            "........\n" +
            "Laga hundumarraa Gooftaan si filate(2)\n" +
            "Kuno nuuf cuuphame nunis fayyifate\n" +
            "Ati Yordaanos maaf sodaatta?\n" +
            "........\n" +
            "Eebbisaa baay’ate kuno nu Eebbisee(2)\n" +
            "Cuuphamu isaatiin bilisaa nu baasee\n" +
            "Ati Yordaanos maaf sodaatta?\n" +
            "...........\n" +
            "Yordaanos Yordaanosii ati yaa Yordaanosii(2)\n" +
            "Yordaanosii(2)     Eyyee\n" +
            "Dhaala Gooftaa\n" +
            "Kan waaqayyoo\n" +
            "Si filatee\n" +
            "Gooftaan kunoo\n" +
            "...............\n" +
            "Nuuf Cuuphame\n" +
            "Waaqayyoonii\n" +
            "Raajii Daawwit\n" +
            "Rawwachuufii\n" +
            "Cubbuu keenyas\n" +
            "Balleessufii\n";

    String title = "Nuuf cuuphame ";

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