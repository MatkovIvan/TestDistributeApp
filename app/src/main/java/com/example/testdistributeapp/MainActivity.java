package com.example.testdistributeapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.distribute.Distribute;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.setLogLevel(Log.VERBOSE);
        AppCenter.start(getApplication(), "d190cbc1-2b78-4004-be54-a7d01cacc400", Analytics.class, Distribute.class);
    }
}