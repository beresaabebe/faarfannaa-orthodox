package com.beckytech.faarfannaaafaanoromoo.durboomaariyaam;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class GammadiiKaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Gammadii kaa gammadii kaa yaa maariyaam gammadii kaa\n" +
            "Gammadii kaa gammadii kaa yaa maariyaam gammadii kaa\n" +
            "\n\n" +
            "Gara kee dhufee ~~~gammadii kaa\n" +
            "Gabri'eel ergamee\n" +
            "Gammadii jedhee \n" +
            "Sii galateeffatee\n" +
            "Jedhee ayyaana qabeetti\n" +
            "Dubroo qulqulletii \n\n" +
            "Gammadii kaa gammadii kaa \n" +
            "yaa maariyaam gammadii kaa\n" +
            "Qaanaa galiilattii ~~~~gammadii kaa \n" +
            "Mana cidhaattii \n" +
            "Dokkimas dhiphatee\n" +
            "Wayinin dhumatee \n" +
            "Guuteef dinqasaa \n" +
            "Laaltee hirdhina saa \n\n" +
            "Si jaalannaa si jaalannaa Maariyaam si jaalannaa\n" +
            "Si jaalannaa si jaalannaa Haadha keenya si jaalannaa\n" +
            "Sanyii nuuf haftee ~~~~Si jaalannaa \n" +
            "Fayyinaaf taate \n" +
            "Osso ati hin jirree \n" +
            "Gubanet turee \n" +
            "Kanaf sii jaalannaa \n" +
            "Lapheen sii waamna\n\n" +
            "Si jaalannaa si jaalannaa Maariyaam si jaalannaa\n" +
            "Nuuf deessee ati ~~~~Si jaalannaa \n" +
            "Haadha Waaqotaa\n" +
            "Beetelemittii \n" +
            "Mootii Moototaa \n" +
            "Kanaf sii wamnee \n" +
            "Maariyaam siin jennee \n\n" +
            "Nuuf kadhadhu nuuf kadhadhu Maariyaam nuuf kadhadhu\n" +
            "Nuuf kadhadhu nuuf kadhadhu kiristoosiin nuuf kadhadhu\n" +
            "Rakkina Dookmaas ~~nuuf kadhadhu \n" +
            "Ati kan hubattee \n" +
            "Rakkannee hardhaas \n" +
            "Yeeyyiin nu seentee \n" +
            "Haadha kadhanna \n" +
            "Maariyaam si waamna\n\n" +
            "Nuuf kadhadhu nuuf ilma keeti Maariyaam nuuf kadhadhu\n" +
            "Waadaa Fayyinaa \n" +
            "Guyyaa rakkina \n" +
            "Nuto sii waamna\n" +
            "Yeroo dhiphinaa \n" +
            "Sii qabaneerraa \n" +
            "Haadha araraa \n\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Dhiphadheen jiraa~~ Naa dagatin \n" +
            "Hin qabuu firaa \n" +
            "Sitti of kenneraa \n" +
            "Waadaa araraa \n" +
            "Hadhaa koo adaraa \n" +
            "Murtii hamaarraa \n\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Qabaadhu Eebbaa kee~~~Naa dagatin \n" +
            "Seenii mana koo \n" +
            "Naaf kadhuu ilma kee\n" +
            "Wayyee cubbuu koo\n" +
            "Maariyaam adaraa \n" +
            "Murtii du'arraa \n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n" +
            "Na dagatin gafaa murtii Maariyaam Qulqulleetti\n";

    String title = "Gammadii kaa";

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