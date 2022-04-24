package com.beckytech.faarfannaaafaanoromoo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainHomeActivity extends OptionsMenuActivity {

    ListView listView;
    String[] title = {"Faarsaa Tartiiban bakka tokkootti"};

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
                startActivity(new Intent(MainHomeActivity.this, MainActivity.class));
            }
        });
    }
}