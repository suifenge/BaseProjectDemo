package com.suifeng.app.demo.baseproject;

import android.app.Application;

/**
 * Created by zhuoyue on 2017/12/4.
 */

public class CustomApplication extends Application{

    public static CustomApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static CustomApplication getInstance() {
        return mInstance;
    }

}
