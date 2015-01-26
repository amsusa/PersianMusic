package ams.android.persianmusic.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import ams.android.persianmusic.R;

/**
 * Created by Aidin on 1/23/2015.
 */
public class ViewPagerAdapter extends PagerAdapter {
    // Declare Variables
    Context context;
    LayoutInflater inflater;
    String[] pages;

    public ViewPagerAdapter(Context context, String[] pages) {
        this.context = context;
        this.pages = pages;
    }

    @Override
    public int getCount() {
        return pages.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pages[position];
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //final float density = context.getResources().getDisplayMetrics().density;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = null;
        itemView = inflater.inflate(R.layout.pager_1, container, false);




//        switch (position) {
//            case 0:
//                //itemView = inflater.inflate(R.layout.item_viewpager1, container, false);
//                break;
//            case 1:
//                //itemView = inflater.inflate(R.layout.item_viewpager2, container, false);
//                //int ratio = 64;
//                //ImageView imgprofile = (ImageView) itemView.findViewById(R.id.img_profile);
//                //imgprofile.setLayoutParams(new RelativeLayout.LayoutParams(Math.round(density * ratio), Math.round(density * ratio)));
//
//                break;
//            case 2:
//                //itemView = inflater.inflate(R.layout.item_viewpager3, container, false);
//                break;
//        }


        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);
    }
}