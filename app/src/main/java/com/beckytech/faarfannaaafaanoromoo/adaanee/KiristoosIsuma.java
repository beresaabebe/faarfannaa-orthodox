package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class KiristoosIsuma extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kalees har'as kiristoos isumaa\n" +
            "Hin jijjirramu innoo gonkuma\n" +
            "Barumsaa adda ta'en hin raafamina\n" +
            "Jecha yeeyyotatin hin sossobaminaa\n\n" +
            "Baayyeen ni ka'u an maasiidha jechaa\n" +
            "Sobaan uffatanii raroo hoolichaa\n" +
            "Namoota heddu ni dogongorsuu\n" +
            "Hafuura shakkii itti fachaasuu\n\n" +
            "Hin Simatinaa Barumsa ormaa\n" +
            "Iyyesuus kiristoos yoomuu isumaa(2)\n\n" +
            "Kuno asin jira kiristoos jechuunii\n" +
            "Raajonni dharaa Dhugaa dabsanii\n" +
            "Gooftaa Gooftaa jedhu hidhii isaanitinii\n" +
            "Waaqumma iyyesuus gane lapheen isaanii\n\n" +
            "Mallattoo gurguddaa dinqiis hojjetuu\n" +
            "Kayyoo bineensichaaf bitamuun dhaabbatu\n" +
            "Sobatti firoomuu dhugaarra maqanii\n" +
            "Akka fedha isaanitti wangeela hiikanii\n\n" +
            "Kun hundumtu ciniinsuu duraatii\n" +
            "Dhumni saa hin geenye jala Bultii isaatii\n" +
            "Obsee inni eeggatee daandii jalqabaatti\n" +
            "Gonfoo badhaafamaa mooticha duratti\n\n" +
            "Namni jabaatee hamma dhumaatti\n" +
            "Gammachuun galaa iyyerusalemitti \n" +
            "Gammachuun galaa biyya ishee haaratti\n";

    String title = "Kiristoos isumaa";

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