package com.beckytech.faarfannaaafaanoromoo.sadaniin2010;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HaadhaWaaqaKootii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Haadha waaqa kootii fayyistuu lubbuu koo\n" +
            "Kidaanemireeti sii  anaaf  haatii koo\n" +
            "Kanaaf si waammadhaa yaa kakuu Araaraa\n" +
            "Halkaniifi guyyaa maqaa kee nan waamaa\n\n" +
            "KIDAANEMIHRET Dhiphinni baay’atee\n" +
            "               “           biyya lafarratti\n" +
            "               “          Jaalalaa fi Amantii\n" +
            "               “         nuuf kadhadhu atii\n" +
            "              “         Dafiitii nuu koottuu\n" +
            "             “        osoo nuti hin laafiin\n\n" +
            "KIDAANEMIHREET Biyya lafarrattii \n" +
            "          “           rakkinni cimuyyuu\n" +
            "           “          Osoo si'iin qabnuu\n" +
            "           “          homma hin shakkinuu\n" +
            "           “          Galaana ibiddaa \n" +
            "            “         si'iitiin ceenerraa\n\n" +
            "KIDAANEMIHRET  Gara lafeetti koo\n" +
            "          “           haadha gaafa rakkoo\n" +
            "           “          Kanaan abdii kute\n" +
            "          “           fayyiste lubbuu koo\n" +
            "          “           Maqaa Keenan darbee\n" +
            "          “           rakkoo jireenya koo\n\n" +
            "KIDAANEMIHREET Kanarra hin rakkannu\n" +
            "              “         galaa sii godhannee\n" +
            "               “       Teellaati hin deebinu\n" +
            "               “       erga siin argannee\n" +
            "               “       Hundumaa ni ceena\n" +
            "                “      maqaa kee waammannee\n";

    String title = "HaadhaWaaqaKootii";

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