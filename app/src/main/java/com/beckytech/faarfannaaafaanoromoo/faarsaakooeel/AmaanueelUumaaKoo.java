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

public class AmaanueelUumaaKoo extends Fragment {

    String content = "Amanu’eel uumaa koo eenyuut madaalaa\n" +
            "Mootii moototati hundumaa caalaa\n" +
            "Isaa Abbaan nagaa Abbaan jaalalaa\n" +
            "Ija Gaarummaanii isaa nuu ilaalaa\n\n" +
            "Ilma waaqayyoodha jiraata baranii\n" +
            "Daandiin qulqullumma isuma karaanii\n" +
            "Hoolaa qaraniyoo qorichaa Addunyaa\n" +
            "Isatu qalamee bakka cubbuu keenyaa\n\n" +
            "Du’a bara baraa nu irraa fudhatee\n" +
            "Ofiisaa reebame jireenya nuuf laate\n" +
            "Olmaan isaa baay’eedha nurraa qaba gatii\n" +
            "Mee galateeffadhaa dammaqaa ka’aatti\n\n" +
            "Gooftaan hundaa beeka hundumaa madaale\n" +
            "Takka nu hin ifannee cubbuu keenya ilaalee\n" +
            "Badii keenyaaf jedhee nuuf ka’eerra gaabbii\n" +
            "Cufameera kunoo eega manni adabbii\n\n" +
            "Tollii isaa baay’atee laphee kiyya cabsee\n" +
            "Kanafan waa’ee isaa addunyaadhaf labsee\n" +
            "Galata galchinaaf fuulasaa duraatti\n" +
            "Ulfaata Teessoosaa ariyaamii irraatti\n";

    String title = "Amanu’eel uumaa koo eenyuut madaalaa";

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