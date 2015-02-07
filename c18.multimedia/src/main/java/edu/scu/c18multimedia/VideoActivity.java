package edu.scu.c18multimedia;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView myVideo = (VideoView) findViewById(R.id.videoView);
        Uri videoUri = Uri.parse("android.resource://"
                + getPackageName() + "/" + R.raw.video);
        myVideo.setVideoURI(videoUri);

        MediaController mc = new MediaController(this);
        mc.setMediaPlayer(myVideo);
        myVideo.setMediaController(mc);
        myVideo.requestFocus();
        mc.show();
    }
}
