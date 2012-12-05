package org.qii.android.floatview.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SettingActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, BackgroundService.class));
    }
}
