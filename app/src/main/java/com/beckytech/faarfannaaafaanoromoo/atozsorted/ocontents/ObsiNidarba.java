package com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents;

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

public class ObsiNidarba extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Obsi ni darba yaa nama obsi ni darba\n" +
            "Kan si uume si hin gatu harka kee qaba\n" +
            "Haadha koo maaf boossa imimmaan lolaastee\n" +
            "Duraaf duuba ilaaltee kophumaa argitee\n" +
            "Hojiin waaqa israa'eel inoo gaamaafi\n" +
            "Mo'aabii si baasee Beeteel si galchuuf\n" +
            "\n" +
            "Maatti koo ajjeesee ana maaf na dhiisee\n" +
            "Saba ormaa keessaatti kophaa na hin hambisnee\n" +
            "Biyya alagaa keessatti eenyut jaalatama\n" +
            "Dhugaatu dhokatee sobaan hamatamaa\n" +
            "\n" +
            "Waaqayyoo seena kee gaaf tokko yaadata\n" +
            "Tasuma si hin gatu inni si duukaa kaatu\n" +
            "Ka'iiti adeemi gara Beeteelitti\n" +
            "Kan harka kee qabdu Ruut siduukaa jirti\n" +
            "\n" +
            "Jireenyi koo hundi natti dukkanaa'ee\n" +
            "Baay'adhe baaheetan harka duuwwaan ta'ee\n" +
            "Halkan guyyaan boo'a iji koo imimmaani\n" +
            "Ormoota giddutti kophaa ta'uudhaanii\n" +
            "";

    String mezmurTitle = "116. Obsi ni darba";

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