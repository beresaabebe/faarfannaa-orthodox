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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AlfaafiOmeegaaActivity extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Alfaa fi omeegaa waaqayyodha maqaan kee\n" +
            "Jalqabaf dhuma hin qabu barri jireenya ke   " +
            "Mootummaa keerra baraan ni jiraatta      \n " +
            "Siif laanna gooftaa aarsaa galataa\n" +
            "\tCeesisa\n"+
            "Baroota jijjiirta ati hin jijjiiramtu  \n " +
            "Angoof humna keetiin hunda kan raawwattu\n" +
            "Baraan ati ya waaqa sanuma\n" +
            "Dorgomaa hin qabdu gooftaa tasumaa\n" +
            "\tCeesisa\n"+
            "\t Kaasnee baganaa Masanqoo\n" +
            "\t Qabanneerra tsanaatsilii Kabaroo\n" +
            "\tHunduu sillaaseedhaaf galata dhiyeessina\n" +
            "\t Uumamni martuu isaaf jilbeeffana(2)\n" +
            "\tCeesisa\n"+
            "Hunduu siif bitama siif abboomama\n" +
            " Uumamni martinuu guddummaa kee hima\n" +
            "Laftiif samiin hojii harka keetii\n" +
            "Waaqa waaqotaa mootiidha ati\n" +
            "\tCeesisa\n"+
            "\tKaasnee baganaa masanqoo\n" +
            "\tQabanneerra tsanaatsili Kabaroo \n" +
            "\tHunduu sillaaseedhaaf galata dhiyeessina\n" +
            "\t Uumamni martuu isaaf jilbeeffana(2)\n" +
            "\tCeesisa\n"+
            "Waaqota jedhamuun kan waaqeffaman\n" +
            "Burkutaa’aiiru har’a  iddoo hin jiran\n" +
            "Ati garuu baraan ni jiraatta\n" +
            "Siif laanna gooftaa aarsaa galataa\n" +
            "\tCeesisa\n"+
            "\tKaasnee baganaa masanqoo \n" +
            "\tSi qofaadha hundaa kan danda’u\n" +
            "\tMaqaa keetiif galanni haa ta’u \n";

    String mezmurTitle = "4. Alfaafi Omeegaadha";

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
            startActivity(Intent.createChooser(intent,"Share mezmur via "));
        });

    }


    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}