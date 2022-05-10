package com.beckytech.faarfannaaafaanoromoo.faarsaaKeeber;

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

public class HumnaWaaqaafSafuu extends Fragment {

    String content = "Anoo bayyeen yaadda'e hin bari'u jedhee\n" +
            "Lukkuun barii jala yeroo iyyuu didee\n" +
            "Dukkaanni dheeratuus bari'uun isaa hin hafu\n" +
            "Yeroo eegee dabarsee humna Waaqaaf safuu.\n" +
            "\n\n" +
            "Beeluu fi dheebuun narratti wal jijjiiree\n" +
            "Abdii na kutachiisuuf diinnikoo na qoree\n" +
            "Yeroo hundaan bo'aa godoonko gaddaan guute\n" +
            "Nattii dukkaana'ee lubbuunkoo dhiphatte.\n" +
            "\n\n" +
            "Inni fira qabu rakkoo issa isaanitti himataa\n" +
            "Yeroo rakkoon dheeratu walitti baqataa\n" +
            "Ani si qofaan qaba Iyyasuus Gooftaakoo\n" +
            "Firakoo naaf dursii koottuka garakoo.\n" +
            "\n\n" +
            "Waanjoon gabrummaa narratti dheeratuus\n" +
            "Mootichi inni hamaan gidiraa nutti cimsuus\n" +
            "Imimmaan ijoolleesa Waaqayyo hin dagatu\n" +
            "Bilisa na baastee Gooftaa si haa galatuu.\n" +
            "\n\n" +
            "Olka'uu dadhabee rakkoon natti wal jijjiiree\n" +
            "Ifa fayyiina hawwee yeroon hiraaree\n" +
            "Halkan walakkaa ifa ibsachuuf jedhee\n" +
            "Waaqayyotu keessa hin jiru kanaaf ifuu dide.\n" +
            "\n";

    String title = "Humna Waaqaaf Safuu";

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