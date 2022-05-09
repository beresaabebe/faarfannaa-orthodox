package com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BagaGammadanii extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Baga gammadanii misiroon lachuu\n" +
            "Umurii keessan Waaqayyoo haa bubulchuu\n" +
            "Gaa’iili keessan baay’ee miidhageerra\n" +
            "Waaqayyoo Gooftan isin eebbiseerraa\n\n" +
            "Biyya lafaa keessaa  Misirroon Lachuu\n" +
            "Waaqni isin fo’atee       >>              >>\n" +
            "Giiftiin Maariyaamiis     >>              >>\n" +
            "Dhuftee isin eebbistee   >>             >>\n" +
            "Isin gidduu  argamtee araarsituu taatee\n\n" +
            "Mana Dookimasfaa Misirroon Lachuu\n" +
            "Akkuma eebbisee       >>               >>\n" +
            "Isin haa eebbisuu        >>               >>\n" +
            "Harka isaa diriirsee     >>               >>\n" +
            "Leeyyoorraa isin oolche isin gammachiisee\n\n" +
            "Qilleensa baraatiin Misirrooni Lachuu\n" +
            "Akka hin dogogorre   >>                  >>\n" +
            "Barsiisa sobaatiin        >>                 >>\n" +
            "Akka hin gitintirre      >>                  >>\n" +
            "Goocha Waaqa keessanii hin iraanfattuurree\n\n" +
            "Addaamis qofaasaa  Misirron Lachuu\n" +
            "Jiraachuun  hin ta’uufi  >>            >>\n" +
            "Waaqayyoo  Gooftaan   >>            >>\n" +
            "Jedheetu dubbateefi   >>             >>\n" +
            "Cinaacha isaa keessaa gargaartuu uumeef\n\n" +
            "Isiin haa eebbisuu  Misirroon Lachuu\n" +
            "Akka Abirihaamfaa  >>                 >>\n" +
            "Akka yisihaaqifaa    >>                  >>\n" +
            "AkkumaYaahiqoobifaa akkuma Museefaa\n";

    String title = "Baga gammadanii misiroon lachuu";

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