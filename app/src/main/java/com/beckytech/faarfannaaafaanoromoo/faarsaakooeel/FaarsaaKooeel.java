package com.beckytech.faarfannaaafaanoromoo.faarsaakooeel;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.material.tabs.TabLayout;

public class FaarsaaKooeel extends OptionsMenuActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initUI("Faarsaa faarfataata Koo'eel Shawaa");

        setContentView(R.layout.activity_faarsaa_hangaffoota);

        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);

        String symbolSign = "\uD83C\uDF39 ✝";

        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Amanu’eel uumaa koo  "));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Argameera"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Arseemaa"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Cuuphame jira"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Deessuu waaqa durbee"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Dubartootaa keessaa filataamtee"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Fannoon Argameera ililichaa"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Gaaddisa manasaa"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Guyyaa qaba"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Jaalalan jiraanna"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Koottuu Gugee koo"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Maaloo hin goyyomina"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Koottu Mikaa’eel koottu"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Nuuf Dhalatee"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Sillaasee uumaa koo"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Si malee maalan qaba"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Tiksee gaariidha"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Uraa'eel Ergamaa"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Wabbii kiyya ta’ii"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Yoo tureeyyuu"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }

}