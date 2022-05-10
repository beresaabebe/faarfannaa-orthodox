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

public class GaaddisaKochooKeenDaandiinKooQajeelee extends Fragment {

    TextView textTitle, textContent;

    String content = "Gaaddisa kochoo keen daandiin koo qajeelee\n" +
            "Leeyyaa'e hin beeku ani gara kee ilaalee\n" +
            "Ergamaa ifadha ragu'el si waamaa\n" +
            "Ifa addunyaaf hirta ati yeroo hundumaa\n" +
            "      Ceesisa\n" +
            "Mana kee jalatti maqaa keen faarfadhaa\n" +
            "Hirko waan naaf taateef olmaa keen dubbadha\n" +
            "Araaraa fi nageenya hundaaf ni kadhatta\n" +
            "Angoo sif kennameen ifa ni hogganataa\n" +
            "      Ceesisa\n" +
            "Suurraa waaqayyootu sirraa calaqisaa\n" +
            "Uumamarra ol kaaseen maqaa kee sii faarsaa\n" +
            "Raagu'el ergamaa ati naa gargaarta\n" +
            "Duukan hin sodaadhu ifaan na marsistaa\n" +
            "        Ceesisa\n" +
            "Hangafa jedhamata kennaa keen dursitee\n" +
            "Ifaan ni mullata ifa hundaaf laatee\n" +
            "Dinni ni moo'ama humni kee jabaadha\n" +
            "Gargaarsa kee argeera kanaf si jaaladha\n" +
            "         =======•|•=======\n";

    String title = "Gaaddisa kochoo keen daandiin koo qajeelee";

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