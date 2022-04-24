package com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents;

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

public class MikaaeelNaafDhufee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Mikaa'eel naaf dhufee gadduun ni hafee\n" +
            "Naannoo kan koo(3) Buufatee eegan koo\n" +
            "\n\n" +
            "Hangafni Ergamoota tajaajilan Gooftaa\n" +
            "Moo'annan dhaabbatee moo'ate diinotaa\n" +
            "Gartuu isaan olee Hiriiratti duulee\n" +
            "Gareen Saaxeenaa'el si’oolitti galee\n" +
            "\n\n" +
            "Gabri'eel naaf dhufee dinni koo ni kufee\n" +
            "Jijjiirrame(3) Duuti koo labssme\n" +
            "\n\n" +
            "Karoora diinota karaatti hanbisee\n" +
            "Waaqarraa ergamee Abiddichas dhaamsee\n" +
            "Naabukadanatsor mootiin baabiloonii\n" +
            "Kaayyoonsaa digamee maqaa Gabri'eelitin\n" +
            "\n\n" +
            "Dhufee Ruufa'eelin Raamarraa ariitiin\n" +
            "Dhiphina koo(3) furuudhaf rakkoo koo\n" +
            "\n\n" +
            "Dhukkuboota hamoorraa akka fayyisuuf\n" +
            "Gadameessa haadhole nagaadhan akka hiikuf\n" +
            "Aboon kennameeraaf waaqayyoo biraatii\n" +
            "Qulqulluu Rufaa'eel nuuf koottu har'as ati\n" +
            "\n\n" +
            "Waaqayyoo qulqulluu warra sodatanii\n" +
            "Ni fayyisuu(3) ni eeguu ergamoonnii\n";

    String mezmurTitle = "Mikaa'eel naaf dhufee";

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