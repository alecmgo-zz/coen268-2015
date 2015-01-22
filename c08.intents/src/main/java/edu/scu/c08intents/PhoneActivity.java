package edu.scu.c08intents;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class PhoneActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        String phoneNumber = getIntent().getExtras().getString("phoneNumber");
        TextView textView = (TextView) findViewById(R.id.phoneNumber);
        textView.setText(phoneNumber);
    }

}
