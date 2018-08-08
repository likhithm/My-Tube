package com.example.likhith.mytube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MyMusicActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        start = (Button) findViewById(R.id.buttonstart);
        stop = (Button) findViewById(R.id.buttonstop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == start) {

            startService(new Intent(this,MusicService.class));
        }
        else if(view==stop){
            stopService(new Intent(this,MusicService.class));
        }
    }

}

