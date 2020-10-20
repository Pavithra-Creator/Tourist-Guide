package com.example.Guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DashActivity extends AppCompatActivity {
  ImageView karal,bangalor,tamil,delhi,contact1,fe,gal,vid;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        karal=(ImageView)findViewById(R.id.kar);
        bangalor=(ImageView)findViewById(R.id.banim);
        delhi=(ImageView)findViewById(R.id.del);
        tamil=(ImageView)findViewById(R.id.che);
        fe=(ImageView)findViewById(R.id.feed);
        gal=(ImageView)findViewById(R.id.gallary);
        vid=(ImageView)findViewById(R.id.video);
        contact1=(ImageView)findViewById(R.id.contact);
        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashActivity.this,Chennai.class));
            }
        });
        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashActivity.this,Delhi.class));
            }
        });
        karal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashActivity.this,karala.class));
            }
        });
        bangalor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashActivity.this,ban.class));
            }
        });

        contact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashActivity.this,Contact.class));
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashActivity.this, feedback.class);
                startActivity(i);

            }
        });
        gal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashActivity.this, gallary.class);
                startActivity(i);

            }
        });
        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashActivity.this, video.class);
                startActivity(i);

            }
        });

    }
}