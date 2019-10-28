package com.kraftropic.krafttime;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kraftropic.kraftytime.core.KraftyTime;
import com.kraftropic.kraftytime.utils.KRAFTY;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KraftyTime.with(new Date(Calendar.getInstance().getTime().getTime() - 26 * 60 * 60 * 1000L))
                .setClockMode(KRAFTY.MODE_24_HOUR)
                .setDateMode(KRAFTY.WORD_YYYMMDD)
                .setDateText(((TextView) findViewById(R.id.date)));
    }
}
