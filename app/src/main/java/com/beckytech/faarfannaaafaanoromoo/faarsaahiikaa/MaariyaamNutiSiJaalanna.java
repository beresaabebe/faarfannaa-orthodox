package com.beckytech.faarfannaaafaanoromoo.faarsaahiikaa;

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

public class MaariyaamNutiSiJaalanna extends Fragment {

    TextView textTitle, textContent;

    String content = "Maariyaam nuti si jaalanna\n" +
            "Kannaa kee akkamin daganna\n" +
            "Nuf laattee qorichaa addunyaa\n" +
            "Nuf taatee haadha hunda keenyaa\n" +
            "Ceesisa\n" +
            "Kennaa fannoo jala haadha saba hundumaa\n" +
            "Kabaji kee hundu kan caalu uumama\n" +
            "Ayyaanni kee addaa gooftaan si filatee\n" +
            "Afuura qulqulluun bultoo waaqa taatee\n" +
            "Ceesisa\n" +
            "Addunyaa osoo hin uumim laphee isaarraa jiratta\n" +
            "Chaappaa sillaaseettin mallatteeffamteetta\n" +
            "Abiddaa waaqummaa suraafel sodaatu\n" +
            "Hin jiru yaa durbee kan akka keeti baatuu\n" +
            "Ceesisa\n" +
            "Har'a maaltu argamnanii nuti kan si gannuu\n" +
            "Garaa keenyaf jennee nuti si dhiisnee deemnu\n" +
            "Gaarii itti fakkaate warri si ganani\n" +
            "Miila keetti ni kufuu booddee deebi'anii\n" +
            "Ceesisa\n" +
            "Nuti si faarsinaa kabaja kee himnaa\n" +
            "Haadha gooftaa ta'u kee deemne dhugaa baana\n" +
            "Kana booda nuti ijoolumaa keeti\n" +
            "Nuf kadhadhu durbee ilma kee biratti\n" +
            "Ceesisa\n" +
            "Nuto si waamanna yaa haadha waaqayyoo\n" +
            "Isa faana buutee gaara qaraniyoo\n" +
            "Qulqulleettidha ati gooftaaf amanamtuu\n" +
            "Ayyaana qabeettii hundu si yaa faarfatuu\n";

    String title = "Maariyaam nuti si jaalanna";


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