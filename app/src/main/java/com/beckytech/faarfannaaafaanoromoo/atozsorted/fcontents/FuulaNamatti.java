package com.beckytech.faarfannaaafaanoromoo.atozsorted.fcontents;

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

public class FuulaNamatti extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Fuula namatti ani tuffatamee kanan ture (2x)\n" +
            "Waaqayyoo koo anaan naa filaateera turee (2x)\n" +
            "\n" +
            "Namni naa tuffatuus waaqni koo naa hin gannee \n" +
            "Tiksee kanan turee waamee naa filatee\n" +
            "Kan namni tuffatu waaqayyoo hin tuffatuu\n" +
            "Akka waaqa israa'eel eessumaa argatuu\n" +
            "\n" +
            "Gooliyaadii naa waame humna isaattii abdatee\n" +
            "Foon isaatti of abdatee anaan na tuffatee\n" +
            "Humna waaqayyootiin gooliyaad ni du'ee\n" +
            "Waaqni israa'eel ana faana ta'ee\n" +
            "\n" +
            "Warra babbareedan obboolaa koo dhiisee\n" +
            "Waamee naa filatee naa tuffachuu dhiisee\n" +
            "Kan namni tuffate waaqni koo hin tuffatu\n" +
            "Akka waaqa israa'eel eessatti argatu.\n" +
            "\n" +
            "F/taa Waldeeseenbaat Baqallaa";

    String mezmurTitle = "48. Fuula namatti";

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