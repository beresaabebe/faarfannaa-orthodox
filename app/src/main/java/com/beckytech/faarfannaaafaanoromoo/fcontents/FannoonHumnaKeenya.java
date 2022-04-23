package com.beckytech.faarfannaaafaanoromoo.fcontents;

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

public class FannoonHumnaKeenya extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Fannon humna keenyaa\n" +
            "Ittiin moona warra diina Keenyaa(2)\n" +
            "Ittiin moona(2) warra diina keenyaa\n" +
            "\n" +
            "                  Fannoon humna keenyaa nuyiif abdii keenyaa\n" +
            "                                “                           mallattoo naageenyaa\n" +
            "                              “                           dinni nuun argatuu\n" +
            "                              “                         isa abdiin keenyaa\n" +
            "Fannoon humna keenya dinni haa qaana’uu\n" +
            "\n" +
            "             “                          fannoon abdii keenyaa\n" +
            "            “                        isaan injifaannaa\n" +
            "           “                       warra dina keenyaa\n" +
            "\n" +
            "                 Fannoon humna keenyaa furaa lubbuu keenyaa\n" +
            "                                “                            fannoon humna keenyaa\n" +
            "                               “                           jiraachisaa keenyaa\n" +
            "                               “                         nuuf mallaatoo keenyaa\n" +
            "\n" +
            "Fannoon humna keenyaa warra itti amananiif\n" +
            "                “                             fannoon fayyinadhaa\n" +
            "               “                           warra ittii hin amneef \n" +
            "               “                          garuu gowwummaaadhaa\n";

    String mezmurTitle = "Fannoon Humnna keenya";

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