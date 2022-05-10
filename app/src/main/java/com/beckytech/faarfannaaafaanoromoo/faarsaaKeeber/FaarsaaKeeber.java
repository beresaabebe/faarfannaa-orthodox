package com.beckytech.faarfannaaafaanoromoo.faarsaaKeeber;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.google.android.material.tabs.TabLayout;

public class FaarsaaKeeber extends OptionsMenuActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initUI("Faarsaa faarfataata Keebar Tesfa");

        setContentView(R.layout.activity_faarsaa_hangaffoota);

        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);

        String symbolSign = "\uD83C\uDF39 ✝";

        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Fakkeenya hin qabdu "));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Giyoorgiis Na Oolche"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Hin Kutu Fannoo Koo"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Hoolicha dhugumaa guyyaa"));
        tabLayout.addTab(tabLayout.newTab().setText(symbolSign + " Humna Waaqaaf Safuu"));

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