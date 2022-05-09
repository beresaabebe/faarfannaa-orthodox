package com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class CuuphameJira extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Cuuphame jira Gooftaan Cuuphameera... (2)\n" +
            "Cuuphame jira(2).......\n" +
            "....... Waggaa soddomaffatti.......\n" +
            "....... Laga yordaanositti.......\n" +
            "....... Gooftaan cuuphameera.......\n" +
            "....... Harka Yohaannisiitti.......\n" +
            "....... Mataasaa gad qabuun.......\n" +
            "....... Walakkaa galaanatti .......\n" +
            "....... Hundumaa kan uume.......\n" +
            "....... Harka Garbichasaatti.......\n" +
            "...................................\n" +
            "....... Lagni Yordannoosi.......\n" +
            "....... Teellaatti dheessite.......\n" +
            "....... Waaqummaan Kiristoos.......\n" +
            "....... Na danfisa jettee .......\n" +
            "....... Yooriif Daanoos turte .......\n" +
            "....... Cuuphaasaan tokkomte.......\n" +
            "....... Nuufis cuuphaa saatiin......\n" +
            "....... Tokkummaan argamte.......\n" +
            "...................................\n" +
            "....... Gooftaan yoo cuuphamu.......\n" +
            "....... Iccitiin labsame.......\n" +
            "....... Sadummaaf tokkummaan.......\n" +
            "....... Hundaatti ibsame .......\n" +
            "....... Afuurri qulqulluun.......\n" +
            "....... Bu'e bifa Gugeen .......\n" +
            "....... Abbaaniis dubbate.......\n" +
            "....... Ilma koo jechuunii.......\n" +
            "............................\n" +
            ".......Garbummaa balleessuuf.......\n" +
            "....... Seexanni kan barreesse.......\n" +
            "....... Xalayaa barootaa .......\n" +
            "....... Addaam mallateesse.......\n" +
            "....... Cuuphamuu isaatiin .......\n" +
            "";

    String title = "Cuuphame jira Gooftaan Cuuphameera";

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