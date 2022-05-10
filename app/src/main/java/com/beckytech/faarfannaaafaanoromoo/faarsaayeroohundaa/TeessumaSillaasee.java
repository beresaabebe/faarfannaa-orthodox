package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class TeessumaSillaasee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Teessuma Sillaasee qulqulloonni marsanii\n" +
            "Kiruubel dumeessanii teessosaa baatanii\n" +
            "Durbeen giddusaanii Mikaa'el fuulduraanii\n" +
            "Ergamoonni hedduun yemmuu sagadanii\n" +
            "Kottaati ilaalaa miidhagina isaanii\n" +
            "Kottaati ilaala abbaa isa samiirraa\n\n" +
            "Teessuma Sillaasee qulqulloonni marsanii\n" +
            "Ergamoonni samii yommuu faarfatanii\n" +
            "Luboonni samiirraa qulqulluu(x3) jedhanii\n" +
            "Jaalala addaa kana arguuf milka'anii\n" +
            "Hojii dhugaatiin miidhaganii argamuu\n" +
            "Hojii gaariitinis miidhaganii argamuu\n\n" +
            "Tokkummaa qulqullootaa biyya qulqullotaa\n" +
            "Galataan jiraatu ulfina waaqayyoof\n" +
            "Dhugaaf tolummaadhaan sabisaa guutamee\n" +
            "Waaqni nu haa gargaaru guyyaa dhufaatiisaa(x2)\n";

    String title = "Teessuma Sillaaseee ";

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