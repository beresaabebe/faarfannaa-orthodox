package com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa;

import android.os.Bundle;
import android.widget.TextView;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class YaaUumaaKoo extends OptionsMenuActivity {

    TextView textTitle, textContent;

    String content = "Yaa uumaa koo anoo si waammadhaa\n" +
            "Oboroodhaan ka’ee gara mana keeti na fiigaa\n" +
            "Dhiqii naa qulqulleessi hunduu sirraa jira\n" +
            "Teellaatti hin deebi’uu ati hunda qabeessa\n\n" +
            "Hidhameetan turee afuura diinaatiin\n" +
            "Karaa keerra goree siniis gaddisiisee\n" +
            "Fuula kee ifaadhaan garakoo ilaaltee\n" +
            "Diinicha ifattee mucaakee fayyistee\n\n" +
            "Qaamni koo martinuu raammoodhaan nyaatamee\n" +
            "Wanti nani qabuu na duraati dhumee\n" +
            "Namootaan firootaan baayyiseen jibbamee\n" +
            "Garbicha kee naa fayyisuukee argee\n\n" +
            "Jiruun lafa kanaa keessakoo boreesse\n" +
            "Sirraa na fageessee qaroo ija koo jaamsee\n" +
            "Du’atti na kennee allayyaa qopheessee\n" +
            "Boolla awwaalchakoo gooftaa situ naaf duuchee\n\n" +
            "Maaluma si dhibaa yaa gooftaa gooftootaa\n" +
            "Qilleensa jabaa sun  atoo abboomteettaa\n" +
            "Ciisicha ol kaatee danbalii dhaabdeettaa\n" +
            "Dhiphina bartoota isaanif furteettaa\n\n" +
            "Osoo ati hin jirree addunyaan maal ta’aa\n" +
            "Karaarrati hafeeti bineensaan nyaatamaa\n" +
            "Qaawwaa banaa Sana barbadeessiteettaa\n" +
            "Bakka aara galfii namootaaf taateettaa\n";

    String title = "Yaa uumaa koo anoo si waammadhaa";

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