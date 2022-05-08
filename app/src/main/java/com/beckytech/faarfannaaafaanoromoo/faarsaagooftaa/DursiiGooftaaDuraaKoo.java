package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DursiiGooftaaDuraaKoo  extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Dursii goftaa duraa koo\n" +
            "Amanu'eel waqaa koo \n" +
            "Umaa koo umaa koo\n" +
            "        !!!!!Eyyeeee!!!!\n" +
            "Dursii atii duraa koo(×4)\n" +
            "Goftaa iyyasuus ha qana'uu dinnii koo\n" +
            "        !!!!Eyyeee(×3)!!!!\n" +
            ";;;;;;;;;;;;;;;;;:::::::;;;;;\n" +
            "Sootrosaa biqiilaa\n" +
            "mariyaam giftidhaa giftidhaa\n" +
            "      !!!!Eyyeee!!!!!\n" +
            "Gannatnii cufamnaan sababa hewanin\n" +
            "kunoo nuuf banamee durboo mariyaamiin\n" +
            "Eyyeenii giftii mariyaamiin\n" +
            "     !!!!Eyyeeee(×3)!!!!\n" +
            ";;;;;;;;;;;;;;;;;:::::::;;;;;\n" +
            "Nurraa addaa bahinii\n" +
            "Egumsaa keetinii keetinii\n" +
            "     !!!!Eyyyeee!!!!\n" +
            "Mika'eel(2)gargaraa dani'eel(×2)\n" +
            "Eyyeeni mu'aataa saaxna'eel\n" +
            "      !!!!!Eyyeee(×3)!!!!!\n" +
            ";;;;;;;;;;;;;;;;;:::::::;;;;;\n" +
            "Arseemaan jabaattee\n" +
            "Mooti nexxadisin moo'attee moo'attee\n" +
            "    !!!!Eyyeee!!!!\n" +
            "Kan kee aja'ibumaa qulqullettii arseemaa(×2)\n" +
            "Hin callisuu qabsuraa keen himaa\n" +
            "     !!!!Eyyee(×3)!!!!!\n";

    String title = " Dursii goftaa duraa koo ";

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