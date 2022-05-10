package com.beckytech.faarfannaaafaanoromoo.faarsaakooeel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Sillaasee extends Fragment {

    String content = "Sillaasee uumaa koo(3) Eyyee\n" +
            "Akka mana Abrahaam(2)\n" +
            "Eebbisi mana koo\n" +
            "Giiftii Maariyaam (3) Eyyee\n" +
            "Na gargaarii Maaloo(2)\n" +
            "Yaa haadha Garramii\n" +
            "Haadha koo Arseemaa (3) Eyyee\n" +
            "Ati naf kadhadhuu(2)\n" +
            "Maaloo yaa haadha koo\n";

    String title = "Sillaasee uumaa koo";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faarsaa_hangaffoota, container, false);

        TextView textView = view.findViewById(R.id.textview);
        textView.setText(content);

        TextView textTitle = view.findViewById(R.id.textTitle);
        textTitle.setText(title);

        return view;
    }

}