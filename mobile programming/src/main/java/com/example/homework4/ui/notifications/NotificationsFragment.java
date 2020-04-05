package com.example.homework4.ui.notifications;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.homework4.R;

public class NotificationsFragment extends Fragment {
    TextView event;
    TextView notice;
    public NotificationsFragment(){}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_notifications, container, false);
      event = view.findViewById(R.id.event_view);
      notice=view.findViewById(R.id.notice_view);
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
}