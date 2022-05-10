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

public class SiMalee extends Fragment {

    String content = "Si malee maalan qaba maariyaam giiftii koo\n" +
            "Harmee iyyeesusii yaa haadha olmaa koo\n" +
            "Sitti himadhee hedduu darbeeraa\n" +
            "Ammas naaf koottu ani sitti of laadheraa\n\n" +
            "Ano balleesseraa biyya lafarratti\n" +
            "Ajaja uumaa koo hin eegne takkitti\n" +
            "Maariyaam haadha koo na dagatiin ati\n" +
            "Eessayyuu hin deemu ani ilma keeti\n\n" +
            "Sanyii hunda keessa ati nuuf hafte\n" +
            "Gonka qulqullofte gooftaan filtamtee\n" +
            "Balleesuma keenyaf wabii nuuf taatettaa\n" +
            "Qoricha addunyaa gooftaa nuuf laatettaa\n\n" +
            "Maariyaam giiftii koo ati naaf jiraadhu\n" +
            "Cubbuu kootifis gooftaa na kadhadhu\n" +
            "Ani cubbamaadha yoomiyyuu tananii\n" +
            "Adaraa haadha koo narra hin fagaatinii\n\n" +
            "Galaa godhadhera maqaa kee maaramii\n" +
            "Ati na dagatiin yaa haadha garraamii\n" +
            "Ani sii qapheera tasumaa hin yaada'u\n" +
            "Kan siiti abdatu eenyumtuu hin qana'u\n";

    String title = "Si malee maalan qaba";

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