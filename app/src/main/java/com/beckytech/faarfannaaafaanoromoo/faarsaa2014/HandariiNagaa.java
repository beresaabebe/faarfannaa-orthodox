package com.beckytech.faarfannaaafaanoromoo.faarsaa2014;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HandariiNagaa extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Sorgaanummaan kee addaadha\n" +
            "Ayyaanni kee ol-aanaadha\n" +
            "Maariyaamii handarii nagaa\n" +
            "Maariyaamii simattuu aagaa\n" +
            "      \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39Ceesisa\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
            "Magaala Naazriit Galiilaatti\n" +
            "Jirbii fi warqee yoo wal simsistuutti\n" +
            "Gabri'eel dhufee aaga sitti himeera\n" +
            "Ayyaana qabeetti siin jedheera\n" +
            "      \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39Ceesisa\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
            "Suraafeel kirubeel caala kabaji kee\n" +
            "Ilmaa kee durattis guutuudha sugni kee\n" +
            "Warqee uffatte mirgasaa dhaabbatta\n" +
            "Uumama hundumarra eenyu sin qixxata\n" +
            "      \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39Ceesisa\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
            "Godoo dookimaas hiri'ummaasaa laalte\n" +
            "Hanqina saatiif baate kan kadhatte\n" +
            "Anas mucaa kee durbee na yaadadhu\n" +
            "Kadhanna keetiin hir'uun koo akka guutu\n" +
            "      \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39Ceesisa\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
            "Gugee garraamii koo jaalalan naaf koottu\n" +
            "Waa'ee cubbuu koof ilma kee naaf kadhu\n" +
            "Anoo dadhabaadha naamusa kootiini\n" +
            "Andarii nagaa koo du'aaf na laatini\n";

    String title = "Handarii nagaa";

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