package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NuuAraarsi extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nuu Aararsi maaloo yaa Maariyamii /2/\n" +
            "Foon kootiniis dadhabeera ani           \n\n" +
            "Gaarii Kan hojjete’’’yaa Maariyamii\n" +
            "Mirgake dhabbatee…..’’’\n" +
            "Anis dadhabaadha…..’’’\n" +
            "            Akkam na gootaree….’’’             \n\n" +
            "Yaa Maariyaam yoon jedhu \n" +
            "Ani yeroo hundaa \n" +
            "Sumatti maxxane\n" +
            "Nan ba’a Rakkina      ’’\n\n" +
            "Maqaa ke bareeda……’’’\n" +
            "Dammarra mi’aawwaa….’’’\n" +
            "Bakkan deemetille …..’’’\n" +
            "Naaf sirra’a karaan…..’’’\n\n" +
            "Farfadheen si waama….’’’ \n" +
            "Faarfanna Yaarediin…..’’’\n" +
            " Waadaa anaf galee……’’’\n" +
            " Hadhaa Gooftaa koyii….’’’\n";

    String title = "Nu araarsi";

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