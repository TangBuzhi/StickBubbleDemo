package com.tj.catchcrashdemo;

import android.app.Application;

/**
 * Created by Don on 2017/2/23.
 */

public class CrashApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
