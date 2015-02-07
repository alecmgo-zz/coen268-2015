package edu.scu.c13bg;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.count_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Method 1 (preferred)
                Runnable runnable = new MyRunnable();
                Thread thread1 = new Thread(runnable);
                thread1.start();

                // Method 2
                Thread thread2 = new MyThread();
                thread2.start();
            }
        });
    }

    public class MyRunnable implements Runnable {
        @Override
        public void run() {
            longProcess();
        }
    }

    public class MyThread extends Thread {
        @Override
        public void run() {
            longProcess();
        }
    }

    public void longProcess() {
        // Super intense computations
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
