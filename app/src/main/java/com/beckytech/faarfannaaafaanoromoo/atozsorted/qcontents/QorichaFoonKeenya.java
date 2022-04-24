package com.beckytech.faarfannaaafaanoromoo.atozsorted.qcontents;

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

public class QorichaFoonKeenya extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Qoricha foon keenya\n" +
            "Haadha lubbuu keenya\n" +
            "Maariyam( 2) Burqitu jireenya\n" +
            "Maariyam (2) haadha uuma keenya\n" +
            "\t\tCeesisa\n" +
            "Haadho ergamoota giiftii qulqulloota\n" +
            "Waa'ee cubbuu keenyaaf nuf kadhadhu Gooftaa\n" +
            "Nuu dagatain maariyam nuto sitti boonya\n" +
            "Kadhanna keen durbee bakka yaadne geenya\n" +
            "\t\tCeesisa\n" +
            "Durboota hunda kessa ati kan eebbifamte\n" +
            "Gammadi yaa maariyaam kennaan kan guutamte\n" +
            "Umaa samiif dachee garaa keeti baattee\n" +
            "Fayyina namootaf sababa kan taatee\n" +
            "\t\tCeesisa\n" +
            "Ergamoonni sami si galateeffatu\n" +
            "Qulqulleetti jechuun maqaa kee faarfatu\n" +
            "Nuti si faarfarsina waadaa fayyinaati\n" +
            "Kennaa faannoo jala kan nama hundamati\n" +
            "\t\tCeesisa\n" +
            "Haadha saba hunda durbee maariyaamii\n" +
            "Ayyaana qabeettii Giiftii aariyaamii\n" +
            "Galata keef kaane nuto ni dhaabanna\n" +
            "Ati nuuf kadhadhu maariyaam sii waamna\n";

    String mezmurTitle = "Qoricha foon keenya";

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