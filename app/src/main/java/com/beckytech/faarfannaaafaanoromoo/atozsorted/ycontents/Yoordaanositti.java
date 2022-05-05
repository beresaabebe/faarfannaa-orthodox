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

public class Yoordaanositti extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Yordanositti nuuf cuuphameera (2) \n" +
            "Abbaan ifa baase iccitii tokkummaa \n" +
            "Mucaan Koo kunootii inni jaallatamaa \n" +
            "Addaamiin booji’een kan cabse garbummaa \n" +
            "Mucummaa cuuphaadhaan argamneerra x2\n" +
            "\n" +
            "Arganneerra ……eeyyee ……Arganneerra\n" +
            "Seexanicha……..eeyee………mo’anneerra \n" +
            "Faaruudhaafis….eeyyee… dhaabbanneerra\n" +
            "Halkan dukkanaa’us gooftaan nu ga’eera \n" +
            "Irree keenya ta’ee nutis dhaabbannerra \n" +
            "Cuuphaasaa cuuphamnee diina moonee jira.\n" +
            "\n" +
            "Yordaanoos (2) gammadikaa (2) \n" +
            "Gammadikaa… Eeyyee…… gammadi kaa \n" +
            "Mooticha kee …….eeyyee……. simadhu kaa \n" +
            "Fiigichaa kee … eeyyee…… Rawwadhu kaa \n" +
            "Summii tufi ……eeyyee….. Faarfadhu kaa \n" +
            "Seenaan kee haaromee dhabbadhu farfadhu\n" +
            "Teellatti hin deebi’in gooftaa kee simadhu \n" +
            "Maqaa Iyyasuusiin seenaa haareffadhu \n" +
            "\n" +
            "Cuubbuu addamiin duuneera cuuphaa goftaatiin kaneerra x2\n" +
            "Du’a injifannee baaneerra waanjoon seexanaa cabera  x2\n" +
            "Yordaanos (2) Kan carroomte  x2\n" +
            "Kan carroomte…..eeyyee……Kan carroomte \n" +
            "Dhaala gooftaa …eeyyee…….kan dhabbatte \n" +
            "Raajii daawwit ….eeyyee ….kan raawwatte \n" +
            "Jecha Waaqaa …….eeyyee……. Kan simatt\n";

    String mezmurTitle = "155. Yoordaanositti";

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