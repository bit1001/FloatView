package org.qii.android.floatview.activity;


import android.app.Application;
import android.view.WindowManager;


public class GlobalContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    private WindowManager.LayoutParams wmParams = new WindowManager.LayoutParams();


    public WindowManager.LayoutParams getMywmParams() {
        return wmParams;
    }
}