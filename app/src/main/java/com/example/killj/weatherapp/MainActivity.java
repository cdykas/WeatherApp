package com.example.killj.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int nowTemp=45;
    int todayHigh=56;
    int todayLow=40;
    int tomorrowHigh=70;
    int tomorrowLow=40;
    int dayAfterHigh=45;
    int dayAfterLow=42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView now = (TextView) findViewById(R.id.now_text);
        now.setText(nowTemp + "*");
        TextView todayH = (TextView) findViewById(R.id.today_high);
        todayH.setText(todayHigh + "*");
        TextView todayL = (TextView) findViewById(R.id.today_low);
        todayL.setText(todayLow + "*");
        TextView tomorrowH = (TextView) findViewById(R.id.tomorrow_High);
        tomorrowH.setText(tomorrowHigh + "*");
        TextView tomorrowL = (TextView) findViewById(R.id.tomorrow_low);
        tomorrowL.setText(tomorrowLow + "*");
        TextView dayAfterH = (TextView) findViewById(R.id.day_after_high);
        dayAfterH.setText(dayAfterHigh + "*");
        TextView dayAfterL = (TextView) findViewById(R.id.day_after_low);
        dayAfterL.setText(dayAfterLow + "*");
    }
}
