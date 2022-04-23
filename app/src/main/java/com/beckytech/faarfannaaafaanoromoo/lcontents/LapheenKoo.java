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

public class LapheenKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Lapheen koo haa baasu galata uumaa koo\n" +
            "Ija koon argeeraa Fayyisuu waaqa koo\n" +
            "Dirree gabaa’ootti Biiftuu naaf dhaabeeti\n" +
            "Hara’as na dawwata irra deddeebitti\n" +
            "\n\n" +
            "Kiyyoo ni ciccite anis jalaan ba’ee\n" +
            "Kiyyoo cubbuu jalaa du’araas nan ba’ee\n" +
            "Kan afaan leencootaa humna isaatin cufe\n" +
            "Waaqni Daani’eel na faana ture\n" +
            "\n\n" +
            "Baganaa daawiti faarfannaa Yaaredii\n" +
            "Qulqulloota wajjin nan faarfadha ani\n" +
            "Ulfina waaqa koo yoo kolfite Meekool\n" +
            "Anis nan faarfadha ulfina waaqa koo\n" +
            "\n\n" +
            "Abiddi boba’ee sodaachisa sunii\n" +
            "Sagada Xawootif labsii yoo baasanii\n" +
            "Hunduu yoo na dhiise addunyaan na gattee\n" +
            "Gooftaan koo uumaan koo cimina naaf ta’ee\n";

    String mezmurTitle = "Lapheen koo";

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