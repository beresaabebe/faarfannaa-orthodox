package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WaltajjiiwwanIsaanamootaguutaman extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Waltajjiiwwan Isaa namoota guutaman\n" +
            "Ni galateeffama gooftaan ijoollee isaan\n" +
            "Isa kaleessarraa ammas ni baayanna\n" +
            "Ijoolleen waaqayyoo galataaf dhaabbanna\n\n" +
            "Mortuu fi inaaftuun kan balleessaaf kaattuu \n" +
            "Waa’ee keenyaa mitii kan ofiituu hin beektuu\n" +
            "Ajjeesaaf fayyisaan hundaa kan danda’u \n" +
            "Waaqa keenya qofa galanni isaa haa ga’u\n\n" +
            "Luboonni waaqayyoo Adaadii uffatanii\n" +
            "Ixaana urgeessuun aarsaa dhiyeessanii\n" +
            "Ummanni yoo jedhu Ameen halleeluyaa\n" +
            "Nageenyi nuuf ta’ee halkanii fi guyyaa\n\n " +
            "Manni qulqullummaa kan dur diigamanii\n" +
            "Har’a ni ijaaramu ijoollee keetini \n" +
            "Nu oolchi waaqayyoo qorumsa diinarraa\n" +
            "Si galateeffannaa baraa hanga baraa\n\n" +
            "Diinni yoo bookkise naannoo keenya marsee\n" +
            "Nus abdii godhannee eegumsa Sillaasee\n" +
            "Hiree fi carraa keenyaa mana isaa jiraachuun\n" +
            "Galatoomi gooftaa yeroo hundaa jechuun\n";

    String title = " Waltajjiiwwan Isaa namoota guutaman ";

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