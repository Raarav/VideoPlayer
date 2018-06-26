 package com.example.rahulprajapati.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.videoplayer);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.closer);//path
        MediaController mediaController = new MediaController(this);//create object of mediacontroller
        mediaController.setAnchorView(videoView);//set video into mediacontroller
        videoView.setMediaController(mediaController);//and add controllers of media player
        videoView.start();//start
    }
}
