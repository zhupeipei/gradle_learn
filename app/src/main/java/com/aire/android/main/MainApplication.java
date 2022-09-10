package com.aire.android.main;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * @Author: Zhupeipei
 * @CreateDate: 2021/10/16 7:46 下午
 */
public class MainApplication extends Application {
    public static Application INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();

        INSTANCE = this;
    }

    @Override
    protected void attachBaseContext(Context base) {
        Log.d("zimotag", "attachBaseContext: " + base.getApplicationContext());
        super.attachBaseContext(base);
        Log.d("zimotag", "attachBaseContext2: " + base.getApplicationContext());
    }
}
