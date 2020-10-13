package com.game.rhythmshooter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class MainScreenAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;

    public MainScreenAdapter(@NonNull FragmentManager fm) {
        super(fm);

        mData = new ArrayList<>();

        mData.add(new ModeFragment());
        mData.add(new ItemFragment());
        mData.add(new ShopFragment());
        mData.add(new RankFragment());
        mData.add(new SettingFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }
}
