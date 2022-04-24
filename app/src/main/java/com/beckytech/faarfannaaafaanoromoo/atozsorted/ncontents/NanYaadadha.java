package com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents;

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

public class NanYaadadha extends OptionsMenuActivity {

    TextView textView, textTitle;
    FloatingActionButton fabShare;
    String mezmur = "Nan yaadadhaa hin dagadhu \n" +
            "Garaa kamiin irraanfadhu\n" +
            "Jaalala keef umuriin koo \n" +
            "Arsa ta'u imimmaan koo(2)\n" +
            "\t\tCeesisa\n" +
            "Biyyaa keessumumma dhuftee\n" +
            "Seerri kam keef Aarsa taatee\n" +
            "Jaalala keef kiyyeefamee\n" +
            "Ani bahu sitti naa waamee\n" +
            "\t\tCeesisa\n" +
            "Sooli hoomin kan ergamee\n" +
            "Fayyinaa koof kan waamamee\n" +
            "Harki kufnaan oli naa kaase\n" +
            "Imimmaanin dhiiga mirgisee\n" +
            "\t\tCeesisa\n" +
            "Dhahannan koo olmaa isaaf\n" +
            "Imimmaan koo galataaf\n" +
            "Qaroon kan koo yoo cufamtee\n" +
            "Dura kootti mallateefamtee\n" +
            "\t\tCeesisa\n" +
            "Har'a argee hubadheera\n" +
            "Harki isaa naaf araaraa\n" +
            "Gaarri kan koo dirree ta'ee\n" +
            "Situ duursee naaf ka'ee\n";

    String mezmurTitle = "109. Nan yaadadha hin dagadhu";

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