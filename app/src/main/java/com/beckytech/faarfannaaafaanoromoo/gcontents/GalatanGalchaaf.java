package com.beckytech.faarfannaaafaanoromoo.gcontents;

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

import java.util.Optional;

public class GalatanGalchaaf extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Galatan Galchaafii Waaqakoofii\n" +
            "Bultoosaatti Seenee Sagadee Isaafii\n" +
            "Hallee(2) Luyaa Jedhee\n" +
            "Oolmaasaan Dubbadha Wanta Inni Naaf Godhee\n" +
            "\n" +
            "   Jabaadha Waaqayyoo Hundaa Nii Danda'a\n" +
            "   Jecha Sagaleesaan Hundumtuu Nii Ta'aa\n" +
            "   Isaanan Argadhee Nagaa Manakootii\n" +
            "   Alfaadhaaf Omeegaa Inni Abdiikootii\n" +
            "\n" +
            "Afaan leencaa cufee abiddas ni dhaamse\n" +
            "Jiraataa nu godhee du'a keessaa baasee\n" +
            "Mootiin samiif lafaa Gooftaan maal dadhabaa\n" +
            "Qilleessa keessaanis innoo karaa qabaa 《2》\n" +
            "\n" +
            "Bakkeetti gatamee miidhamee qaamnikoo\n" +
            "Calisetoo darbee nalaalee firrikoo\n" +
            "Suphee olnakaasee cabakoos dhidhibee\n" +
            "Galanni isaaf haata'u fuulasaa nadhaabee\n" +
            "\n" +
            "Dhigasaa qulqulluun mallatteeffameeraa\n" +
            "Damee meexxii qaphee galataaf ka'eeraa\n" +
            "Sagalee moo'ichaan nanwaama maqaasaa \n" +
            "Bara jireenya koon dubbadha waa'eesaa\n";

    String mezmurTitle = "Galatan galchaaf";

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

    private void initUI() {
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setIcon(R.drawable.ic_launcher_foreground);
        mActionBar.setDisplayShowCustomEnabled(true);
        mActionBar.setCustomView(R.layout.custom_actionbar_layout);
        mActionBar.setTitle("Abbaafi Ilma");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0A6E73"));
        mActionBar.setBackgroundDrawable(colorDrawable);
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.no_anim,R.anim.slide_in_bottom);
        finish();
    }
}