package com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents;

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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SinFaarfadhaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Siin farfaadhaa waaqa Koo siin farfaadhaa\n" +
            "Siin farfaadhaa Uuma koo siin farfaadhaa\n" +
            "Galanni kee guddaadhaa siin farfaadhaa\n" +
            "Akka qulqulluu yaarde Anis siin farfaadhaa\n" +
            "\n" +
            "          Jaalala Ilmaa namaaf dhuftee gara lafti\n" +
            "           Dhiphina hedduu argitee Qaarniyoo irrati \n" +
            "            Jaalalii kee guddaa hin fixuu dubbadhee\n" +
            "              Duukaa keeti  bu'aa dandii kee qabadhee \n" +
            "\n" +
            "Qaarniyoo irraati dhiigaa kee lolastee \n" +
            "Kabajaa isaa dura Adaamif deebistee\n" +
            "Balleessa namoota hundumaa isaa dhistee\n" +
            "Lubbuu badee turtee gannati deebistee \n" +
            "\n" +
            "        Cubbuu jibbata malee cubbamma jibbituu \n" +
            "         Balleessa keenya hundaaf dhiifaama kan latuu\n" +
            "         Farfaadhaa yaa namoota masiqoo fi baaganaa \n" +
            "          Gooftaa nuu danda'eef hundumaa jaalalan\n" +
            "\n" +
            "Daandii dhugaa qabadhaa isaa irraas dhabadhaa\n" +
            "Nyaata lubbuuf ta'uu waangalee qabadha\n" +
            "Sooma fi kadhanadhaa jabbaadhaa dhabadhaa \n" +
            "Amanti ishee dhugaa taawahidoo qabadhaa\n";

    String mezmurTitle = "132. Sin faarfadha waaqa koo";

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