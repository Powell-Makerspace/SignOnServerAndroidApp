package org.powellmakerspace.signonserver;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FragmentCanvas extends AppCompatActivity {

    private static final String TAG = "FragmentCanvas";

    private SectionsStatePagerAdapter sectionsStatePagerAdapter;
    private ViewPager navigationContainer;
    private ViewPager mainBodyContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragement_canvas);
        Log.d(TAG,"onCreate: Started.");

        navigationContainer = (ViewPager) findViewById(R.id.navigationContainer);
        mainBodyContainer = (ViewPager) findViewById(R.id.mainBodyContainer);

        setupNavigationViewPager(navigationContainer);
    }

    private void setupNavigationViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new NavigationFragment(), "Navigation Fragment");
        viewPager.setAdapter(adapter);
    }
}
