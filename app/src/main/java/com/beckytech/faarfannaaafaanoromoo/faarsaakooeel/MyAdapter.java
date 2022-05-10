package com.beckytech.faarfannaaafaanoromoo.faarsaakooeel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {

    public MyAdapter(FragmentManager fm, Lifecycle lifecycle) {
        super(fm, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1: return new Argameera();
            case 2: return new Arseemaa();
            case 3: return new CuuphameJira();
            case 4: return new DeessuuWaaqa();
            case 5: return new DubartootaaKeessaa();
            case 6: return new FannoonArgameera();
            case 7: return new GaaddisaManasaa();
            case 8: return new GuyyaaQaba();
            case 9: return new JaalalanJiraanna();
            case 10: return new KoottuGugeeKoo();
            case 11: return new MaalooHinGoyyominaa();
            case 12: return new MikaaeelKoottu();
            case 13: return new NuufDhalatee();
            case 14: return new Sillaasee();
            case 15: return new SiMalee();
            case 16: return new TikseeGaariidhaAti();
            case 17: return new UraaeelErgamaa();
            case 18: return new WabiiKiyyaTaii();
            case 19: return new YooTureeyyuu();
        }
        return new AmaanueelUumaaKoo();
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
