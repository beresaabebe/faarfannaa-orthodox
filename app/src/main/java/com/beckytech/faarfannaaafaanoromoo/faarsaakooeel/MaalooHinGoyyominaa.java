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

public class MaalooHinGoyyominaa extends Fragment {

    String content = "Maaloo hin goyyomina yaa dhala nama\n" +
            "Gooftaan ni dhufa hin rafin Gonkumaa\n" +
            "Iyyesuus ni dhufa hin rafin Gonkumaa\n\n" +
            "Gooftaan Dhufaatisaa inni mulliseeraa\n" +
            "Rajjisaa hedduunis kuno xummureeraa\n" +
            "Kootta hin dhiphannuu dammaqne kadhannaa\n" +
            "Dhufaatii Gooftaasii qophoofnee jiraannaa\n\n" +
            "Guyyaansaa gaheera dhufaatiin Iyyesuus\n" +
            "Maaloo hin rafinaa ka'aa dammaqaasii\n" +
            "Bayyee dhiyaateera guyyaan sodaachisaa\n" +
            "Yeroodhaan qopha'a kadhaadha fayyisaa\n" +
            "\n" +
            "Yaa saba waaqayyoo maaliif wal jibbinaa\n" +
            "Guyyaan murtee gahee Maaloo wal jaalanna\n" +
            "Seera isaas raawwanna nuto wal simannaa\n" +
            "Yoo Gaarii hojjenne mirgasaa dhaabbannaa\n\n" +
            "Dhufaticha labsuuf karaatti yoo gufanne\n" +
            "Innoo ol nu qabaa  nuti yoo jabaannee\n" +
            "Haala nuuf mijeessa iddoo boqonnaa keenyaa\n" +
            "Iyyesuus nu cimsaa akka taanuf fakkeenya\n\n" +
            "Namoota ni kanaa halkaniif guyyaattii\n" +
            "Gooftaanis ni dhufaa yeroo nuti beeknetti\n" +
            "Qalbii jijjirannaa gaafa hundumaatti\n" +
            "Qophoofnee eganna barichi ni dhufati\n";

    String title = "Maaloo hin goyyomina";

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