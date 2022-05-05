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

public class BaayeeNaYaaddeessa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Baay'ee na yaaddessaa biyyii lafa kunii\n" +
            "Ittiin naan dhabbaadha amantii naaf keennii\n" +
            "\n" +
            "Akka dhaba iyyessaa boqusaa gadbuuse\n" +
            "Waa'ee cubbuu keenyaaf fannoorratti du'e\n" +
            "Maal urgaan deebisaa olmaa gooftaa kootii\n" +
            "Barumaa baraani galannii kansaatii\n" +
            "\n" +
            "Hubanna firaa koo waan gooftaan nuuf ta'e\n" +
            "Waa'ee cubbuu keenyaa akka hattuu ta'e\n" +
            "Mukaa fannoorratti harkasaa dirirsee\n" +
            "Hiidhaa cubbuu keenyaa isaatuu nurraa hiikee\n" +
            "\n" +
            "Ala jiraannaa mana gad hin bahiin\n" +
            "Mana jiraannaan alaa ol hin lixiin\n" +
            "Mamiidhaan guutamte boode kee hin millatin\n" +
            "Garaa kee kutadhu yeroo kee hin fixinii\n" +
            "\n" +
            "Iyyesuus yaa mootii koo si'ii gachanni koo\n" +
            "Foon si amanadhe ifaa jireenya koo\n" +
            "Tasuma hin jiru si bira rakkinnii\n" +
            "Maaloo sittii boonyaa jireenya nuuf keennii.";

    String mezmurTitle = "14. Baay'ee na yaaddeessa";

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