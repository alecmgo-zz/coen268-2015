package edu.scu.c11storage;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String FILENAME = "diary.txt";
        String string = "hello world!";

        try {
            FileOutputStream fos = openFileOutput(FILENAME,
                    Context.MODE_PRIVATE);
            fos.write(string.getBytes());
            fos.close();

            BufferedReader reader = new BufferedReader(new
                    InputStreamReader(openFileInput(FILENAME)));
            Log.d("TAG", "From file: " + reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
