package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NamootaHaaDeemnuuManaWaaqaKeenya extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Namoota haa deemnuu mana waaqa keenya\n" +
            "Bakka itti argannu nagaa lubbuu keenya\n" +
            "Cubbuu irra fagannee qophofnee haa jiraannu\n" +
            "Jecha isaa dhageenye qalbii haa jijjirannu\n" +
            "\n\n" +
            "Nuti kan amannee bakka itti faarfannu\n" +
            "Rakkina keenyas iddoo itti himannu\n" +
            "Galata waaqayyoo kan itti galfannu\n" +
            "Mana waaqayyooti kan jiraatu yoomiyyu\n" +
            "\n\n" +
            "Fuldura kakuu isaa sodaadhaan dhabbanna\n" +
            "Akka saba israa’el ilill ilill jenna\n" +
            "Mana isaa keessatti inni nu haa mil’atu\n" +
            "Jennee haa kadhannu gooftaan nu haa filatu\n" +
            "\n\n" +
            "Kufanii ka’uunis haammam yoo baay’ate\n" +
            "Mana isaa jiraachuuf gooftaan nu filate\n" +
            "Qormaatas dandeenye jabaanne haa dhaabbannu\n" +
            "Mootumma waaqayyoo abdii haa godhannu\n";

    String title = " Namoota haa deemnuu mana waaqa keenya ";

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