package com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents;

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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EebbifamtudhaIsheen extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Eebbifamtudha isheen haatii Amanu'eel(2x)\n" +
            "Ilil jenne faarfannaa nuu haa eebistu isheen\n" +
            "\n\n" +
            "Nagaan siif haa ta'uu araarsiitu keenya\n" +
            "Maariyaam qulqulleetti haadha gooftaa keenya\n" +
            "Hiirkoon dubartootaa gonfoo dubartootaa\n" +
            "Nagaan siif haa ta'uu yaa haadha amantootaa\n" +
            "\n\n" +
            "Abdii cubbamoota cubbamaaf raafamtaa\n" +
            "Kan akka haadha keenya taasa eessatti argama\n" +
            "Qulqullootaa daandii addunyaaf araara\n" +
            "Tsiraa ariyaamitti teessoo waaqayyoodha\n" +
            "\n\n" +
            "Elsaabeet simatte haadha gooftaa jette\n" +
            "Ani cubbamtuudha eessa dhuftee jette\n" +
            "Kan garaashee jiru gammachuu nu ta'ee\n" +
            "Hayyanna durbeedha achumaatti ilaale\n" +
            "\n\n" +
            "Inni eebbifame gadameessaa keessaa\n" +
            "Inno guddaadhaa maaloo eessaa keessaa\n" +
            "Wayyoo raajii gooftaa baay'ee nama dhiiba\n" +
            "Isaa kanas ta'ee garaa keessatti dida\n" +
            "\n\n" +
            "Gooftaan asi dhufuun isa abbaan bara baraa\n" +
            "Heroodos maal ta'ee maaltu isaa maraache\n" +
            "Gooftaa ajeessuudhaaf maaliif hamma yadaa\n" +
            "Kan yaadame hin hafuu ofii isaa baadaa\n";

    String mezmurTitle = "37. Eebbifamtudha isheen";

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