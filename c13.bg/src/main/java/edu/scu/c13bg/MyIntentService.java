package edu.scu.c13bg;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        int interval = intent.getExtras().getInt("interval");
        for (int i = 0; i < 100; i++) {
            Log.d("MYSERVICE", Integer.toString(interval * i));
        }
    }
}
