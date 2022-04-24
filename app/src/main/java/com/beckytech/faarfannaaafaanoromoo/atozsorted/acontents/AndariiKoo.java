package com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents;

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

public class AndariiKoo extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Andarii koo(2) Maariyaam Hirkoo koo\n" +
            "Sin Abdadhaa gammadees guyyaa gadda koo\n" +
            "\tCeesisa\n"+
            "Yeemmuun yaadadhu olmaa kee na dursee imimmaan koo\n" +
            "Ilma ke baate na fidee amma har'aatti harmee koo\n" +
            "Utuu ati na badhaasne Iyyesuus deesse Abbaa Koo\n" +
            "Eenyuttan waammama hin beekkamu lamummaan koo\n" +
            "\tCeesisa\n"+
            "Haadha nagaa nageenyaa ilmi kee\n" +
            "Ulee Aroon hin badu sanyiin kee\n" +
            "\tCeesisa\n"+
            "koottu Koottu gugee koo garraamii koo\n" +
            "Qalama warqeen adaraa naaf barreessi maqaa koo\n" +
            "Ummatootaa ol teessaa uumaa kee gad jirtaa\n" +
            "Jedheen amana soda malee yaa haadha koo\n" +
            "\tCeesisa\n"+
            "Haadha nagaa nageenyaa ilmi kee\n" +
            "Ulee Aroon hin badu sanyiin kee\n" +
            "\tCeesisa\n"+
            "Deemsi koo fagoodha gaarrisaa natti cimee\n" +
            "Ilma kee naaf kadhuu adaara eega na hin nuffiin mee\n" +
            "Akkan mul'adhee hin bannee akka abaaboo birraa\n" +
            "Eebba kee naaf ergi al takkaa samiirraa\n" +
            "\tCeesisa\n"+
            "Haadha nagaa nageenyaa ilmi kee\n" +
            "Ulee Aroon hin badu sanyiin kee\n" +
            "\tCeesisa\n"+
            "Coba jalattan biqile hin fedhan guddina koo\n" +
            "Gaddisni kee na golginaan na hin argu diinni koo\n" +
            "Surraan kee simboo koo siinaan miidhagaa\n" +
            "Waanan hin sobne si haagi koo nagaa\n" +
            "\tCeesisa\n"+
            "Haadha nagaa nageenyaa ilmi kee\n" +
            "Ulee Aroon hin badu sanyiin kee\n";

    String mezmurTitle = "8. Andarii koo";

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
            startActivity(Intent.createChooser(intent,"Share mezmur via "));
        });

    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}