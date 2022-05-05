package com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents;

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

public class YaaWaaqayyoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Yaa Waaqayyoo koo ati Fayyisaaf jaalala\n" +
            "Jaalala kan kee maaltu madaalaa\n" +
            "\t\tCeesisa\n" +
            "Yaa Waaqayyoo koo jireenyi Addunyaa\n" +
            "     \"\"'        '\"\"      \"\"        simalee naf hin ta'u\n" +
            "     \"\"'        '\"\"      \"\"        dhiphina sammu koos\n" +
            "     \"\"'        '\"\"      \"\"        si malee na ba'u\n" +
            "     \"\"'        '\"\"      \"\"        karoorri jireenyas\n" +
            "     \"\"'        '\"\"      \"\"        simalee milkaa’uu\n" +
            "Mana kee keessatti ati na tikfadhu\n" +
            "Akka nuti badnee ati na baafadhu\n" +
            "\t\tCeesisa\n" +
            "Yaa Waaqayyoo koo Sammuun koo jeeqamnan\n" +
            "     \"\"'        '\"\"      \"\"        Gooftaa sinan gammadda\n" +
            "     \"\"'        '\"\"      \"\"        ifa jireenya koo\n" +
            "     \"\"'        '\"\"      \"\"        sinan argadhee\n" +
            "     \"\"'        '\"\"      \"\"        gammaden jiraadha\n" +
            "     \"\"'        '\"\"      \"\"        maqaa kee waamadhee\n" +
            "Mana kee keessatti ati na gorfadhuu\n" +
            "Akka Nuti badneef ati na baafadhuu\n" +
            "\t\tCeesisa\n" +
            "Yaa Waaqayyoo koo humna dhabee kufnan\n" +
            "     \"\"'        '\"\"      \"\"        si'inan ol jedhee\n" +
            "     \"\"'        '\"\"      \"\"        anis siif jira jettee\n" +
            "     \"\"'        '\"\"      \"\"        ato ol na dhaabdee\n" +
            "     \"\"'        '\"\"      \"\"        mana kee keessattis\n" +
            "     \"\"'        '\"\"      \"\"        kuno nan faarfadhee\n" +
            "Mana keessatti ati na tikfadhuu\n" +
            "Akkan ani badneef ati na gorfadhuu\n" +
            "  F/taa Abarraa Baqqalaa\n";

    String mezmurTitle = "151. Yaa waaqayyoo";

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