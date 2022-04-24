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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Yoordaanoos extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Yoordaanoos gammadee hedduusi ni carroomttee x2\n" +
            " Gooftaa ishee simaatee kabajaa argatee  x2\n" +
            "\n" +
            "Dhufee samii irraa   gammadee hedduusi ni carroomttee x2\n" +
            "Laggaa yoordaanoosti   >>             >>       >>\n" +
            "Kiristoos cuuphamee     >>                >>        >>\n" +
            "Harkaa yohannisitti         .>>         >>              >>\n" +
            "\n" +
            "Adaamiin deebisuuf iddoo jalqabatti x2\n" +
            "Iyyaasuus cuuphame yoordaanoos keessati x2\n" +
            "  Abbaa samii irraati gammadee hedduusi ni carroomttee x2\n" +
            "  Akkas yeroo jedhuu   >>.               >>.             >>  \n" +
            "Ilmii Koo isaadhaa     >>              >>.              >>. \n" +
            "Inni Ani jaaladhuu       >>.                >>.             >>\n" +
            "\n" +
            "Tokkummaa fi sadummaa kunoo ifa godhee x2\n" +
            "Iyyaasuus cuuphamee  Ilmaan  isaaf jedheex2\n" +
            "     Kabajaa Gooft i gammadee hedduusi ni carroomttee x2\n" +
            "     Yoordaanoos baqatee.      >>          >>.              >>\n" +
            "      Waaqa Uuma ta'uusaa     >>.         >>               >>.\n" +
            "      Isaasi ni hubbatee           >>            >>              >>\n" +
            "\n " +
            "Biqiltuu gaariin hundi ni utaluu x2    \n" +
            "   Iyyaasuus cuuphamee inni hunda caaluu x2                                         \n" +
            "   Egaa kan bodaa gammadee hedduusi ni carroomttee x2\n" +
            "   Garbummaan hafarraa  >>          >>           >>\n" +
            "   Gammachuun farsinaa     >>         >>             >>\n" +
            "    Hundi fayyineerraa       >>         >>              >>\n" +
            "\n" +
            "Xalayaa garbummaa nu'iif barreeffamee x2\n" +
            "Nuuraa barbadeesse Gooftaa nuuf cuuphamee x2\n";

    String mezmurTitle = "152. Yoordaanoos";

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