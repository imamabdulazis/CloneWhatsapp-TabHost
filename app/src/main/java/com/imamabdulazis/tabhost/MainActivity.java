package com.imamabdulazis.tabhost;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.imamabdulazis.tabhost.adapter.ViewPagerAdapter;
import com.imamabdulazis.tabhost.fragment.CallFragment;
import com.imamabdulazis.tabhost.fragment.ChatFragment;
import com.imamabdulazis.tabhost.fragment.StatusFragment;

public class MainActivity extends AppCompatActivity {
    Activity activity=this;
    private String TAG=getClass().getSimpleName();

    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tblayout);
        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this.getSupportFragmentManager());

        adapter.addFrag(new ChatFragment(), "Chat");
        adapter.addFrag(new StatusFragment(), "Status");
        adapter.addFrag(new CallFragment(), "Call");
        viewPager.setAdapter(adapter);
    }


}
