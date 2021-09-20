package com.instabugtest;

import android.app.Application;

import com.facebook.soloader.SoLoader;
import com.instabug.reactlibrary.RNInstabugReactnativePackage;

public class TestApplication  extends Application {

    @Override
    public void onCreate() {
        new RNInstabugReactnativePackage
                .Builder("TOKEN", TestApplication.this)
                .setInvocationEvent("none")
                .build();
        super.onCreate();
        SoLoader.init(this,false);
    }
}
