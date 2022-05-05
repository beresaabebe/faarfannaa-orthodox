package com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents;

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

public class GalataJedhee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Galataa jedhee fudhadheera .\n" +
            "hundaa harka keerraa (2×).\n" +
            "Gooftaa siitu beeka naafi caala naaraa 2×)\n" +
            "\t\tCeesisa\n" +
            "Inni anni hawuu laphee koo keesatti. \n" +
            "Feedhiin koo heeduudha akkan ilaaluutti.\n" +
            "Milka'ina maraa sii harkani egaadha. \n" +
            "Siin dursuu abbaa koo suutan tarikanfadhaa\n" +
            "\t\tCeesisa \n" +
            "Hayyuu fi dureessa hundaa kan dursiituu. \n" +
            "Hojiin kee abbaa koo enyuumtu hin gitu. \n" +
            "Ulfinaa keen monaa keesaa koo keessatti. \n" +
            "Ofii tufaadheetanani kufee sii duuratti\n" +
            "\t\tCeesisa\n" +
            "Inni atti rawaatuu kamtuu fookiisadha .\n" +
            "Oguumani kan keetti annoo walaaladha. \n" +
            "Feedhii keen abaa koo - koosii irra naa kaftee .\n" +
            "Miidhaginaf siniboo lubbuu kootii ufiftee. \n" +
            "\t\tCeesisa\n" +
            "Anaaf naf beekuun kee hundinu dagate \n" +
            "Irreensa dhaganis bollati bafatee\n" +
            "wajini jirtaa mootichaa mototaa \n" +
            "Sammun gonkumaa kana yoom dagataa \n" +
            " \n\n\"Faarfataa Amaan hayiluu \"\n";

    String mezmurTitle = "50. Galata jedhee";

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