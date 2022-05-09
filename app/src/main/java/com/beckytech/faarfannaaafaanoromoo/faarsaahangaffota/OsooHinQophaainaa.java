package com.beckytech.faarfannaaafaanoromoo.faarsaahangaffota;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.beckytech.faarfannaaafaanoromoo.R;

public class OsooHinQophaainaa extends Fragment {

    String content = "Osoon hin qophaa'inaa darbuudhaaf barri koo\n" +
            "Waan gaarii hojjechuu naannoo barsiisaa waaqa koo\n" +
            "Cubbuu koo baayyatee anaafis maal naaf wayya\n" +
            "Kanaaf yeroo hundaa gara keettaan  iyyaa\n\n" +
            "Akka tasaa ta'e guyyaa waamamuu koo\n" +
            "Ati naaf haaromsi bara jireenya koo\n" +
            "Bara ati naaf laatte yeroon natti dhumee\n" +
            "Na qopheessi maaloo lubbuu koofan dhimmee(2)\n\n" +
            "Duuti osoo na mormuu dadhabe humni koo\n" +
            "Akka jaalala keen na dhaabi waaqa koo\n" +
            "Maaloo na yaadadhu guyyaa waamicha kee\n" +
            "Toloota wajjiniin na dhaabi mirga kee (2)\n\n" +
            "Waan gaarii hojjechuuf yommuu ani ka'e\n" +
            "Kajeellaan foon kootii gufuu natti ta'e\n" +
            "Na hiiki waaqa koo ati hidhaa cubbuutii\n" +
            "Seera kee raawwadhee akkan jiraadhuufii (2)\n";

    String title = " Osoon hin qophaa'inaa darbuudhaaf ";

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