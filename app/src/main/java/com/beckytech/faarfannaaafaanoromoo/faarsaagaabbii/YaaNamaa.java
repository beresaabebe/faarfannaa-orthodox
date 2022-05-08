package com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaNamaa  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa namaa/2/ dafiti deebi’i  gara Waaqa keeti /2/\n\n" +
            "Gooftaan otoo hin dhufiin qalbi jijjirradhu /2/\n" +
            "Badisaa dhufurra dafiti baqadhu /2/\n\n" +
            "Biyyi lafa kuni sobee si gooyyomsa /2/\n" +
            "Yeroof sitti tole abiddi si buusa /2/\n\n" +
            "Yakka kee dhisiti Waaqayyo kadhadhu /2/\n" +
            "Akka fayyituufi cubburra fagaadhu /2/\n\n" +
            "Fedha keetiif jette Waaqarraa fagaate /2/\n" +
            "Harkuma keetiin abidda of buuste /2/\n";

    String title = " Yaa namaa dafiti deebi’i  ";

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