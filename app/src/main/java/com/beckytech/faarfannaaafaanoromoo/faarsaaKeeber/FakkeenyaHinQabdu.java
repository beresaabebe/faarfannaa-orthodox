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

public class FakkeenyaHinQabdu extends Fragment {

    String content = "Eenyu jedheen himaan waa'eekee\n" +
            "Fakkeenya hin qabdu uumamnikee.\n" +
            "\n\n" +
            "Haadha Balayisab - Maariyaam - Urgooftuu Naardoos\n" +
            "Yabbaannoo Yaa'iiqoob - Maariyaam - Duumeessaa Eeliyaas\n" +
            "Ibsituu Bersaabee - Maariyaam - Sabbataa nageenyaa\n" +
            "Balbala Hisqi'eel - Maariyaam - Haadha hunda Keenyaa.\n" +
            "\n\n" +
            "Kal'ee Geediyoon - Maariyaam - Waaciiti Eelsaadha\n" +
            "Gonfoo Solomon - Maariyaam - Ulee Aaroonidha\n" +
            "Waadaa Gala'aadi - Maariyaam - Bidiruu Noohidha\n" +
            "Galata Yaareedi - Maariyaam - Abdii Aaddaamidha.\n" +
            "\n\n" +
            "Taabota Muuseedha - Maariyaam - Siinatti Kan argamtee\n" +
            "Qoricha Naahoomi - Maariyaam - dhibeekoo fayyistee\n" +
            "Urgooftuu Qanaanimoos - Maariyaam - urgaa gaarii laattee\n" +
            "Baha Biiftuti ati - Maariyaam - ifa hundaaf laattee.\n" +
            "\n\n" +
            "Garraamummaa Aabeel - Maariyaam - Leemmati Warqeedha\n" +
            "Gaaricha Imbaaqoom - Maariyaam - Laaliistu Muuseedha\n" +
            "Galma Milkiyaas - Maariyaam - Abdii cubbamoota\n" +
            "Sooxro Sabeeqidha - Maariyaam - Gonfoo Qulqulloota.\n" +
            "\n\n" +
            "Maseenqo Izra - Maariyaam - Gugee nageeyati\n" +
            "Guuttuu Dookimaasi - Maariyaam - naga Eelsabeeti\n" +
            "Bagana Daawiiti - Maariyaam - Tulluu Aaraarati\n" +
            "Abdii jireenyati - Maariyaam - Haadha Gooftaa kooti.\n";

    String title = "Fakkeenya hin qabdu uumamnikee";

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