package com.beckytech.faarfannaaafaanoromoo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.beckytech.faarfannaaafaanoromoo.adaanee.AdaaneeAsraat;
import com.beckytech.faarfannaaafaanoromoo.darajee.Darajee;
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
            "Faarsaa Ergamoota",
            "Faarsaa Gaabbii",
            "Faarsaa Gooftaa",
            "Faarsaa Hangaffaa Faarfattoota",
            "Faarsaa Oromiffaan Amariffaa",
            "Faarsaa Tartiiban bakka tokkootti",
            "Faarsaa Tawaahidoo",
            "Faarsaa Yeroo Adda Addaa",
            "Faarsaa Yeroo Ayyaana",
            "Faarsaa Yeroo Ciidhaa",
            "Faarsaa Yeroo Cuuphaa",
            "Faarsaa Yeroo Dhaloota Gooftaa",
            "Faarsaa Yeroo Du’aa Ka’umsaa",
            "Faarsaa Yeroo Fannoo",
            "Faarsaa Yeroo Hundaa",
            "Hiikaa Bultii",
            "Keebar Tesfaa",
            "Koo’eel Shawaa"
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



            if (i == 13) {
                startActivity(new Intent(MainHomeActivity.this, MainActivity.class));
            }
        });
    }
}