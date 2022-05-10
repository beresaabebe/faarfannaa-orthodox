package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AdoonayiiAtiWaqaaJirataa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Adoonayii Ati Waqaa Jirataa\n" +
            "Gochaa kee addaa goftaa goftotaa\n" +
            "Ati nu fayyisuuf fannorraa oltee\n" +
            "Gaddisaa bannee situu nuf latee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Hoolichii dhugaa dursaan lubootaa\n" +
            "Sidhaam yaa goftaa abban abbotaa\n" +
            "Cubbuu koof jettee waranamtettaa\n" +
            "Gidiraan hunduu sin naf salphataa\n" +
            ";;;;;;;;;;;;;::::::::::;;;;;;::;\n" +
            "Eyesus goftaa leencaa yihudaa\n" +
            "Garaa lafessaa hundumaaf gaddaa\n" +
            "Galaan siha marsuu ariyamittii\n" +
            "Situu nu baase afaan dinaatti\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Goftaan umaan koo hundumaa beeka\n" +
            "Wamamuu koofis qabam akeekaa\n" +
            "Nanii tufannee cubbuu koo ilalee\n" +
            "Anaan ebbisuuf manaa koo galee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Qaraniyooti fannorraa oltee\n" +
            "Guyyaa jimataa dhigaan nu bittee\n" +
            "Nuu boji'eeraa jaalallii kan kee\n" +
            "Yomuu dagannuu goftaa olmaa kee\n";

    String title = "Adoonayii Ati Waqaa Jirataa";

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