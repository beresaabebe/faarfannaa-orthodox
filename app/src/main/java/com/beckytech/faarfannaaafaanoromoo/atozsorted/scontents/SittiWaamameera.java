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

public class SittiWaamameera extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Sitti waamameeraa maqaa bira qabu\n" +
            "Reebuun koos jabaadha tasa hin dadhabuu\n" +
            "Burqaan eenyumaa koo hafuurri koo siidha\n" +
            "Yaa Gooftaa maqaan kee kattaa jiraatadha\n" +
            " \t\tCeesisa\n" +
            "Bakka qopheessite erga naa simatee\n" +
            "Dhiiga kee lolaaste bilisa naa bastee\n" +
            "Sitti hirkadheen fayyaa keenna koo ganamaa\n" +
            "Angafaa Dhugaadhaa ati mootin hundumaa(2)\n" +
            " \t\tCeesisa\n" +
            "Mooticha yihuuda du'a kan Ajjeestee\n" +
            "Yaa Iyyesuus ati simboo koo naf taatee\n" +
            "Akeekni koo guddan maqaa kee mullisuu\n" +
            "Mootummaa kee irraa eenyu naa hin hirrisuu(2)\n" +
            " \t\tCeesisa\n" +
            "Hidda koo keessati dhiiga keetu muldhate\n" +
            "Beenya guddadhan situ naa bitate\n" +
            "Addunyaa keessatti ulfina argachuurra\n" +
            "Fannoo kee batadhe siif adda baheera(2)\n\n" +
            " F/taa Dn Pheexiroos Abbabaa\n";

    String mezmurTitle = "Sitti waamameera";

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