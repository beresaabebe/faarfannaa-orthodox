package com.beckytech.faarfannaaafaanoromoo.acontents;

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

public class AniifManniKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Aniif manni koo waaqayyoon waaqessinaa x2\n" +
            "Isatti amannee abdii godhannee gochaasaa dhugaa baanaa x2\n" +
            "\n" +
            "Warrii amaalikoon naannoo keenyaa marsuu\n" +
            "Inni isin hin oolchuu eessaa jira jechuun\n" +
            "Goota beekamaadhaa innoo waaqni keenyaa\n" +
            "Salphinaan deebisee warra diina keenyaa\n" +
            "\n" +
            "Isattii hirkannee humni keenya hin laafnee\n" +
            "Gargaarsaa isaatiinii wanta hedduu darbinee\n" +
            "Maqaasaa jajachuun unuuf hojii keenyaa\n" +
            "Yoomuu hin irraanfannuu oolmaa waaqa keenyaa\n" +
            "\n" +
            "Akka maariyaamii obbolleettii muse \n" +
            "Waaqayyoo hojjenaa isa nu gggeessee\n" +
            "Isa irraa kan hafee kan biraa hin beeknuu\n" +
            "Waaqa ormootaafis harkakeenya hin laannuu\n" +
            "\n" +
            "Naasuudhaan baqatee diinni sagalee isaa\n" +
            "Yommuu dhagahamee samii qaqawweessaa\n" +
            "Isaan sun humnaa fi qabeenyaa isaaniin \n" +
            "Nuti garuu ni moonaa yoommiyyuu taanaanii\n";

    String mezmurTitle = "Aniif manni koo";

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
            startActivity(Intent.createChooser(intent,"Share mezmur via "));
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