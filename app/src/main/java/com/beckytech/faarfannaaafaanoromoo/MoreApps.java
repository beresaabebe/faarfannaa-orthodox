package com.beckytech.faarfannaaafaanoromoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MoreApps extends OptionsMenuActivity {

    ImageView faarfannaa, galataMaariyaam, galatooBarumsaa, wollega;
    TextView textView;
    String about = "<p style='text-align:justify'>App'n ani kanan dura hojjedhee akkasumas tola " +
            "bufaachun itti fayyadamu ni dandeessu. kanneen Google play irratti gad lakkifamanirruu kanneen kannis" +
            "bakka biroo irraa kan jiran garuu isiin fayyaduu waan ta'eef itti fayyadama.</p><br>" +
            "<b> Download apps by the same developer.</b>";

    String title = " More apps ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_apps);

        initUI(title);

        textView = findViewById(R.id.textAboutApps);
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N) {
            textView.setText(HtmlCompat.fromHtml(about, HtmlCompat.FROM_HTML_MODE_COMPACT));
        }
        else {
            textView.setText(Html.fromHtml(about));
        }

        faarfannaa = findViewById(R.id.imageViewFaarfannaa);
        faarfannaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
                Intent  intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        galataMaariyaam = findViewById(R.id.imageViewGmaariyaam);
        galataMaariyaam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.mediafire.com/file/cyglsztsy4qq1wp/Galata_Maariyaam_v1.1.apk/file";
                Intent  intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        galatooBarumsaa = findViewById(R.id.imageViewGalatooBarumsaa);
        galatooBarumsaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.beckytech.galatoofibarumsaa";
                Intent  intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        wollega = findViewById(R.id.imageViewWollega);
        wollega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.mediafire.com/file/9dfaystiz2x4txo/Wollega_University.apk/file";
                Intent  intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}