package com.beckytech.faarfannaaafaanoromoo.lameen2011;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QulqulleettiArseema extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qulqulleetti Arseemaa yaa haadha Amantaa\n" +
            "Situ qabaatee daandii qulqullootaa (2)\n" +
            "           Ceesisa\n\n" +
            "Qulqulleetti Arseemaa wareegamtuu dhugaa \n" +
            "      \"\"                  \"\"        jabaatte dhaabbaate\n" +
            "      \"\"                  \"\"      daandii ishee dhugaa \n" +
            "      \"\"                  \"\"      dhugumaan jaallatte\n" +
            "      \"\"                  \"\"      Amantii ishee dhugaan\n" +
            "      \"\"                  \"\"      Orotodooksii jette\n" +
            "Du'aa Miti kan kee wareegamummadha\n" +
            "Daandii ishee dhugaaf ati gargaartudha\n" +
            "           Ceesisa\n\n" +
            "Qulqulleeti Arseema Amantaa ishee Dhugaa\n" +
            "      \"\"                  \"\"      situ baballisee\n" +
            "      \"\"                  \"\"      Biyya Armaaniyatti\n" +
            "      \"\"                  \"\"      situ barsiisee\n" +
            "      \"\"                  \"\"      mootichi biyyichas\n" +
            "      \"\"                  \"\"      si ajjeechisisee\n" +
            "Du'aa Miti kan kee wareegamummadha\n" +
            "Daandii ishee dhugaaf ati gargaartudha\n" +
            "           Ceesisa\n\n" +
            "Qulqulleeti Arseema mooti Armaaniyaa\n" +
            "      \"\"                  \"\"      situ qaneessee\n" +
            "      \"\"                  \"\"      bareedinni Addunyaa\n" +
            "      \"\"                  \"\"      fayyidaa akka qabne \n" +
            "      \"\"                  \"\"      Ajaja Fayyisaa\n" +
            "      \"\"                  \"\"      Situ hubachiise\n" +
            "Fayyina Addunyaa Gooftarraa kadhatte\n" +
            "Hara'as waadaa keetiin Addunyaa fayyiste\n" +
            "           Ceesisa\n\n" +
            "Qulqulleeti Arseema wala'ansoo moototaa\n" +
            "      \"\"                  \"\"      sumatu moo'ate\n" +
            "      \"\"                  \"\"      Dirxaadis qana'ee\n" +
            "      \"\"                  \"\"      Waa'ee kee hubate\n" +
            "      \"\"                  \"\"      laphee hin hubanne\n" +
            "      \"\"                  \"\"      Ati hubachistee\n" +
            "Fayyina Addunyaa Gooftarraa kadhatte\n" +
            "Hara'as waadaa keetiin Addunyaa fayyiste\n\n" +
            "     F/ta Dn Abarraa Baqqalaa\n";

    String title = "Qulqulleetti arseema";

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