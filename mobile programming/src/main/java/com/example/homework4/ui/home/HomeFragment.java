package com.example.homework4.ui.home;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.homework4.MainActivity;
import com.example.homework4.R;
import com.example.homework4.SubActivity;
import com.example.homework4.ui.first_fragment;
import com.example.homework4.ui.second_fragment;
import com.example.homework4.ui.third_fragment;

public class HomeFragment extends Fragment {
    Button btn_food1;
    Button btn_food2;
    Button btn_food3;
    TextView event;
    TextView notice;
    ViewPager vp;
    public HomeFragment(){
    }

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_home,container,false);
        vp=view.findViewById(R.id.vp);
        vp.setAdapter(new pagerAdapter(getFragmentManager()));
        vp.setCurrentItem(0);
        btn_food1=view.findViewById(R.id.btn_food1);
        btn_food2=view.findViewById(R.id.btn_food2);
        btn_food3=view.findViewById(R.id.btn_food3);
        event = view.findViewById(R.id.textView3);
        notice = view.findViewById(R.id.textView2);
        btn_food1.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent =new Intent();
                ComponentName componentName = new ComponentName("com.example.homework4", "com.example.homework4.SubActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                return false;
            }
        });
        btn_food2.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent =new Intent();
                ComponentName componentName = new ComponentName("com.example.homework4", "com.example.homework4.SubActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                return false;
            }
        });
        btn_food3.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent =new Intent();
                ComponentName componentName = new ComponentName("com.example.homework4", "com.example.homework4.SubActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                return false;
            }
        });
        event.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent();
                ComponentName componentName = new ComponentName("com.example.homework4","com.example.homework4.EventActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                return false;
            }
        });
        notice.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent();
                ComponentName componentName = new ComponentName("com.example.homework4","com.example.homework4.NoticeActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                return false;
            }
        });


        return view;
    }
    private class pagerAdapter extends FragmentStatePagerAdapter
    {
        public pagerAdapter(FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0:
                    return new first_fragment();
                case 1:
                    return new second_fragment();
                case 2:
                    return new third_fragment();
                default:
                    return null;
            }
        }
        @Override
        public int getCount()
        {
            return 3;
        }
    }


}