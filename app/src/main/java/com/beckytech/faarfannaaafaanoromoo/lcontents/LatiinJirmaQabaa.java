package com.beckytech.faarfannaaafaanoromoo.lcontents;

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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LatiinJirmaQabaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Latiin jirma qabaa kan irraa dhalatee,\n" +
            "Jirmis ni jiraataa hundee jabeeffatee,\n" +
            "Latiin bara kanaa haadha isaa ganeeraa,\n" +
            "Haadha waaqa uuma baay'een dhagateera \n" +
            "\n" +
            "Qomoon Haadha beekne ilma akkamin beekaa\n" +
            "Dogoggorsuuf dhufee ilaalaati beekaa\n" +
            "Waaqayyoo jaalala isheen haadha jaalalaa}×2\n" +
            "Ijji koo yeroo hundaa gara ishee ilaalaa}×2\n" +
            "\n" +
            "  Kabajni kan ta'uuf nuti ni kabajna \n" +
            "   Haadha iyyasuusin akkamiin salphiifna\n" +
            "  Dubartoota keessa isheen adda taate }×2\n" +
            "  Fayyisa addunyaa garaa isheetti baatte}×2\n" +
            "\n" +
            "  Gabri'el ergamaan ergamoota keessaa\n" +
            "  Misiraachoo fidee gammadi ilma deessa\n" +
            "  Cubbuun karaa hewaan gara keenya dhufee}×2\n" +
            "  Dubroo maariyaamiin kunoo nurra kufee}×2\n" +
            "\n" +
            "  Kennaa fannoo jalaa kan guyyaa jimaata\n" +
            "  Karaa yohannis at nuuf kennamteetta\n" +
            "  Nuufis haadha keenya haadha bara baraa}×2\n" +
            "  Ilma kee nuuf kadhuu yeroo hunda araara}×2\n";

    String mezmurTitle = "Latiin jirma qabaa";

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

    private void initUI() {
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setIcon(R.drawable.ic_launcher_foreground);
        mActionBar.setDisplayShowCustomEnabled(true);
        mActionBar.setCustomView(R.layout.custom_actionbar_layout);
        mActionBar.setTitle("Abbaafi Ilma");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0A6E73"));
        mActionBar.setBackgroundDrawable(colorDrawable);
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}