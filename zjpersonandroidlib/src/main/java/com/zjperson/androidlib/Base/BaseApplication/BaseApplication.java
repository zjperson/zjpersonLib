package com.zjperson.androidlib.Base.BaseApplication;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
* created by zjperson
* application基类
* Email zjperson@gmail.com
 * 特说明：使用本库必须继承BaseApplication
*/
public class BaseApplication extends Application {

    private static BaseApplication baseApplication;

    public static BaseApplication getInstance(){
        return baseApplication;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }
}
