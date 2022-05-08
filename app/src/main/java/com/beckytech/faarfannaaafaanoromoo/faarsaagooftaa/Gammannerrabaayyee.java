package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Gammannerrabaayyee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Gammannerra baayyee gammmanneerra (2)\n" +
            " Ebba isaa waaqarraas arganneerra \n\n" +
            "Dukkana kanture…Gammanneerra\n" +
            "Cubbuu dhaan qabamn…. >>\n" +
            "Ifni jireenya koo   ….……>>\n" +
            "Gara bahaa ilaalee  .……..>>\n" +
            "Iddoo aduun jirtuu   ……..>>\n" +
            "Dukkanni karaa kenyaa   ..>>\n" +
            "Ilmaan qulqullaa’e..………>>\n\n" +
            "Ati ifa keenya………….. \n" +
            "Maariyaam giftii koo……………..>>\n" +
            "Ani sin abdadha…………………..>>\n" +
            "Hanga du’a kootti…………….…...>>\n" +
            "Bara jireenya koo………………….>>\n" +
            "Boqonnaa lubbuu koo…………..…>>\n" +
            "Si’uma abdiin koo…………………>>\n" +
            "Gooftaa fayyisa koo……………….>>\n\n" +
            "Ati biyyaa gisheen  .gammanneerra\n" +
            "Yaa haadha gooftaa koo……….>>\n" +
            "Taatee kan argamte ……….>>\n" +
            "Kan ittiin kahani ………….>>\n" +
            "Nyaatanii dhugani ………….>>\n" +
            "Kan ittiin quufani …………. >>\n" +
            "Golga boqonnaa koo …….…. >>\n" +
            "Maariyaam si’uma ………..>>\n\n" +
            "Ulfaattuun giiftiikoo….gammannerra \n" +
            "Ifni biyyaa sirra……………>>\n" +
            "Balbala izqi’eel ……………>>\n" +
            "Duumessi museedha   ….…>>\n" +
            "Misiroon mooticha …….…>>\n" +
            "Baganaan daawwitii ………>>\n" +
            "Warqera kan caaltu …….…>>\n" +
            "Abdii an laattadhe….… \n" +
            "Firii garaa keettiin ……….…  \n" +
            "Jireenyaa arganne……………..…\n";

    String title = " Gammannerra baayyee gammmanneerra  ";

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