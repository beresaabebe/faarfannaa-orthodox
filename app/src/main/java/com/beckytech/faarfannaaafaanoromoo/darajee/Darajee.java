package com.beckytech.faarfannaaafaanoromoo.darajee;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;

public class Darajee extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {"Afaan keenyaa hin qabu",
            "Haadha gaafa rakkoo",
            "Haadha koo",
            "Ilil jedhaafi faarfaadhaafi",
            "Itiyoophiyaa",
            "Iyyeluuxaaf qirqoos",
            "Iyyesuus gooftaa koo",
            "Jawwichi na nyaachuuf",
            "Madaa garaa koo",
            "Nuuf golgi qullaa",
            "Qulqulluu mikaa'eel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarfataa Darajee");

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(Darajee.this, AfaanKeenyaaHinQabu.class));
                    break;
                case 1:
                    startActivity(new Intent(Darajee.this, HaadhaGaafaRakkoo.class));
                    break;
                case 2:
                    startActivity(new Intent(Darajee.this, HaadhaKooD.class));
                    break;
                case 3:
                    startActivity(new Intent(Darajee.this, IlilJedhaafiFaarfaadha.class));
                    break;
                case 4:
                    startActivity(new Intent(Darajee.this, Itiyoophiyaa.class));
                    break;
                case 5:
                    startActivity(new Intent(Darajee.this, IyeeluxaafiQirqoos.class));
                    break;
                case 6:
                    startActivity(new Intent(Darajee.this, IyyesuusGooftaaKoo.class));
                    break;
                case 7:
                    startActivity(new Intent(Darajee.this, JawwichiNaNyaachuuf.class));
                    break;
                case 8:
                    startActivity(new Intent(Darajee.this, MadaaGaraaKoo.class));
                    break;
                case 9:
                    startActivity(new Intent(Darajee.this, NuufGolgiQullaa.class));
                    break;
                case 10:
                    startActivity(new Intent(Darajee.this, QulqulluuMikaaeel.class));
                    break;
            }
        });
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