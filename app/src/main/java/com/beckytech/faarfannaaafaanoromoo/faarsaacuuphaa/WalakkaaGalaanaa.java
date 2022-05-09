package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WalakkaaGalaanaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Gurguddoota dhiise isa bade barbaacha(2)\n" +
            "walakkaa galaanaa(4)dhaabbate walakkaa galaana\n" +
            "\n\n" +
            "Iccitii isa guddaa abbaan ifa baase\n" +
            "Ilmasaa jaallatu gooftaa nu badhaase\n" +
            "Maqaasaa sooratnee isaa ittiin bullu\n" +
            "Waaqayyo nuuf kenne Afuura Qulqulluu\n" +
            "\n\n" +
            "Ofirratti arginaan yoordaanos uumaasaa\n" +
            "Teellaatti deebi'ee mul'ise sodaasaa\n" +
            "Gooftaan hunda uume gad ofqabuudhani\n" +
            "Cuuphamuusaan kunoo nuuf bu'e nagaani\n" +
            "\n\n" +
            "Daawit mul'atasaan akkuma dubbatee\n" +
            "Arjummaan goofticha sirriitti mul'ate\n" +
            "Lafti ifaan guutes lamuu hin dukkanaa'u\n" +
            "Jira yeroo dhiphuu waaqni inni nuuf nahu\n" +
            "\n\n" +
            "Jireenyi gabrumma seexana harkaa ba'ee\n" +
            "Aangoo Iyyesuusiin har'a barbadaa'e\n" +
            "Galataaf dhaabbanne nutis dhugaa baana\n" +
            "Maqaa kiristoosiin nama ifaa taana\n\n" +
            "  F.Dn Ifaa Taklee\n";

    String title = "Walakkaa galaanaa";

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