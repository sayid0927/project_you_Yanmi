package com.shyz.downloadutil;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ZXFragmentPagerAdapter extends FragmentPagerAdapter {
	private ArrayList<Fragment> fragments;
	private FragmentManager fm;

	public ZXFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
		this.fm = fm;
	}

	public ZXFragmentPagerAdapter(FragmentManager fm,
			ArrayList<Fragment> fragments) {
		super(fm);
		this.fm = fm;
		this.fragments = fragments;
		
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

	@Override
	public Fragment getItem(int position) {
		return fragments.get(position);
	}

	@Override
	public int getItemPosition(Object object) {
		return POSITION_NONE;
	}

//	public void setFragments(ArrayList<Fragment> fragments) {
//		if (this.fragments != null) {
//			FragmentTransaction ft = fm.beginTransaction();
//			for (Fragment f : this.fragments) {
//				ft.remove(f);
//			}
//			ft.commit();
//			ft = null;
//			fm.executePendingTransactions();
//		}
//		this.fragments = fragments;
//		notifyDataSetChanged();
//	}
//
//	@Override
//	public Object instantiateItem(ViewGroup container, final int position) {
//		Object obj = super.instantiateItem(container, position);
//		return obj;
//	}
//    
}
