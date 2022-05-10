package com.beckytech.faarfannaaafaanoromoo.faarsaahiikaa;

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
            case 1: return new GaaddisaKochooKeenDaandiinKooQajeelee();
            case 2: return new IttiFufaa();
            case 3: return new JireenyaLubbuuKoo();
            case 4: return new MaariyaamNutiSiJaalanna();

        }
        return new AbbaanSamiiratii();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
