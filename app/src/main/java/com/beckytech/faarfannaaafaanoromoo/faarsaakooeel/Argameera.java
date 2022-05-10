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

public class Argameera extends Fragment {

    String content = "Argameera (fannoon gooftaa *2)\n" +
            "Iliil jedhaa yaa namootaa\n" +
            "\n" +
            "Argameerra     yihudoonni inaaffan\n" +
            ">>             waliin mari'aatan\n" +
            ">>             fannoo isaas dhoksuufi\n" +
            ">>             kosii itti guraanii\n" +
            ">>             waggoota hedduudhaf\n" +
            ">>             dhokaate tureerra\n" +
            ">>             fannoon kiristoosii\n" +
            ">>             kunoo argameerra\n" +
            "\n" +
            "Argameerra     kan dhokate hafu\n" +
            ">>            itti fakkachuudhan\n" +
            ">>            fannoo isaa dhoksaani\n" +
            ">>            gataa itti guurudhan\n" +
            ">>            dhokate hin hafne\n" +
            ">>            fannoon argameera\n" +
            ">>            diinnis leeyya'eera\n" +
            ">>            nutis gammanneera\n" +
            "\n" +
            "Argameerra      mootiitiin illeennii\n" +
            ">>             hawwiin eegaa turtee\n" +
            ">>              fannoo kiristoosii\n" +
            ">>              kadhannan argatte\n" +
            ">>              kan ittin mo'aannu\n" +
            ">>              fannoon nuuf gachanna\n" +
            ">>              kunoo nuuf argamee\n" +
            ">>              gammachuun faarfanna\n" +
            "\n" +
            "Fannoon gooftaa (humna keenya*2)\n" +
            "Ittiin moonaa diina keenya\n" +
            "\n" +
            "Fannoon gooftaa     jaalala fannootin\n" +
            ">>                   inni booji'amee\n" +
            ">>                   qabatee yoo deemus\n" +
            ">>                   diinan yoom moo'amee\n" +
            ">>                   ta'e nuuf gaachana\n" +
            ">>                   mallattoo nageenyaa\n" +
            ">>                   kan ittin moo'annu\n" +
            ">>                   fannoon humna keenya\n" +
            "\n" +
            "Fannoon gooftaa dhiigni gooftaa keenyaa\n" +
            ">>                   irratti kan cobee\n" +
            ">>                   irraa nu faggeessuuf\n" +
            ">>                  diini yoo nu sobee\n" +
            ">>                  dhugaarraa hin maqnuu\n" +
            ">>                  ittiin jabaannerraa\n" +
            ">>                  fannoo kiristoosii\n" +
            ">>                 humna arganneerraa\n" +
            "\n" +
            "Fannoon gooftaa jechi fannoo gooftaa\n" +
            ">>                     gowwootaaf badiidha\n" +
            ">>                   nu warraa amanuuf\n" +
            ">>                   garuu fayyiinaadha\n" +
            ">>                    dhibamaa fayyisa\n" +
            ">>                    humni fannoo gooftaa\n" +
            ">>                    diina ittiin moonaa\n" +
            ">>                    amanaa namootaa\n";

    String title = "Argameera";

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