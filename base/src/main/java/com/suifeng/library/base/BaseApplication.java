package com.suifeng.library.base;

import android.app.Application;

public abstract class BaseApplication extends Application{

    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initApp();
    }

    protected abstract void initApp();

    public static BaseApplication getInstance() {
        return instance;
    }
}
