package com.fragmentapp;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by liuzhen on 2017/11/8.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //第一：默认初始化
        Bmob.initialize(this, "7a0cb418fc0379a4b199c6b1a51e5ca9");
    }
}
