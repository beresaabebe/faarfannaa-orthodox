package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Israaeelidhamaqaankoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "(Israa'eelidha maqaan koo\n" +
            "Nattaneemiidha hojiinkoo) (x2)\n" +
            "Moo'ii naaf jiraadhu iyyeesuus waaqakoo\n" +
            "Moo'ii naaf jiraadhu kiristoos gooftaakoo\n\n" +
            "     Hoolicha isa bade barbaaduf kan dhufte\n" +
            "    Aarsaan kakuu haaraa addunyaa kan taate\n" +
            "    Kuftee ol na kaaste mucaakoo naan jette\n" +
            "    Akkan si faarfadhuuf kankee na taasiftee (x2)\n\n" +
            "Jaalalan na bitte mi'aadha gatiinkoo\n" +
            "Oliif gadi kaatus na hin argu diinnikoo\n" +
            "Homaallee hin sodaadhu an ilma mootiiti\n" +
            "Mallattoon dhiigasaa kan jiru harka kootti (x2)\n\n" +
            "      Gooftaan koo sumaadha yoomillee si hin shakku\n" +
            "      Sin eebbisa jettee naa galteetta kakuu\n" +
            "      Maqaa keeti anaaf nyaataaf dhugaatin koo\n" +
            "      Mana keen filadhe bakka jireenyaa koo (x2) \n\n" +
            "Amani hin sodaatin dorsiisa diina kee\n" +
            "Hamadhaaf si hin laatu kiristoos gooftaan kee\n" +
            "Kiyyoo diina cabsee waltajjii si  dhaaba\n" +
            "Du'aa boolla kaasa inni maal dadhaba (x2)\n";

    String title = " Israa'eelidha maqaan koo ";

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