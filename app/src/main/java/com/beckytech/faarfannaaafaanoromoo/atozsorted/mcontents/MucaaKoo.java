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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MucaaKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Lakki yaa mucaa koo maalif naa baqataa\n" +
            "Naa jalati baate kan diina maaf taata      \n" +
            "\n\n" +
            "Kuno ani siif jira Abbaan Lubbuu keeti\n" +
            "Anarraa baqate eessaa dhaquu keeti\n" +
            "Anu siifan Kennaa dhadhabata kooti\n" +
            "Annarra hin baqatin ati mucaa kooti         \n" +
            "\n\n" +
            "Ano siin jijjiira bar tokko seenaa kee\n" +
            "Ano naan dhaabadha dhufeetan bukke kee\n" +
            "Nan dhadhabee jette abdii hin kutatinii\n" +
            "Anu siin jabeessaa hooma hin yaada'inii      \n" +
            "\n\n" +
            "Biyyii lafa kuni isheen ni dabarti\n" +
            "Tolchiti naqaphuu ani dahoo keeti\n" +
            "Maalumaaf raafamta maaloo yaa mucaa koo\n" +
            "Ba'aa kee ulfaate fidaadhuu gara koo   \n" +
            "\n\n" +
            "Dandiin ishee qaloodha bayyee itti dhiphatti\n" +
            "Bakkee boqonnaatti qabadhu dandiitti\n" +
            "Kootu sii gameera gali gara Abbaa kee\n" +
            "Ano siin qulleessa dhiqeetan cubbuu kee\n";

    String mezmurTitle = "104. Mucaa koo";

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