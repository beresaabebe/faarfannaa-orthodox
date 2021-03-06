package com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents;

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

public class DubartootaaKeessaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Dubartootaa keessaa filataamtee\n" +
            "Kennaa waaqayyoo kan argattee\n" +
            "Gammadi yeroo hundumaa Gammadi yeroo hundumaa\n" +
            "Yaa Maariyaam Yaa Giiftii koo Abdiin Keenya Sumaa\n" +
            "       Ceesisa\n" +
            "Fannoo jalatti nuuf kennamtee\n" +
            "Haadha hundaf taatee argamtee\n" +
            "Waaqa uuman kan Eebbifamtee(2)\n" +
            "Yaa Durboo Iyyesuus nuuf laattee\n" +
            "        Ceesisa\n" +
            "Sanyii qulqulluu irraa Dhalattee\n" +
            "Uumamaa hundarraa filatamtee\n" +
            "\n" +
            "Maariyaamii yaa haadha Gooftaa(2)\n" +
            "Cubbuu keenyaf situ nuf kadhataa\n" +
            "      Ceesisa\n" +
            "Gadamessi kee qulqulluudhaa\n" +
            "Kan Ati Deessee Fayyisaadhaa\n" +
            "Gooftaa Adoonaay Abidda baattee(2)\n" +
            "Ifa Addunyaa nutin nu badhaastee\n";

    String mezmurTitle = "34. Dubartootaa keessaa";

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