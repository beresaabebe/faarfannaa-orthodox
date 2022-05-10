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

public class HinKutuFannooKoo extends Fragment {

    String content = "Hin kutu fannoo koo\n" +
            "Haa citu mormii koo\n" +
            "Tawaahidoo hin dhiisuu\n" +
            "Diinni koo haa calliisuu.\n" +
            "\nCeesisa\n\n" +
            "Kan kaleessa darbee\n" +
            "Abboota koo argee\n" +
            "Amantaaf jedhanii\n" +
            "Aarsaa kan ta'aani.\n" +
            "Dhugaan natti haa murteessu\n" +
            "Gaafa dhufaatii kee\n" +
            "Yoon si dhiisee adeemee\n" +
            "Tawaahidoo mucaan kee.\n" +
            "\nCeesisa\n\n" +
            "Hin  kennuu kennaa koo\n" +
            "Maariyaam haadha koo\n" +
            "Qulqulloota gooftaa\n" +
            "Diinaa maal na gootaa?\n" +
            "\nCeesisa\n\n" +
            "Qulqulloonni hedduuni\n" +
            "Dhugaadhaaf jedhanii\n" +
            "Addunyaan du'aani\n" +
            "Gooftaadhaan fayyanii.\n" +
            "\nCeesisa\n\n" +
            "Gammoojjii Liibiyaa\n" +
            "Dhiigni samiitti iyyaa\n" +
            "Isaan hunduu gootaa\n" +
            "Jiruu mirga gooftaa.\n" +
            "\nCeesisa\n\n" +
            "Nutii ijoolleen Phaawiloos\n" +
            "Kan qulqulluu Giyoorgis\n" +
            "Fannoo keenya hin kutnuu\n" +
            "Dabarsine hin laannu.\n";

    String title = "Hin Kutu Fannoo Koo";

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