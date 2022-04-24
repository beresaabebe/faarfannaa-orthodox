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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SinbooKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Sinboo koo surraa koo ulfinaa\n" +
            "Maal akkam akkaman si gana\n" +
            "Hin dagadhu seenaa koo kaleessaa\n" +
            "Hin haqamtuu maariyaam koo na keessaa\n" +
            "\n" +
            "Sinboo koo Naaf dawwaa maqaan kee\n" +
            "     \"\"       \"\"   Nan hima ulfina kee\n" +
            "     \"\"       \"\"  si faarsee sin quufu\n" +
            "     \"\"       \"\"  yoomillee sin nufuu\n" +
            "\n" +
            "Sinboo koo har'a maaltu argamee\n" +
            "     \"\"       \"\"  maqaan kee jibbamee\n" +
            "     \"\"       \"\"  ato nuuf kadhattaa\n" +
            "     \"\"       \"\"  Garraamii haadha Gooftaa\n" +
            "\n" +
            "Sinboo koo Dhiphuu hunda dandeessee\n" +
            "     \"\"       \"\"  Beetelemiis geessee\n" +
            "     \"\"       \"\"  Misiriin buteettaa\n" +
            "     \"\"       \"\"  Fannoo jalas jirtaa\n" +
            "\n" +
            "Sinboo koo Sanyii gaarii taatee\n" +
            "     \"\"       \"\"  sidham kan nuuf haftee\n" +
            "     \"\"       \"\"  mee sila eenyun qabna\n" +
            "     \"\"       \"\"  nuso Abiddaan dhumnaa\n" +
            " F/taa Dn Gammachis Yiggazzuu\n";

    String mezmurTitle = "131. Sinboo Koo";

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