package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Kannafiltee extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Kan na filtee kan naa waamtees waaqaekoo(2)\n" +
            "Naaf miidhagsi naaf barrechi naaf miidhagsii dhumaa jiirenyaakoo(2)\n\n" +
            "Warreen beebekaamoon osoo jiirani\n" +
            "Mallaqaf warqeedhan warri soromani\n" +
            "Isaan tuufachuudhan akkamin naa fiiltee\n" +
            "Anaan ol naa kaastee galatafi naa waamtee\n" +
            "Addaraa waaqakoo atii nan dhiisini\n" +
            "Dhufa mootumma kettii nan irranfatini\n\n" +
            "Cuubbukoo kaallesaa raawannan goochakoo\n" +
            "Ifaa daamasikotiin jaametaa ijjikoo\n" +
            "Baadikoo osoo hin ilaliin dhiifamaa naaf lattee\n" +
            "Waangelakee guuddan anaan naa kaadhimtee\n" +
            "Addaraa waaqakoo atii nan dhiisinii\n" +
            "Dhuufaa mootummakeeti nan irrafatin\n\n" +
            "Biifafii qabenyaan gooftan hin filaatuu\n" +
            "Laaphee qulqulluudhaan kan ati filattu\n" +
            "Cubbukoo oson ilalin seentetaa manakoo\n" +
            "Akkaa abrahaam ebbistee manakoo\n" +
            "Addaraa waaqakoo atii nan dhiisin\n" +
            "Dhufaa mootumaakketti nanii irrafatin\n\n" +
            "Namni kan beekamuu dhumnisaa barennani\n" +
            "Akkaa yihuudattii gooftaa ganuu bannani\n" +
            "Obsaaf jalalaakee naaf kenni waaqakoo\n" +
            "Akkaan sii yakkinee baraa jiirenyaakoo\n" +
            "Addaraa waaqakoo atii nan dhisin\n" +
            "Dhufaa mootumaakketti nan irranfatinii\n";

    String title = " Kan na filtee kan naa waamtees waaqaekoo ";

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