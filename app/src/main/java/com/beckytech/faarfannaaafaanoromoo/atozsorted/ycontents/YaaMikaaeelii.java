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

public class YaaMikaaeelii extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;

    String mezmur = "Yaa Mikaa’eel (2)  hangafa ergamootaa \n" +
            "Cubbuu keenyaan kufnee akkaa hin hafneef \n" +
            "Ati nuu gargaarii nu siwaammannee \n" +
            "\n" +
            "Qomoo yaa’oqoob…………….…. Mikaa’el \n" +
            "Israa’eeliif ……………………….. Mikaa’el\n" +
            "Sii eegduun saanii …………….…. Mikaa’el\n" +
            "Kan gargaaredhaa ……………….. Mikaa’el\n" +
            "\n" +
            "Jaalaala nuuf kennii nageenyaa \n" +
            "Yaa Mikaa’eelii Abbaakeenya \n" +
            "Wayyaan kee warqii ………..…….Mikaa’el \n" +
            "Fuulii kee ifaa ……………….. Mikaa’el\n" +
            "Aangoo qabeessaa………………Mikaa’el\n" +
            "Garaa laafessa………………….... Mikaa’el\n" +
            "\n" +
            "Jaalaala nuuf kennii nageenyaa \n" +
            "Yaa Mikaa’eelii Abbaakeenya \n" +
            "Fakkiikee duraa……………….… Mikaa’el\n" +
            "An nan dhaabbadhaa ………….…Mikaa’el\n" +
            "Rakkoo koo hundaa ……….…Mikaa’el\n" +
            " Sittaan himadha    …………….… Mikaa’el\n" +
            "\n" +
            "Jaalaala nuuf kennii nageenyaa \n" +
            "Yaa Mikaa’eelii Abbaakeenya \n" +
            "Na hin daagaatin jedhee ……..….Mikaa’eel \n" +
            "Ani siin dagadhu…………….…. Mikaa’el\n" +
            "Hangaafa ergamootaa……………Mikaa’el\n" +
            "Qulqulluu Mikaa’eel ……………Mikaa’el\n" +
            "Hangaafa ergamotaa ………….…Mikaa’el\n" +
            "\n" +
            "Jaalaala nuuf kennii nageenyaa \n" +
            "Yaa mikaa`eel abbaa keenyaa\n";

    String mezmurTitle = "149. Yaa Mikaa'eelii";

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