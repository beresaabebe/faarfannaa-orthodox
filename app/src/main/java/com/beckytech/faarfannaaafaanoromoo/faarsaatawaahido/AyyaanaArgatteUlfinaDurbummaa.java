package com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AyyaanaArgatteUlfinaDurbummaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ati yaa haadha dhugaa (2*) \n" +
            "Ayyaana argatte ulfina durbummaa \n" +
            "Maariyaam sif bu’e afuurri Abbas \n\n" +
            "Gaara giisheenirraa yaa haadha dhugaa\n" +
            "Ulfinaan teessetta \t“\t“\n" +
            "Eebba isa guddaa\n" +
            "Harka keen qabdeettaa\n" +
            "Nuti siif sagadna\n" +
            "Kabaja ulfina\n" +
            "Maariyaam giiftii keenyaa\n" +
            "Hedduu si jaallannaa\n\n" +
            "Cimaadha gaarrisaa\n" +
            "Fagoodha deemsikoo\n" +
            "Naaf kadhu ilmakee\n" +
            "Iyyesuus uumaakoo\n" +
            "Akka abaaboo birraa\n" +
            "Mul' adhe akka him badne\n" +
            "Cinakoo dhaabbadhu\n" +
            "Raawwadhe akka hin kufne\n\n" +
            "Adaaraa maariyaamii\n" +
            "Naan dhufaa manakee \n" +
            "Nasimadhu adaaraa \n" +
            "Harmeekoo mucaa kee \n" +
            "Yaadannoo ilmakee \n" +
            "Qabadhee fannoosaa \n" +
            "Hin qaana' u anoo\n" +
            "Ililcheen si faarsaa \n\n" +
            "Yoomuu si dagadhu\n" +
            "Maamilakoo ganamaa\n" +
            "Yaadannookoo durii\n" +
            "Abdiikoo fayyinaa\n" +
            "Na keessa jirawoo\n" +
            "Dhiigni ilmakee foonsaa\n" +
            "Kanaaf si jaallanna\n" +
            "Waan taatef haadhasaa\n";

    String title = "Ayyaana Argatte Ulfina Durbummaa ";

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