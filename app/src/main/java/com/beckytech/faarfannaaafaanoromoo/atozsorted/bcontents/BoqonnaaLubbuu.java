package com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BoqonnaaLubbuu extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Boqonnaa lubbuu koo Iyyeesuus gooftaa koo\n" +
            "Saamaariyaan darbuun ana argachuufi\n" +
            "Jiruu bara karaa atoo naaf laachuuf\n" +
            "\n" +
            "Dadhabeera anuu jiruun koo ulfaatee\n" +
            "Akka fedha kiyyaa yoom anaaf mijaate\n" +
            "Ati dhufun kee hin baaduu atoo na barartaa\n" +
            "Burqaa Yaa'iqob gubbatti gooftaa si argeeraa\n" +
            "\n" +
            "Gidduu keenya hin jiruu firummaan dhiigadhaa\n" +
            "Ani saamraawidhaa ati ayihudaawidhaa\n" +
            "Ani lammiin lakkaa'ee kanan beekus kana\n" +
            "Ati naaf laachuu dhuftee dhiifamaaf araara\n" +
            "\n" +
            "Baraan kan hin dhumne naaf kenni bishaan kee\n" +
            "Haa guutu duuwwan koo kiristoos kennaan kee\n" +
            "Dheebuun kee dheebuu koo nyaanni kee fayyu koo\n" +
            "Galatoomii Iyyeesuus gooftaa fayyisaa koo\n" +
            "\n" +
            "Jalqaba kan turtee baraan kan jiraatu\n" +
            "Ilma durbee Maariyaam maqaan kee haa ulfaatu\n" +
            "Bara jireenya koo arjummaa keen himaa\n" +
            "Ati mootii moototaatti maaltu siin dorgomaa\n" +
            "\n";

    String mezmurTitle = "23. Boqonnaa Lubbuu Koo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(mezmurTitle);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textView = findViewById(R.id.textview);
        textView.setText(mezmur);

        textView.setOnLongClickListener(view -> {
            ClipboardManager clipboardManager = (ClipboardManager) getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
            clipboardManager.setText(textView.getText().toString());
            Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_SHORT).show();
            return true;
        });

        textTitle = findViewById(R.id.textTitle);
        textTitle.setText(mezmurTitle);

        fabShare = findViewById(R.id.fabShare);
        fabShare.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, mezmurTitle);
            intent.putExtra(Intent.EXTRA_TEXT, mezmur);
            startActivity(Intent.createChooser(intent,"Share faarfannaa via "));
        });

    }


    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}