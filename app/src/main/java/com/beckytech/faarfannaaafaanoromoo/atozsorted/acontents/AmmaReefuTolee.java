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

public class AmmaReefuTolee extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Amma/2/reef  tolee eeyyee amma reef tolee\n" +
            "Amma /2/ reef tolee eeyyee\n" +
            "Waaqayyootu nuu lole eeyyee amma reef                                                                                                        \n" +
            "Amma/2/reef tolee amma reef tolee \n" +
            "Maariyaamiitu nuuf tolee  eeyyee\n" +
            "\n" +
            "Amma/2/reef tolee eeyyee …ammaa reef tolee\n" +
            "Mikaa’eeltu nuuf lole eeyyee.    “\n" +
            "Gabri’eeltu nuuf lolee      “\n" +
            "Uraa’eeltu nuuf lolee     “\n" +
            "Uraa’eeltu nuuf lolee     “\n" +
            "Raagu’eeltu nuuf lolee   “\n" +
            "Ergamoota nuuf lole\n" +
            "Ijoollee isaatti tolee\n" +
            "Diina keenyaa  wallolee\n" +
            "Seexaanootatu  wallolee\n" +
            "\n" +
            "Amma(2)gaariidhaa eeyyee… ammaa gaariidhaa\n" +
            "Ijoollee  isaaf gaariidha \n" +
            "Garee keenyaaf gaariidha \n" +
            "Diina keenyaaf aariidhaa\n" +
            "Warra hin beekneef aariidhaa\n" +
            "Seexaanootaaf aariidhaa.\n" +
            "\n" +
            "Amma(2) bareedee eeyyee… amma bareedee\n" +
            "Ijoollee isaatu bareedee\n" +
            "Diina keenyaatu wallolee\n" +
            "Iyyasuusiin qabannee\n" +
            "Maariyaamiin qabannee\n" +
            "Qulqullootaas  qabannee\n" +
            "\n" +
            "Qabna(2)…Amantii eeyyee qabna amantii\n" +
            "Tewaahidoo jedhamtii eeyyee\n" +
            "Qabna(2)…haadhasii eyyee qabna haadhasii\n" +
            "Haadha Gooftaa Iyyasuusii\n" +
            "Qulqulleettiis haadhasii\n" +
            "Haadha Gooftaa jedhamtii\n";

    String mezmurTitle = "6. Amma Reefu Tolee";

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