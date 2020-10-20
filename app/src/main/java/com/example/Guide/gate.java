package com.example.Guide;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class gate extends AppCompatActivity {

    private GyroscopeObserver gyroscopeObserver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate);
        gyroscopeObserver=new GyroscopeObserver();
        gyroscopeObserver.setMaxRotateRadian(Math.PI/9);
        PanoramaImageView panoramaImageView=(PanoramaImageView)findViewById(R.id.panorama);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver);

    }
    @Override
    protected void onResume(){
        super.onResume();
        gyroscopeObserver.register(this);
    }
    @Override
    protected void onPause(){
        super.onPause();
        gyroscopeObserver.unregister();
    }
}

