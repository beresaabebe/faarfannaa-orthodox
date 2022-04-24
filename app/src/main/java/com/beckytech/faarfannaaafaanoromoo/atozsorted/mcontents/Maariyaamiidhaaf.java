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

public class Maariyaamiidhaaf extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Maariyaamiidhaafi (2×)ni farfannaafii bara baraanii \n" +
            "Balabala cufame………………bara baraanii \n" +
            "Hiizqi’eel kan jedhe …………bara baraanii\n" +
            "Qulqulleettii dhugaa …………bara baraanii\n" +
            "Gonkumaa durboodha ………bara baraanii\n" +
            "Fakkeenya godhannee…….…bara baraanii\n" +
            "Nutis isuma……………..……bara baraanii\n" +
            "Jaalala dhugaan ni faarfannaafi2×) \n" +
            "\n\n" +
            "Gugee garraamiidha ……………. bara baraanii \n" +
            "Labsituu nageenyaa………...…bara baraanii\n" +
            "Jireenya dukkanaaf……………bara baraanii\n" +
            "Ifa kee nuuf ibsi…………….…bara baraanii\n" +
            "Ani sin kadhadhaa……………bara baraanii\n" +
            "Dubroo lubbuu kootiif………..bara baraanii\n" +
            "Yaa Qulqulleetii suma wabiin koo(x2) \n" +
            "\n\n" +
            "Baay’ee baay’ateera ………… bara baraanii \n" +
            "Jaalalli nuf qabdu………….…bara baraanii\n" +
            "Daangaa hin qabu………….…bara baraanii\n" +
            "Hin dubbatamu………………bara baraanii\n" +
            "Isheen nan gammadaa…….…bara baraanii\n" +
            "Gammachuun taasisaa…….…bara baraanii\n" +
            "Maqaa ishee nan faarfadhaaafii (2×) \n" +
            "\n\n" +
            "Koottu koottu yoon jedhu……bara baraanii \n" +
            "Guyyaa fi halkanii……………bara baraanii\n" +
            "Narraa adda hin bahinii………bara baraanii\n" +
            "Naafis dhiyoodha isheen…..…bara baraanii\n" +
            "Raajii raajii jechuun……….…bara baraanii\n" +
            "Ni galateeffatu ………………bara baraanii\n" +
            "Jaalala ishee ibsuuf jechatu hanqate (2×)\n";

    String mezmurTitle = "Maariyaamiidhaaf";

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