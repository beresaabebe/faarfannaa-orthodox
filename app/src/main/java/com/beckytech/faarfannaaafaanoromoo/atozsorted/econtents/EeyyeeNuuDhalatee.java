package com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents;

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

public class EeyyeeNuuDhalatee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Eeyyee nuu dhalatee Amanuu'eel dhalatee (2)\n" +
            "Eeyyee nuu dhalatee gooftaan nuu dhalatee\n" +
            "Waggaa hedduudhaaf inni egama turee\n" +
            "Nuu dhalatee kunnoo ijaatiin agaaree\n" +
            "\n\n" +
            "Amanuu'eel dhalatee\t nuu dhalatee(2)\n" +
            "Beteeliyeemiitti\t\"\t\"\n" +
            "Dala horii keessatti\t\"\t\"\n" +
            "Iddoo gad deebiitti\t\"\t\"\n" +
            "Dhaloota gooftaadhaa\t\"\t\"\n" +
            "Tiksoonii argaanii\t\"\t\"\n" +
            "Ililchaan ka'aanii\t\"\t\"\n" +
            "Hedduu gammadaanii\t\"\t\"\n" +
            "\n\n" +
            "Gammada amantoota\t nuu dhalatee(2)" +
            "Gooftaan dhalachuu isa\t\"\t\"\n" +
            "Ilillen faarfaanaa\t\"\t\"\n" +
            "Gammachuu arganneerraa\t\"\t\"\n" +
            "Ixaanaa dhaaf qumbii\t\"\t\"\n" +
            "Harkaa fudhii laana\t\"\t\"\n" +
            "Waal geenyee faarfaanaa\t\"\t\"\n" +
            "\n\n" +
            "Goorsaa ba'a sagalee\t nuu dhalatee(2)\n" +
            "Urjii ilaalaanii\t\"\t\"\n" +
            "Maariyaamiif mucaa ishee\t\"\t\"\n" +
            "Dhaqanii argaanii\t\"\t\"\n" +
            "Hedduu gammadaanii\t\"\t\"\n" +
            "Saagadani ililchaanii\t\"\t\"\n" +
            "Ixxaana dhaaf qumbii\t\"\t\"\n" +
            "Harkaa fudhi laatanii\t\"\t\"\n" +
            "\n\n" +
            "Maariyaam akka deessuu \t nuu dhalatee\n" +
            "Gabri'eeltoo dubbatee\t\"\t\"\n" +
            "Addunyaa kana irraa\t\"\t\"\n" +
            "Maariyaamin filaatee\t\"\t\"\n" +
            "Eenyuu iyyuu hin dandeenyee \t\"\t\"\n" +
            "Garaa isheetti baattee\t\"\t\"\n" +
            "Yeroo rakkinaatti nuu\t\"\t\"\n" +
            "Fudhaatee goodantee\t\"\t\"\n" +
            "\n F/taa Mamoo Kabaa";

    String mezmurTitle = "42. Eeyyee nuu dhalatee";

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