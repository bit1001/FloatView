package org.qii.android.floatview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.WindowManager;
import org.qii.android.floatview.view.FloatView;

public class BackgroundService extends Service {


    @Override
    public IBinder onBind(Intent i) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        createView();
        return super.onStartCommand(intent, flags, startId);
    }

    private void createView() {
        FloatView myFV = new FloatView(getApplicationContext());

        WindowManager wm = (WindowManager) getApplicationContext().getSystemService("window");

        WindowManager.LayoutParams wmParams = ((GlobalContext) getApplication()).getMywmParams();
        wmParams.type = 2002;
        wmParams.format = 1;
        wmParams.flags |= 8;

        wmParams.gravity = Gravity.LEFT | Gravity.TOP;

        wmParams.x = 0;
        wmParams.y = 80;


        wmParams.width = ViewGroup.LayoutParams.WRAP_CONTENT;
        wmParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;


        wm.addView(myFV, wmParams);

     }



}
