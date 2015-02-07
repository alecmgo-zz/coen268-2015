package edu.scu.c13bg;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int interval = intent.getExtras().getInt("interval");
        for (int i = 0; i < 100; i++) {
            Log.d("MYSERVICE", Integer.toString(interval * i));
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
