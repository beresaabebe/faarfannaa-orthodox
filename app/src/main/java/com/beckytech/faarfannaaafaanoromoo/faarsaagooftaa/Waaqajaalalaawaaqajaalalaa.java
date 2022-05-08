package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Waaqajaalalaawaaqajaalalaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waaqa jaalalaa waaqa jaalalaa\n" +
            "Bakkalchaa biriiti mana galgalaa\n" +
            "Ati nuuf tatettaa hirkoof gaddisaa\n" +
            "Iyyasuus si'iin banee bilisaaa\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Angoo dukkanaa nurraa rukuttee\n" +
            "Barii fayyinaa nuuf barisiftee\n" +
            "Birmadummattii jiradhaa jettee\n" +
            "Iyyasuus  ati abbaa nuuf taate\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Dukkanaa irrattii ifa isaan dulee\n" +
            "Wanjoo gabrummaa fannosan lolee\n" +
            "Dinarraa ejjatee kan mirgaan galee\n" +
            "Nuti hin arginee goftaa simaalee\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Jaalalaa dhugaa kan waregamaa\n" +
            "Homaa hin sodatuu achittii ademaa\n" +
            "Mootin yihudaa jagnii ganamaa\n" +
            "Ilmii waqayyooti innii iyyasuus sumaa\n" +
            ";;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
            "Motummaa dinaa aboodhan cabsee\n" +
            "mandaraa isaani digetuu honsee\n" +
            "mataa jawwichaa goftaan buruqsee\n" +
            "Nuyii ijollesaa bilisaa basee\n";

    String title = "Waaqa jaalalaa waaqa jaalalaa ";

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