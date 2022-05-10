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

public class TikseeGaariidhaAti extends Fragment {

    String content = "Tiksee gaariidha ati Tiksee hin daganne\n" +
            "Yaa uumaa umamtoota nuti si Abdannee\n" +
            "Ammas nuu tikfaadhu yaa Abbaa Jaalalaa(2)\n\n" +
            "Tiksee Gaarii ta'ee jaalalaan nu tiksuuf\n" +
            "Ofitti nuu qabee inni nuu kunuunsuuf\n" +
            "Cubbuu hunda keenyaa isatu nuu dhisee\n" +
            "Madaa hunda keenyas isatu nuu gogsee\n\n" +
            "Gooftaa Iyyesuus maaloo nuu Eebisii\n" +
            "Yaa waaqayyoo uumaa ati nu fayyisii\n" +
            "Mana kee keesaatti akka nuti hin badnee\n" +
            "Ati nuu yaadadhu akka kufne hin hafnee\n\n" +
            "Yeroo Rakkoo keenyaa inni nuu gaafataa\n" +
            "Dhiphinaa keessayiis inni nuu Baafataa\n" +
            "Abbaa gaarii qabna Amanaa yaa nama\n" +
            "Nama hin dagatu inni hamma dhumaa\n";

    String title = "Tiksee gaariidha ati";

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