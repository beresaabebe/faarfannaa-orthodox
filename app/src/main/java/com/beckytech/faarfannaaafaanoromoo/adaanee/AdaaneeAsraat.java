package com.beckytech.faarfannaaafaanoromoo.adaanee;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;

public class AdaaneeAsraat extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Akka bishaan darbee",
            "An siin eebbifamee",
            "Fayyisuu kee",
            "Foonsaa muree",
            "Guddina kee",
            "Horree bulleerra",
            "Kan akka waaqayyoo",
            "Kennaa guyyaa jimaataa",
            "Kiristoos isumaa",
            "Mikaa'eel naaf dhufee",
            "Qaraniyoo",
            "Tiksee gaariin qabaa",
            "Yaa maariyamii giiftii koo",
            "Yaada keen dubroodha"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Adaanee Asraat");

        listView = findViewById(R.id.list_item);

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, songTitles);
        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(AdaaneeAsraat.this, "You clicked. "+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show());

    }

    static class CustomAdapter extends ArrayAdapter<String> {
        Context context;
        String[] title;

        CustomAdapter(Context context, String[] title) {
            super(context, R.layout.listitem, title);
            this.context = context;
            this.title = title;
        }

        @SuppressLint("SetTextI18n")
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = inflater.inflate(R.layout.listitem, parent, false);
            TextView textView = row.findViewById(R.id.textView1);
            int pos = position+1;
            textView.setText(pos +"." +title[position]);
            return row;
        }

    }
}