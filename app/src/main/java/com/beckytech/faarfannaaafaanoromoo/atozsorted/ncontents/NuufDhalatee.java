package com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents;

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

public class NuufDhalatee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Nuuf Dhalatee dhalateeraa inni nuuf dhalate(2)\n" +
            "Jaalalaa isaatiin Gooftaan  nuuf Dhalatee \n" +
            "\t\tCeesisa \n" +
            "Nuuf Dhalatee Mooraa horiititti\n" +
            "   \"\"        \"\"      Akka hiyyeesaatti\n" +
            "  \"\"        \"\"        mootiin moototaa\n" +
            "  \"\"        \"\"        inni dhalateeraa\n" +
            "  \"\"        \"\"        nagaa namootaa\n" +
            "  \"\"        \"\"        isaatuu nuuf laataa\n" +
            "\t\tCeesisa \n" +
            "Nuuf Dhalatee Gooftaan foon uffatee\n" +
            "  \"\"        \"\"        inni nuu jaallate\n" +
            "  \"\"        \"\"        bilisa nu baasee\n" +
            "  \"\"        \"\"        Kiyyoo seexanarraa\n" +
            "  \"\"        \"\"        akka jirannuuf\n" +
            "  \"\"        \"\"       inni nu biteeraa\n" +
            "\t\tCeesisa \n" +
            "Nuuf Dhalatee Ibsaan jireenya koo\n" +
            "  \"\"        \"\"       mootiin nageenya koo\n" +
            "  \"\"        \"\"       Dukkanicha keessaa\n" +
            "  \"\"        \"\"       isaatuu nu baasee\n" +
            "  \"\"        \"\"       seexanni haa fagatuu\n" +
            "  \"\"        \"\"        isaatu nu kaasee\n" +
            "\t\tCeesisa \n" +
            "Nuf Dhalate Garba cubbichaa\n" +
            "  \"\"        \"\"       nuti  kani turee\n" +
            "  \"\"        \"\"       Iyyeesus dhufeetoo\n" +
            "  \"\"        \"\"       irraa nuu furee\n" +
            "  \"\"        \"\"       dukkana fageessee\n" +
            "  \"\"        \"\"       ifaan nu geggeesee\n" +
            "\t\tCeesisa \n" +
            "Nuuf Dhalatee kootta ni gammannaa\n" +
            "  \"\"        \"\"        ifni nuuf baheeraa\n" +
            "  \"\"        \"\"        fayyisaan Addunyaa\n" +
            "  \"\"        \"\"      Iyyesuus Dhalatee\n" +
            "  \"\"        \"\"      Gammachuun kan guutee\n" +
            "  \"\"        \"\"      Jireenya nuuf laatee\n" +
            "    F/taa Geetahun Shawaa(Koo'el)               \n";

    String mezmurTitle = "114. Nuuf dhalatee";

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