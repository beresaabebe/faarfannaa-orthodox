package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Ittiqaanaugochasaalaaleetoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Itti qaana’u gochasaa laaleetoo\n" +
            "Guutuu kan na godhee iyyesuus jedhama\n" +
            "Dhugaa nan bahaa maqaasa ol kaasaa\n" +
            "Ija koo isa jamaa kan naaf ibsee isaa\n\n" +
            "Osoo nan tuffatiin samraawitii jettee\n" +
            "Bishaan jireenya jaalalan naaf laattee\n" +
            "Seenaa isaa taree sechi hin xuraa’uu\n" +
            "Mana kee iyyesuus an tasuma ba'uu\n\n" +
            "Dhagaan na waaqaruuf dinni koo qopha'e\n" +
            "Yakka koo tarreessee fulduraa na dhaabee\n" +
            "Itti murteessitee yakkii diina koo\n" +
            "Beenu nagaan gali nan jedhe gooftaan koo\n\n" +
            "Akkan si jaalluu ni beekta uumaa koo\n" +
            "Osoon sitti himin ni beekta keessa koo\n" +
            "Nan hima waa'ee maafan callisaa\n" +
            "Hoosa'ina jedhee maqaa kee fan faarsaa\n";

    String title = "Itti qaana’u gochasaa laaleetoo";

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