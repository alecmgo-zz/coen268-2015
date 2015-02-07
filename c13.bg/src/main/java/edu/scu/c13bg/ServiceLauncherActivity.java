package edu.scu.c13bg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ServiceLauncherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_launcher);

        Intent intent = new Intent(ServiceLauncherActivity.this,
                MyIntentService.class);
        intent.putExtra("interval", 5);
        startService(intent);
    }
}
