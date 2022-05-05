package com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents;

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

public class GalataKee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Galata kee (2)Waaqa koo\n" +
            "Galata kee(2) uumaa koo\n" +
            "Na bitatte lubbuu koo\n" +
            "\n\n" +
            "Galaatakee… Fooniif lubbuudhaan badee\n" +
            "                         Dandii kees irraanfadhee\n" +
            "                         Akkan deebi'u na gootee\n" +
            "                         Sagalee kee hubadhee\n" +
            "                         Ulfaadhu kaa mootii koo\n" +
            "                         Jaalalaan na mo’atte\n" +
            "\n\n" +
            "Galatakee… ba’aa koo isa cimaa\n" +
            "Fannoo irratti naa baattee\n" +
            "Diina koo seexanichaa\n" +
            "Situ narraa ifatee\n" +
            "Galatoomi Waaqa koo\n" +
            "Kan nama na godhattee\n" +
            "\n\n" +
            "Galatakee…Akkan ani hin beelofneef\n" +
            "                     Foonuma kee naaf laattee\n" +
            "                     Akkan ani hin dheebonnees\n" +
            "                     Dhiiga kee na obaastee\n" +
            "                    Maqaan kee haa ulfaatuu\n" +
            "                     Gocha ati naaf gooteef\n";

    String mezmurTitle = "51. Galata kee";

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