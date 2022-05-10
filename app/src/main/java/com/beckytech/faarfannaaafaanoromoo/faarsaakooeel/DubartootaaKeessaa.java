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

public class DubartootaaKeessaa extends Fragment {

    String content = "Dubartootaa keessaa filataamtee\n" +
            "Kennaa waaqayyoo kan argattee\n\n" +
            "Gammadi yeroo hundumaa(2)\n" +
            "Yaa Maariyaam Yaa Giiftii koo\n" +
            "Abdiin Keenya Sumaa\n\n" +
            "Fannoo jalatti nuuf kennamtee\n" +
            "Haadha hundaf taatee argamtee\n" +
            "Waaqa uuman kan Eebbifamtee(2)\n" +
            "Yaa Durboo Iyyesuus nuuf laattee\n\n" +
            "Sanyii qulqulluu irraa Dhalattee\n" +
            "Uumamaa hundarraa filatamtee\n" +
            "Maariyaamii yaa haadha Gooftaa(2)\n" +
            "Cubbuu keenyaf situ nuf kadhataa\n\n" +
            "Gadamessi kee qulqulluudhaa\n" +
            "Kan Ati Deessee Fayyisaadhaa\n" +
            "Gooftaa Adoonaay Abidda baattee(2)\n" +
            "Ifa Addunyaa nutin nu badhaastee\n";

    String title = "Dubartootaa keessaa filataamtee";

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