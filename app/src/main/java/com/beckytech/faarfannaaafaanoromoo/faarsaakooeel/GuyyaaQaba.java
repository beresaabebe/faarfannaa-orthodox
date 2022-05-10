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

public class GuyyaaQaba extends Fragment {

    String content = "Guyyaa qaba kan kee guyyaa san alatti maaltu ta'a\n" +
            "Yeroo qaba Gooftaa yeroo keen alatti maaltu ta'a\n" +
            "Barruu keerraa kan dhufee guutee irraa hafaa\n" +
            "Galanni koo kanaaf hundumaaf hangafaa\n\n" +
            "Guyyaa qaba kan kee  Galmee jireenyaa koo\n" +
            "\"\"            \"\"              si'in haareeffame\n" +
            "\"\"            \"\"              Duuti koo haqamee\n" +
            "\"\"            \"\"              jireenyaf waamamee\n" +
            "Jaalala kan keen jiruu koo booji'itee\n" +
            "Mana kee keessatti oli na fudhatee\n\n"+
            "Guyyaa qaba kan kee Tiksee hoolotaa dha\n" +
            "\"\"            \"\"              bakkee keessan joraa\n" +
            "\"\"            \"\"              ati naa tuffannee\n" +
            "\"\"            \"\"              akka nama taatee\n" +
            "Laphee gaddi guutee gammachuti jijjiirtaa\n" +
            "Isaa cabee Dhufee barruu keen faayyistaa\n\n" +
            "Guyyaa qaba kan kee Ati Turtee hin haftuu\n" +
            "\"\"            \"\"              Gonka nama gattuu\n" +
            "\"\"            \"\"              Yeroo kee eeggatteeti\n" +
            "\"\"            \"\"              Gooftaa kan naaf dhuftuu\n\n" +
            "Kattaa laphee koo jechaa keen cabstee\n" +
            "Sagaleen kee guddaan naa jajjabeessite\n";

    String title = "Guyyaa qaba kan kee";

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