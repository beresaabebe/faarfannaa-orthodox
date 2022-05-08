package com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KadhatanBaasiliyoosi extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kadhatan baasiliyoosi fi gorgooriyosi \n" +
            "Fuldura fakkii qulqulluu marqooriyosii /2/\n" +
            "Gadi jedhe fakkiin /2/ kan marqooriyosii \n" +
            "Akka waan awwaatuu gammadani baasiliyoosii fi gorgooriyoosii /2/\n\n" +
            "ጸለዩ ባስልዮስ ወጎርጎርዮስ ሀበ ስዕሉ ለቅዱስ መርቆርዮስ /2/\n" +
            "ደነነ ሥዕል/2/ዘመርቆርዮስ ከመ ኦሆ ዘይብል ወተፈስሑ ባስልዮስ ወጎርገርዮስ /2/\n";

    String title = "Kadhatan baasiliyoosi fi gorgooriyosi";

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