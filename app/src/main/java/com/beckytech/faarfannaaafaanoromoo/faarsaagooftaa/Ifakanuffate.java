package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Ifakanuffate extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Ifa kan uffate samiirra kan jiru\n" +
            "Kan akka waaqayyoo tasumaayyuu hin jiru\n" +
            "Uumama hundumaa kan uumee Gooftaanii\n" +
            "Hunduma dabarsee jiraataa baraanii\n\n" +
            "     Jechaan kan hin dhumnee waa’een arjummaa kee\n" +
            "      Ija koo naaf ibsee jaalalli Abbummaa kee\n" +
            "     Kan akka hin jiruu Gooftaa fayyisaa koo\n" +
            "      Maqaa keen faarfadhaa gaddas gaafa rakkoo\n\n" +
            "Baay’isee na dhibaa akki jaalala kee \n" +
            "Sammuu koon ol ta’ee obsuus nan dadhabee\n" +
            "Dadhabbii koo ilaaltee bara koo eebbistee \n" +
            "Jaalala kee guddaan keessa koo na guuttee\n\n" +
            "      Baay’een gaddisiisee qulqulluu  Gooftaa koo\n" +
            "      Inni  anaaf naa dhiisee balleessaa cubbuu koo\n" +
            "      Lammataayyuu hin baduu manasaatii bahee\n" +
            "     Inni anaan nan gannee ana faana tahee\n";

    String title = " Ifa kan uffate samiirra kan jiru ";

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