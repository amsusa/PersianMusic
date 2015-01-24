package ams.android.persianmusic.Activity;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.viewpagerindicator.TitlePageIndicator;

import ams.android.persianmusic.Adapter.ViewPagerAdapter;
import ams.android.persianmusic.R;


public class FirstActivity extends ActionBarActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    TitlePageIndicator mIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first);


        String[] pages = {"New Music", "Top Music", "New Podcast", "Top Podcast", "New Video", "Top Video"};

        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(this, pages);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        viewPager.setCurrentItem(0);

        mIndicator = (TitlePageIndicator) findViewById(R.id.titlepageindicator);
        mIndicator.setViewPager(viewPager);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
