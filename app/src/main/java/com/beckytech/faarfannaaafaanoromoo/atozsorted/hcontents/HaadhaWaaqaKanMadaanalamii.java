package com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents;

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

public class HaadhaWaaqaKanMadaanalamii extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Hadhaa waqaa kan Madaanalami koottu mariyaami (×2) \n" +
            "kani madanalimi (×2) kottuu Mariyaami    \n" +
            "Maddaa qulqulleetii             \"\n" +
            "Taalilaa hin borofne            \"\n" +
            "Hadhaa gafaa Raakkoo       \" \n" +
            "Kan hin sisinnofne              \"             \n" +
            "\n\n" +
            "       Abdii si godhaane  kottu  mariyaami \n" +
            "       Kan hin dukkaanofne        \"\n" +
            "       Maqaa kee waamanne       \" \n" +
            "        Koyyaa mogaa Dhufeene          \"                 \n" +
            "\n\n" +
            " Nuuf kadhaatti Durbee Qulquulletin Iddoo Raakkotii (×2) \n" +
            "Durbee Qulqulleti Iddo Rakkotii (×2) \n" +
            "Ilmaa koo naani jechaa   iddoo rakkoti \n" +
            "Sagaal naa mil'ate                     \"\n" +
            " Garaa Lafettikoo                      \" \n" +
            "Yomfaa na  dagaate                  \"\n" +
            "\n\n" +
            " Nuuf kadhatti Durbee qulquulletin  iddoo Raakkootii (×2)  \n" +
            "   Durbee qulquulletin Iddoo Raakkoti (×2) \n" +
            "   Garaa ishee Deebinan               \"\n" +
            "    Rakkoo oddefaachuu               \"\n" +
            "    Kan keessa kof ta'u                  \"\n" +
            "    Argaadhee Gamaachuu            \"                   \n" +
            "\n\n" +
            "Nuu  aararsi yaa wadaa fayyinnaa Nuu si faarsinaa (×2)\n" +
            " Yaa wadaa Faayyiinaa Nuu sii faarsinaa (×2) \n" +
            "Yoon farse maqaa kee nuu si faarsinaa \n" +
            "Me maalin sodaadhaa         \" \n" +
            "Abdii gaafaa Raakkoo        \" \n" +
            "Siilaa Sin Abdaadhaa          \"\n" +
            "\n\n" +
            "Nuu  Aararasi Yaa wadaa Faayyinaa nuu sii Faarsinaa (×2)  \n" +
            "Yaa waadaa Faayyinaa Nuu si faarsina (2) \n" +
            "           waabii qulquullotaa  nuu si faarsina \n" +
            "           Yaa Abdii jireenyaa             \"\n" +
            "           Durbee mariyamaa               \" \n" +
            "           koottuu gara keenyaa           \"  \n" +
            "Nuu araarsisi yaa waadaa faayyinaa nuu si faarsinaa (×2)\n";

    String mezmurTitle = "Haadha waaqa kan madaanalamii";

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