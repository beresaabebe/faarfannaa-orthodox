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

public class YooTureeyyuu extends Fragment {

    String content = "Yoo tureeyyuu fagatee guyyaansaa\n" +
            "Abdiin koo si'i  Situ naaf dabarsaa\n" +
            "Sin eeggaadha Obsaan Imimmaan koo roobsaa(2)\n\n" +
            "Yoo tureeyyuu Gooftaa kan dursu jiru\n" +
            "Kiyyoo diina kootis isaa  narra ciruu\n" +
            "Harka kee galfadhuu jireenya koo keessa\n" +
            "Eelshaadayiidha ati hundaa ni dandeessa\n\n" +
            "Nan dhufa mana kee dandii kee qabadhee\n" +
            "Cubbuu koo duranii hundaasaa dagadhee\n" +
            "Jecha kee dhaagaheen dhisee waan jallinaa\n" +
            "Tolummaa keef jettee dhaabbatte na cinaa\n\n" +
            "Gaaffiin deebii dhabee yoo turees barrisaa\n" +
            "Si malee yaa Gooftaa eenyuu naa deebisaa?\n" +
            "Yakka koo ilaaltee natti hin baatu haaloo\n" +
            "Haadha keeti jeedhi naa yaadhu maaloo\n";

    String title = "Yoo tureeyyuu";

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