package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class QorichaFoonKeenya extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Qoricha foon keenya\n" +
            "Haadha lubbuu keenya\n" +
            "Maariyam( 2) Burqitu jireenya\n" +
            "Maariyam (2) haadha uuma keenya\n" +
            "          Ceesisa\n" +
            "Haadho ergamoota giiftii qulqulloota\n" +
            "Waa'ee cubbuu keenyaaf nuf kadhadhu Gooftaa\n" +
            "Nuu dagatain maariyam nuto sitti boonya\n" +
            "Kadhanna keen durbee bakka yaadne geenya\n" +
            "       Ceesisa\n" +
            "Durboota hunda kessa ati kan eebbifamte\n" +
            "Gammadi yaa maariyaam kennaan kan guutamte\n" +
            "Umaa samiif dachee garaa keeti baattee\n" +
            "Fayyina namootaf sababa kan taatee\n" +
            "        Ceesisa\n" +
            "Ergamoonni sami si galateeffatu\n" +
            "Qulqulleetti jechuun maqaa kee faarfatu\n" +
            "Nuti si faarfarsina waadaa fayyinaati\n" +
            "Kennaa faannoo jala kan nama hundamati\n" +
            "             Ceesisa\n" +
            "Haadha saba hunda durbee maariyaamii\n" +
            "Ayyaana qabeettii Giiftii aariyaamii\n" +
            "Galata keef kaane nuto ni dhaabanna\n" +
            "Ati nuuf kadhadhu maariyaam sii waamna\n";

    String title = "Qoricha foon keenya";

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