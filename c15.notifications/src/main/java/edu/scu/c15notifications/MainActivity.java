package edu.scu.c15notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int requestCode = 0;
        int flags = 0;
        Intent intent = new Intent(this, HouseFireActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(
                this, requestCode, intent, flags);

        int id = 12345;
        Notification notification = new Notification.Builder(this)
                .setContentTitle("Emergency alert!")
                .setContentText("Your house is on fire!!!")
                .setSmallIcon(android.R.drawable.ic_menu_day)
                .setContentIntent(pendingIntent)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(
                Context.NOTIFICATION_SERVICE);
        notificationManager.notify(id, notification);
    }
}
