package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NanCarroome extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nan carromee nan duromee\n" +
            "Tawahidoo kessattin umamee\n" +
            "Amantaa dhugaan ishii filamtee\n" +
            "Dhigaa waaqayyoon bu’uureffamte x2\n\n" +
            "Mucuumman sillasee sin kennamee\n" +
            "Fayyinnii lubbu sii keessa argame\n" +
            "Badhaasa kenyaa kannuraan badnee\n" +
            "Suurratin taanee si’iin cuphamee x2\n\n" +
            "Dhalootan mitii kiristosin malee\n" +
            "Hundeffamnii ishee dhigaa isaatin malee\n" +
            "Qabsoo guddadhan nullee nu gessee\n" +
            "Abbotaa darbaa ofwarregamsisee x2\n\n" +
            "Bay’ee gonfamte kennaan kee adda\n" +
            "Wareegamtotaaf tolootas qabda\n" +
            "Qulqulluu giyorgis arsemaa ilaalee\n" +
            "asumaa hin shakkuu ittan caala maleex2\n\n" +
            "Maliif warrii shakkitonii gowwomtuu\n" +
            "Tawaahidodhaan ha badduu jettuu\n" +
            "Muka abban dhabee ilmii guddisee\n" +
            "Afuura qulqulluun dursee nuuf  ibsee x2\n";

    String title = "Nan carromee nan duromee";

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