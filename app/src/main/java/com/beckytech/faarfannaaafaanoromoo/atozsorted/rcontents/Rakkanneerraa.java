package com.beckytech.faarfannaaafaanoromoo.atozsorted.rcontents;

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

public class Rakkanneerraa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Rakkanneerraa Dhiphanneerraa\n" +
            "Jiraachuu dhadhabneerraa\n" +
            "Giyoorgisii nuuf koottu adaraa\n" +
            "\n" +
            "Rakkanneerraa Guyyaan Dhihuu didee\n" +
            "     \"\"        Hundu fala dhabee\n" +
            "     \"\"        Daa'immaan dhumanii\n" +
            "     \"\"        Maatiinsi boo'anii\n" +
            "     \"\"        Haati dhaala dhabdee\n" +
            "     \"\"        Abbaanis gaddeeraa\n" +
            "     \"\"        Mootonnis gaddanii\n" +
            "     \"\"        Diraagon dhufnaanii\n" +
            "\n" +
            "Rakkanneerraa qulqulluu Giyoorgis\n" +
            "     \"\"        Gooticha Amantii\n" +
            "     \"\"        Kan du'a sodannee\n" +
            "     \"\"        Amanee waaqasaa\n" +
            "     \"\"        Eeboosaa qabatee\n" +
            "     \"\"        Fardasaa yaabbatee\n" +
            "     \"\"        Eeboosaa qabatee\n" +
            "     \"\"        Goorgis maal dhabaree\n" +
            "Gammanneerraa hundinu Gammannerraa(2)\n" +
            "\n" +
            "Giyoorgisiin fardasaan dhufeeraa\n" +
            "Gammanneerraa waaqqn geggeeffame\n" +
            "     \"\"        Goorgis nuuf eergamee\n" +
            "     \"\"        Birkitawiitn jirtii\n" +
            "     \"\"        Mukatti hidhamtee\n" +
            "     \"\"        Dinni hunda keenyaa\n" +
            "     \"\"        Diraagoon ni kuufee\n" +
            "     \"\"        Waaqatti Amanee\n" +
            "     \"\"        Darbatee eeboosaa\n" +
            "\n" +
            "Gammanneerraa fannoosaa qabatee\n" +
            "     \"\"        Diina injifatee\n" +
            "     \"\"        Muchatiin ni jirtii\n" +
            "     \"\"        Diraagoon du'eeraa\n" +
            "     \"\"        Gammada namootaa\n" +
            "     \"\"        Goorgistuu ajjeesee\n" +
            "     \"\"        Hangafa diinootaa\n" +
            "     \"\"        Kanaaf ni faarfannaa\n" +
            "\n" +
            "Gammanneerraa Torba du'e ka'e\n" +
            "     \"\"        Hangafni Tolootaa\n" +
            "     \"\"        Giyoorgis cimaadhaa\n" +
            "     \"\"        Ililchaa namootaa\n" +
            "     \"\"        Seexanni qaana'ee\n" +
            "     \"\"        Hunduu Gooftaan ta'e\n" +
            "     \"\"        Amanaa namootaa\n" +
            "     \"\"        Goorgis raajii hojjetee\n" +
            "   F/taa Dn Bulchaa(Toomaas) Galataa\n";

    String mezmurTitle = "Rakkanneerraa";

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