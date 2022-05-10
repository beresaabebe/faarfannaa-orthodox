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

public class UraaeelErgamaa extends Fragment {

    String content = "Uraa'eel Ergamaa koottu nu gargaarii\n" +
            "Rakkoo Addunyaarra maaloo nu baraarii(2)\n\n" +
            "Kennaa qabda ati akka nu gargartuu\n" +
            "Maaloo Uraa'eel dafiitii nuuf koottuu\n" +
            "Nuto oli jennee maqaa kee waammanna\n" +
            "Gocha kee hundumaaf si galateeffannaa\n\n" +
            "Xoofoon kee Uraa'eel  Beekumsa qabaa\n" +
            "Gochaan gargaarsa kees bayyee ajaa'ibaa\n" +
            "Dheebonneto jirra  Uraa'eel nu yaadadhuu\n" +
            "Xoofoo keetin koottu nutin nu Obaafadhuu\n\n" +
            "Qulqullicha Izraa akkumaa gargaartee\n" +
            "Kadhannaa keetin nutis nuu yaadattee\n" +
            "Gara keetti iyyannee humna argannee\n" +
            "Angoo diinaatirraa jabiinaan ejjennee\n\n" +
            "Dhiigaa Gooftaa xoofoon ati qeensitee\n" +
            "Addunyaa guutuu ittiin qulqulleesitee\n" +
            "Hundii keenyaa  isaan Qulqulloofnee\n" +
            "Koottu Uraa'eel jennee si waamannee\n";

    String title = "Uraa'eel Ergamaa";

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