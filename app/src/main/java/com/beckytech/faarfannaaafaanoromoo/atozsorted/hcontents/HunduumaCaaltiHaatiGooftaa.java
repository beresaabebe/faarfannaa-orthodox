package com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents;

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

public class HunduumaCaaltiHaatiGooftaa extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Hunduu dhaga’aa yaa namootaa \n" +
            "Hundumaa caaltii haatii gooftaa \n" +
            "Yaa namootaa eeyyee Yaa namootaa \n" +
            "Hundaa caaltii “\n" +
            "Haati gooftaa “ \n" +
            "Ni kadhattii “ \n" +
            "Cubbamoota “ \n" +
            "Ni dhaabbattis “ \n" +
            "Mirga gooftaa “ \n" +
            "Uumamarraa eeyyee \n" +
            "Hundaa caaltii “ \n" +
            "Waqaa umaan “ \n" +
            "Filaatamtee “ \n" +
            "Ergaamotaan “ \n" +
            "Kabaajamtee                   “    \n" +
            "Amaanu’eel “ \n" +
            "Gooftaa baattee “ \n" +
            "\n\n" +
            "Araarsitudhaa Maariyaamii (2) \n" +
            "Hirkoo dhugaa eeyyee\n" +
            "Kan faayyinaa “\n" +
            "Maariyaamii “\n" +
            "Si faarsinaa “ \n" +
            "Cubbuun keenyaa “ \n" +
            "Bay’ateeraa “ \n" +
            "Nuuf kadhaadhuu “ \n" +
            "Ilmaa keerraa “ \n" +
            "\n\n" +
            "Mirga gooftaa eeyyee \n" +
            "Kan dhaabattuu “ \n" +
            "Cubbamootaaf “\n" +
            "Kan kadhattuu “ \n" +
            "Warqee uffattee “ \n" +
            "Kan dhaabattuu“ \n" +
            "Yaa harmee koo“ \n" +
            "Mee nuuf koottuu“ \n" +
            "\n\n" +
            "Warri Maariyaam ganaanii \n" +
            "Boodde maal ta’aa dhumni isaanii \n" +
            "Abiddichaan eeyyee\n" +
            "Ni nyaataamuu “ \n" +
            "Si’oolittii “ \n" +
            "Ni gatamuu “ \n" +
            "Daabiloosiin “ \n" +
            "Fudhaatamuu “\n" +
            "Hin fayyanii “ \n" +
            "Isaan yoomu “ \n" +
            "\n\n" +
            "warri Tsihoon jibbanii \n" +
            "milaa isheetti haa kufaanii \n" +
            "Gara durbee                     eeyyee \n" +
            "Haa dhufanii “ \n" +
            "Millaasheettii “ \n" +
            "Haa kufaanii “ \n" +
            "Booda hin gaabbuu “ \n" +
            "Hundi isaanii “ \n" +
            "Garuu hin faayyuu “ \n" +
            "Yoo kufaanii “ \n" +
            "\n\n" +
            "Warrii Maariyaam kabajanii ni\n" +
            "eebbifamaa dhumni isaanii \n" +
            "Haadhaa goftaa eeyyee \n" +
            "Ni kabajnaa “ \n" +
            "Mariyaamis “\n" +
            "Ni jaallannaa “ \n" +
            "Maqaa ishees “ \n" +
            "Ni farfannaa “ \n" +
            "Galata isheef “ \n" +
            "Ni dhabannaa “ \n" +
            "\n\n" +
            "Kanaaf Mariyamii ni jaallaanaa(4) \n" +
            "Ni jaalannaa eeyyee \n" +
            "Ni jaalannaa “ \n" +
            "Harmee dhugaa “ \n" +
            "Ishee qabnaa “ \n" +
            "Tewaahidoon “ \n" +
            "Maal sodannaa “ \n" +
            "Mariyaamii “ \n" +
            "Abdii qabnaa“\n";

    String mezmurTitle = "Hunduuma caalti haati gooftaa";

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