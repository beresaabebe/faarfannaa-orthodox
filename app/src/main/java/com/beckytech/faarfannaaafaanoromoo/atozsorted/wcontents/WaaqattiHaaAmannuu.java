package com.beckytech.faarfannaaafaanoromoo.atozsorted.wcontents;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.beckytech.faarfannaaafaanoromoo.AboutUs;
import com.beckytech.faarfannaaafaanoromoo.GalataActivity;
import com.beckytech.faarfannaaafaanoromoo.MoreApps;
import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.beckytech.faarfannaaafaanoromoo.WaaeeApp;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WaaqattiHaaAmannuu extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Waaqatti Haa Amannu Isa NuWaamettii\n" +
            "Manaatii Nu Baasee Nu Hin Gatuu Bakkeettii\n" +
            "Deemsa Dura Keenyaa Isatu Nu Geggeessa\n" +
            "Galaanicha Saaqee Waaqni Nu Ceesisaa\n" +
            "\n" +
            "      Fari'oon Yoo Dhufee Yoo Ga'e Nu Biraa\n" +
            "      Ceesisuu Yoo Didee Galaanni Eertiraa\n" +
            "      Harka Musee Keessaan Raajii Kan Hojjetuu\n" +
            "      Waaqni Nu Gaggeessaa Du'atti Nu Hin Laatuu\n" +
            "\n" +
            "Misirii Nu Baasee Galaana Ceesisee \n" +
            "Kana'aan Nu Galchuuf Isa Nu Abdachiisee \n" +
            "Israa'eel Faarfadhuu Sagalee Ol Kaasii\n" +
            "Humna Waaqayyoodhaa Addunyaadhaaf Labsii\n" +
            "\n" +
            "      Waaqni Nu Geggeessu Nu Biraa Hin Hafuu\n" +
            "      Tikseen Lubbuu Keenyaa Dagatee Hin Rafuu\n" +
            "        HinMamin YaaNamaa Amani Waaqakee\n" +
            "         Isatu Siif Miidhagsaa Dhuma Jireenya\n";

    String mezmurTitle = "Waaqatti haa amannuu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI();

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