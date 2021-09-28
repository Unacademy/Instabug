package com.instabugtest;

import android.app.Application;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.instabug.reactlibrary.RNInstabugReactnativePackage;

public class TestApplication  extends Application {


    public static ReactInstanceManager sReactInstanceManager;

    @Override
    public void onCreate() {
        new RNInstabugReactnativePackage
                .Builder("8a99cf713bfabbbb6a7814acb10a84e1", TestApplication.this)
                .setInvocationEvent("none")
                .build();
        super.onCreate();
        SoLoader.init(this,false);
        sReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(this)
                .setBundleAssetName("index.android.bundle")
                .setJSMainModulePath("index")
                .addPackage(new RNInstabugReactnativePackage())
                .addPackage(new MainReactPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(LifecycleState.BEFORE_RESUME)
                .build();
    }
}
