package com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NiAmannaaAbbaattii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ni amannaa abbaatti ni amannaa ilmaattii(2)\n" +
            "Nut nii amanaa nutii nii amanaa (2)\n" +
            "Nii amanaa afuura qulqulluuti….eyyeen(3)\n\n" +
            "እናምናለን በአብ እናምናለን  (በወልድ×2) /2/\n" +
            "እናምናለን እናምናለን /2/  እናምናለን በመንፈስ ቅዱሰ \n";

    String title = "Ni amannaa abbaatti እናምናለን በአብ";

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