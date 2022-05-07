package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WaaqummaaKee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waaqummaa kee Addunyaaf nan hima\n" +
            "Ulfina maqaa keef nan uggumaa\n" +
            "Guddinni kee saba keen himama\n" +
            "\n\n" +
            "Museen si kadhate ulfina kee baru\n" +
            "Saba waliin jiru du'arraa baraaru\n" +
            "Fuula kee arganne dubee kee mul'iste\n" +
            "Ifa calaqqeedhan waaqummaa kee ibsite\n" +
            "\n\n" +
            "Maqaa kee inni waamu deebii nii argata\n" +
            "Kan waa’ee kee jaju kabaja fudhata\n" +
            "Daawwiti faarfate baganaa qabatee\n" +
            "Kennaa kennaa caalu si bira argate\n" +
            "\n\n" +
            "Moototni Addunyaa waa’eesaa ni himu\n" +
            "Ulfina kee dhoksuun kansaanin madaalu\n" +
            "Kee gita hin qabu kan hundumaan oli\n" +
            "Kanaaf si jajadha baruma baraani\n" +
            "\n\n" +
            "Kan gara koo gore sis yoo ta'u baate\n" +
            "Bakka dhiphuu kootti dinni koo na nyaate\n" +
            "Qooqa ati naaf laatte maqaa keen faarfadha\n" +
            "Yeedaloo Yareediin waa’ee keen dubbadha\n";

    String title = "Waaqummaa kee";

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