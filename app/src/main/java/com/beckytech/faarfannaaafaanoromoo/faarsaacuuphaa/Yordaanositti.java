package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Yordaanositti extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yordanositti nuuf cuuphameera (2)  \n" +
            "Abbaan ifa baase iccitii tokkummaa \n" +
            "Mucaan Koo kunootii Ni jaallatamaa  \n" +
            "Addaamiin booji’een Kan cabse garbummaa \n\n" +
            "Mucummaa cuuphaadhaan argamneerra\n" +
            "Arganneerra ……eeyyee (2)\n" +
            "Seexanicha……..eeyee………mo’anneerra\n" +
            "Faaruudhaafis….eeyyee… dhaabbanneerra\n" +
            " ….Halkan dukkanaa’us gooftaan nu ga’eera \n" +
            "….Irree keenya ta’ee nutis dhaabbannerra \n" +
            "….cuuphaa saa cuuphamnee diina moonee jira. \n\n" +
            "Yordanoos (2) gammadikaa (2)\n" +
            "Gammadikaa… Eeyee…… gammadi kaa\n" +
            "Mooticha kee …….eeyee……. simadhu kaa\n" +
            "Fiigichaa kee … eeyee…… Rawwadhu kaa\n" +
            "Summii tufi ……eeyee….. Faarfadhu kaa\n" +
            "….Seenaan kee haaromee dhabbadhu farfadhu\n" +
            " …Teellatti hin deebi’in gooftaa kee simadhu \n" +
            "…Maqaa Iyyasuusiin seenaa haareffadhu \n\n" +
            "Cuubbuu addamiin duuneera cuuphaa goftaatiin kaneerra\n" +
            "Du’a injifannee baaneerra waanjoon seexanaa cabera\n" +
            "Yordaanos (2) Kan carroomte \n" +
            "Kan carroomte…..eeyee……Kan carroomte \n" +
            "Dhaala gooftaa …eeyee…….kan dhabbatte\n" +
            " Raajii daawit ….eeyee …….kan raawwatte  \n" +
            "Jecha Waaqaa …….eeyee……. Kan simatte \n";

    String title = "Yordanositti nuuf cuuphameera";

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