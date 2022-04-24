package com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents;

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

public class MootichiYihuudaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Mootichi yihuudaa Iyyeessuus gooftaadha(2x) \n" +
            "Anis nana jedhaa abbaa kooIyyesuus seenii manaa koo(2x) \n" +
            "Giiftii koo miissiirroo solomoonsiin jedhee(2x) \n" +
            "Aniis nan jedhaa haadhaa koo maariyaam seenii manaa koo(2x) \n" +
            "Angafti ergaamotaa Mikaa’el suumadhaa(2x) \n" +
            "Aniis nana jedhaa eegaa koo Mikaa’eel seenii manaakoo(2x) \n" +
            "Ijoollee saadanii abiddaa kaan baastee(2x) \n" +
            "Anis nan jedhaa egaa koo Gabri’eel seenii manaa koo(2x) \n" +
            "Bakkee onaatis nu waamtMootichi amantii Takliyyee sumadhaa(2x) \n" +
            "Aniis nan jedhaa abbaa koo Takliyyee seenii manaa koo(2x) \n" +
            "Mootichi ziiquwala Abuyee suumadhaa(2x) \n" +
            "Anis nan jedhaa abbaa koo Abuyee seenii manaa koo(2x) \n" +
            "Koot duumeessaanii koot duumessaanii(2x) \n" +
            "Fayyisaa keenyaa araara keetinii \n" +
            "Durbee Maariyaam kadhannaa keetinii \n" +
            "Ergamaa Mikaa’eel eegumsaa keetinii \n" +
            "Ergamaa Rufaa’eel eegumsaakeetiinii \n" +
            "Ergamaa gabri’eel eegumsaa keetinii      \n";

    String mezmurTitle = "102. Mootichi yihuudaa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbaaf_ilma);

        initUI(mezmurTitle);

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