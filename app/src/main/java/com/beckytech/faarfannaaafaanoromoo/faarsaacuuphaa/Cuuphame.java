package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Cuuphame extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Cuuphame Gooftaan keenya \n" +
            "yordaanositti cuuphame (2)\n" +
            "\n\n" +
            "Wagga soddomatti.... Yoord. .Cuuphame\n" +
            "Harka Yohaannisin....\n" +
            "Cubbuu ilmaa namaa.....\n" +
            "Irraa qulleessufi....\n" +
            "Bittaa diinaa jalaa...\n" +
            "Bilisa baasufi.....\n" +
            "\n\n" +
            "Kan dabe qajeelchuuf.....Yord.cuuph\n" +
            "Daandiitti deebiisuuf....\n" +
            "Yakka keenya haquuf.....\n" +
            "Akka bilisoomnuuf....\n" +
            "Lubbuun dhala namaa...\n" +
            "Akka walaboomuuf.......\n" +
            "\n\n" +
            "Akka nu cuuphamnuuf.....Yod cuph\n" +
            "Maqaasaat amannee.....\n" +
            "Ofii cuuphamuudhan....\n" +
            "Nuuf kenne moo'icha.....\n" +
            "Akka nuti kufneef.....\n" +
            "Cabseera kiyyicha....\n" +
            "\n\n" +
            "Hiramuun yordaanos....Yord.cuuph\n" +
            "Furmaata akka argatu.....\n" +
            "Qooddametee turushee.....\n" +
            "Kunoo tokkoomunii....\n" +
            "Cuuphamuu isaatiin.....\n" +
            "Galaannis tokkoomte....\n" +
            "\n\n" +
            "Rajjiin dubbatamee.... Yord.Cuuph\n" +
            "Akk raawwatuufii......\n" +
            "Addaaddummaan hafe.....\n" +
            "Tokko akka taanufii....\n" +
            "Isatti amannee......\n" +
            "Akka jiraannufii.....\n";

    String title = "Cuuphame Gooftaan keenya";

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