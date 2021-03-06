package com.fragmentapp;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by liuzhen on 2017/11/8.
 */

public class App extends Application {

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        //第一：默认初始化
//        Bmob.initialize(this, "7a0cb418fc0379a4b199c6b1a51e5ca9");
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    public static App getInstance(){
        return instance;
    }

}
