package edu.scu.c11storage;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parse);

        Parse.enableLocalDatastore(this);
        // Fill in your own applicationId and clientKey
        Parse.initialize(this, "applicationId", "clientKey");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("animal", "alpaca");
        testObject.saveInBackground();
        Log.d("TAG", "Data saved");
    }
}
