package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AlaabanKeeIsa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Nagaan biyya keenyaf \n" +
            "Nagaan Itiyoophiyaadhaf\n" +
            "Nuuf haa ergu(3) Waaqayyoo Abbaa keenya\n" +
            "\uD83C\uDFF3\uD83C\uDFF4\uD83D\uDEA9\n\n" +
            "Harka ishee Waaqayyootti isheen kan ol kaaste\n" +
            "Abdii ishee hundumaa isa taasifatte\n" +
            "Cimte dhaabbachuun waaqayyoo waammatti\n" +
            "Soomaaf sagadudhaan uumaa shee kadhatti\n" +
            "\uD83D\uDEA9\n\n" +
            "Biyyaa Abboota keenya biyya Qulqulloota\n" +
            "Dachee Qulqulleetti kan Wareegamtoota\n" +
            "Biyya Taklahaymanoot kan Abbaa Pheexiroos\n" +
            "Eebbise si uumee Gooftaa Iyyesuus\n" +
            "\uD83C\uDFF4\n\n" +
            "Biyya waadaa taate Dubroo Maariyaamiif\n" +
            "Waaqayyoo siif laate haadha isaa si'ifii\n" +
            "Kadhanna maariyaamiin Ati ni jiraatta\n" +
            "Hundaa ol ifteetoo Kabajaan mul'atta\n" +
            "\uD83C\uDFF3\n\n" +
            "Fannoo saa qabadhu Alaabaan kee isa\n" +
            "Addunyaa irratti inni si mul'isa\n" +
            "Dhufaatii waaqayyoof Ati of qopheessi\n" +
            "Itiyoophiya harka Waaqayyootti ol kaasi\n" +
            "✝\uD83C\uDF39✝\n\n";

    String title = "Alaabaan Kee Isa";

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