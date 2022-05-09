package com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Beeteliyeemitti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Beeteliyeemitti raajiin raawwateera\n" +
            "Dhiifamnii gooftaadha hundaa daawwateera\n" +
            "Magaalaa Dawwititti fayyisaan dhalachuunii\n" +
            "Sanyiin addam hundaa jireenya argatanii\n\n" +
            "Dalla keessa ciise akka daa'imaatti\n" +
            "Fayyisaan biyya lafaa gooftaa hundumaati\n" +
            "Yoo dhalatee iyyuu akka uumamaatti\n" +
            "Inni uumama mitii gooftaa hundumaati\n\n" +
            "Ni raajeffatanii ergamoonni arjummaasaa\n" +
            "Faarsan eegalanii waa'ee gochaa isaa\n" +
            "Nagaanis lafarratti ilmaan namootaafi\n" +
            "Galanni samirratti haa ga'uu waaqafi\n\n" +
            "Galata galchina kottaaga gooftaafi\n" +
            "Waa hedduu nuuf godhee innisoo nu'ifii\n" +
            "Haa galaeeffannuu hunduu faarfachuunii\n" +
            "Kunoo nuuf dhalatee nu fayyisuuf inni\n\n" +
            "Ulfinasaa dhoksee uffatee foon keenya\n" +
            "Kunoo nuuf dhalatee fayyisaan lubbuu keenya\n" +
            "Qulqulleessuuf jedhee cubbuurraa hunda keenya\n" +
            "Waaqarra gad bu'ee Iyyeesuus gooftaan keenya\n\n" +
            "Kottaa yaa namoota wal wajjin faarfannaa\n" +
            "Aarsa arraba keenya gooftaaf dhiyeessina\n" +
            "Isatti dhiyaachuu t'uuf hirmaattuusaa\n" +
            "Egaa har'a haa hojjennuu hojii isa gaariisaa\n";

    String title = "Beeteliyeemitti raajiin raawwateera";

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