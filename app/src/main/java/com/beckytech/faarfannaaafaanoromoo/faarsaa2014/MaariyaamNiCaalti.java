package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MaariyaamNiCaalti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Maariyaam ni caalti uumama hundurraa(2)\n" +
            "Ishee hin gubnee abiddi waaqummaasaa(2)\n\n" +
            "     Miidhagdu akka warqe urgooftu jannata\n" +
            "     Kabaja keef jechaa jilbikoo hollataa\n" +
            "     Simannan kee adda kottumee haadhako\n" +
            "     Ifa keetiin guuti bososaa godookoo\n\n" +
            "Lafa ona keessa godaanuu keen argee\n" +
            "Ati qoricha deenyaan hamileen koo mirge\n" +
            "At madda boqonna deesse naan badhaastee\n" +
            "Kanaaf uumaan gadii uumaman ol taate\n\n" +
            "     Karra ishee cufamtuu karaa bahaan arge\n" +
            "     Hisqeel dhugaa ba'aa durbee ulfinakee\n" +
            "     Tasa sirraa maqne hundumaa argeeraa\n" +
            "     Na dhabin ayyookoo at waltajjii keerraa\n\n" +
            "Dirre qabsoorratti ilmakeetiin bahee\n" +
            "Injifadheen galee diinnikoo ni qaana'ee\n" +
            "Hundeenkee hin jiguu qabata abbootakoo\n" +
            "Maariyaam(x2) jedhe hin quufu arrabnikoo\n";

    String title = "Maariyaam ni caalti";

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