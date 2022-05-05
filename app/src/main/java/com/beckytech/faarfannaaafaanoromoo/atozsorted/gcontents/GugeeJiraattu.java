package com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents;

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

public class GugeeJiraattu extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Maariyaam Gugee jiraattuu(2)\n" +
            "Burqaa gogee ati kan ijaartu\n" +
            "Hundee Abootaati dubreen haa jiraattu\n" +
            "Eyyee Durbeen haa jiraattuu\n" +
            "Ceesisa\n" +
            "Karaa nageenyaadha gugee jiraattuu\n" +
            "Boqonnaa Amantaa      \"\"       \n" +
            "Araarsituu hundaa        \"\"    \n" +
            "Raajii Abbootaa              \"\"\n" +
            "Uffanna Ergamoota       \"\"     \n" +
            "Wabii cubbamoota        \"\"     \n" +
            "\n\n" +
            "Maariyaam jechuunii ija hundumaatii\n" +
            "Isheefii sagaduu uumamani hundu martii(2)\n" +
            "Eyyeen Uumamni hundu martii\n" +
            "\n\n" +
            "Kennaa hin banneedha  Gugee jiraattuu\n" +
            "Gulantaa icciitii                \"\"  \n" +
            "Hundee jireenya koo       \"\"     \n" +
            "Yeroomsituu uumamaa   \"\"         \n" +
            "Rakkoo hunda beektu      \"\"       \n" +
            "Jabeessitu hiyyeessa         \"\"    \n" +
            "\n\n" +
            "Raajiichi isaayaasii faarfanna daawitii\n" +
            "Ulfaadhu ittiin jedhuu qulqulloon Abbootii(2)\n" +
            "Eyyee qulqulloon Abbootii\n" +
            "\n\n" +
            "Abdii ijoollee Addaamii Gugee jiraattuu\n" +
            "Lubbuu koo haadha koo   \"\"        \n" +
            "Kennaa dhaala argamte     \"\"      \n" +
            "Jiraadhu Haadha koo          \"\"      \n" +
            "Si waama iccittii koo           \"\"    \n" +
            "\n\n" +
            "Gaaffii hundaa beekta jiraattu gannataa\n" +
            "Haadha keenya taatee ano nan gammadaa(2)\n" +
            "Ano nan gammada\n";

    String mezmurTitle = "64. Gugee jiraattu";

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