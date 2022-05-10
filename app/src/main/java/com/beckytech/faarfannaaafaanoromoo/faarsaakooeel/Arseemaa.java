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

public class Arseemaa extends Fragment {

    String content = "Arseemaa wareegamtuu arseemaa\n" +
            "Arseemaa qulqulleetti arseemaa\n" +
            "Si waamannaa yeroo hundumaa(2)\n\n" +
            "Arseemaa dargagummaa keen\n" +
            "\"\"     \"\"      filattee dhiphinaa\n" +
            "\"\"     \"\"     dhugaa bahuudhaan\n" +
            "\"\"     \"\"     fudhattee rakkinaa\n" +
            "\"\"     \"\"     si gannee gooftaanis\n" +
            "\"\"     \"\"     siif ta'ee gaachanaa\n\n" +
            "Arseemaa dhalattu roomaadha\n" +
            "\"\"     \"\"     kan baatee biyyaa\n" +
            "\"\"     \"\"     amantaa keetif\n" +
            "\"\"     \"\"     deemte  armaaniyaa\n" +
            "\"\"     \"\"    uffatte moo'annaa\n" +
            "\"\"     \"\"     akkuma wayyaa\n\n" +
            "Arseemaa mootota biyya lafaa\n" +
            "\"\"     \"\"     hundaasan moo'attee\n" +
            "\"\"     \"\"     amantaa dhugaadhaf\n" +
            "\"\"     \"\"     foonin wareegamtee\n" +
            "\"\"     \"\"     afuura qulqulluun\n" +
            "\"\"     \"\"     waadaa kan argattee\n\n" +
            "Arseemaa kakuun qabdu addaa\n" +
            "\"\"     \"\"     gophaa qajeelchiitaa\n" +
            "\"\"     \"\"     bishaan maqaa keeti\n" +
            "\"\"     \"\"     fayyinaa namaaf laata\n" +
            "\"\"     \"\"     dhaloonnii eebbifamoo\n" +
            "\"\"     \"\"     kanaaf si waammataa\n" +
            "========\u0095|\u0095=========\n";

    String title = "Arseemaa wareegamtuu arseemaa";

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