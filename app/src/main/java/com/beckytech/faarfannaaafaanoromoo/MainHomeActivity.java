package com.beckytech.faarfannaaafaanoromoo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.beckytech.faarfannaaafaanoromoo.adaanee.AdaaneeAsraat;
import com.beckytech.faarfannaaafaanoromoo.darajee.Darajee;
import com.beckytech.faarfannaaafaanoromoo.durboomaariyaam.FaarsaaDubrooMaariyaam;
import com.beckytech.faarfannaaafaanoromoo.faarsaa2014.FaarsaaAddaa2014;
import com.beckytech.faarfannaaafaanoromoo.faarsaaKeeber.FaarsaaKeeber;
import com.beckytech.faarfannaaafaanoromoo.faarsaaQulqulloota.FaarsaaQulqulloota;
import com.beckytech.faarfannaaafaanoromoo.faarsaaayyaanna.FaarsaaAyyaana;
import com.beckytech.faarfannaaafaanoromoo.faarsaacidhaa.FaarsaaCidhaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaacuuphaa.FaarsaaCuuphaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaadhaloota.FaarsaaDhaloota;
import com.beckytech.faarfannaaafaanoromoo.faarsaaduaa.FaarsaaDuaKaumsaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaaergamoota.FaarsaaErgamoota;
import com.beckytech.faarfannaaafaanoromoo.faarsaafannoo.FaarsaaFannoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.FaarsaaGaabbii;
import com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa.FaarsaaGooftaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota.FaarsaaHangaffoota;
import com.beckytech.faarfannaaafaanoromoo.faarsaahiikaa.FaarsaaHiikaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaakooeel.FaarsaaKooeel;
import com.beckytech.faarfannaaafaanoromoo.faarsaatawaahido.FaarsaaTawaahido;
import com.beckytech.faarfannaaafaanoromoo.faarsaayeroohundaa.FaarsaaYerooHundaa;
import com.beckytech.faarfannaaafaanoromoo.lameen2011.Lameen2011;
import com.beckytech.faarfannaaafaanoromoo.sadaniin2010.Sadaniin2010;
import com.beckytech.faarfannaaafaanoromoo.sadeeniin2010.Sadeeniin2010;
import com.beckytech.faarfannaaafaanoromoo.sadeeniin2012.Sadeeniin2012;

public class MainHomeActivity extends OptionsMenuActivity {

    ListView listView;
    String[] title = {"Adaanee Asraat",
            "Darajee Dhuunfaa",
            "Faarfattoota Lameeniin 2011",
            "Faarfattoota Obbolaa  Sadaniin 2010",
            "Faarfattoota Obbolaa Sadeeniin 2010",
            "Faarfattoota Obbolaa Sadeeniin 2012",
            "Faarsaa Addaa 2014",
            "Faarsaa Dubroo Maariyaam",
            "Faarsaa Ergamoota Qulqulluu",
            "Faarsaa Yeroo sirnaa gaabbii",
            "Faarsaa Galata Gooftaa",
            "Faarsaa Hangaffaa Faarfattoota",
            "Faarsaa Qulqulloota",
            "Faarsaa Tartiiban bakka tokkootti",
            "Faarsaa Ortodooksii Tawaahidoo",
            "Faarsaa Yeroo Ayyaana adda addaa",
            "Faarsaa Yeroo Ciidhaa - Gaa'ila",
            "Faarsaa Yeroo Ayyaana Cuuphaa",
            "Faarsaa Yeroo Ayyaana Dhaloota Gooftaa",
            "Faarsaa Yeroo Ayyaana Du’aa Ka’umsaa",
            "Faarsaa Yeroo Ayyaana Fannoo",
            "Faarsaa Yeroo Hundaa",
            "Faarfata Hiikaa Bultii",
            "Faarfata Keebar Tesfaa",
            "Faarfata Koo’eel Shawaa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI("Faaruu Ortodooksii Tawahidoo");

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, title);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {

            if (i == 0) {
                startActivity(new Intent(MainHomeActivity.this, AdaaneeAsraat.class));
            }

            if (i == 1) {
                startActivity(new Intent(MainHomeActivity.this, Darajee.class));
            }

            if (i == 2) {
                startActivity(new Intent(MainHomeActivity.this, Lameen2011.class));
            }

            if (i == 3) {
                startActivity(new Intent(MainHomeActivity.this, Sadaniin2010.class));
            }

            if (i == 4) {
                startActivity(new Intent(MainHomeActivity.this, Sadeeniin2010.class));
            }

            if (i == 5) {
                startActivity(new Intent(MainHomeActivity.this, Sadeeniin2012.class));
            }

            if (i == 6) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaAddaa2014.class));
            }

            if (i == 7) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaDubrooMaariyaam.class));
            }

            if (i == 8) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaErgamoota.class));
            }

            if (i == 9) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaGaabbii.class));
            }

            if (i == 10) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaGooftaa.class));
            }

            if (i == 11) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaHangaffoota.class));
            }

            if (i == 12) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaQulqulloota.class));
            }

            if (i == 13) {
                startActivity(new Intent(MainHomeActivity.this, MainActivity.class));
            }

            if (i == 14) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaTawaahido.class));
            }

            if (i == 15) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaAyyaana.class));
            }

            if (i == 16) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaCidhaa.class));
            }
            if (i == 17) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaCuuphaa.class));
            }
            if (i == 18) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaDhaloota.class));
            }
            if (i == 19) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaDuaKaumsaa.class));
            }
            if (i == 20) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaFannoo.class));
            }
            if (i == 21) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaYerooHundaa.class));
            }
            if (i == 22) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaHiikaa.class));
            }

            if (i == 23) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaKeeber.class));
            }

            if (i == 24) {
                startActivity(new Intent(MainHomeActivity.this, FaarsaaKooeel.class));
            }


        });
    }
}