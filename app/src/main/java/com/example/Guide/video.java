package com.example.Guide;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class
video extends AppCompatActivity {

    Button india_1, delhi_1,chennai_1,kerala_1,indialove_1,ban_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        india_1 = (Button) findViewById(R.id.india);
        delhi_1 = (Button) findViewById(R.id.delhi);
        chennai_1 = (Button) findViewById(R.id.tamil);
        ban_1 = (Button) findViewById(R.id.bangalore);
        kerala_1 = (Button) findViewById(R.id.kerala1);
        indialove_1= (Button) findViewById(R.id.indialove);
        india_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/77czO8sxABI")));
            }
        });

        delhi_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/t-i1aJLNkYY")));
            }
        });
        chennai_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/wBqxTshBhp4")));
            }
        });
        ban_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/wBqxTshBhp4")));
            }
        });
        kerala_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/KB1_JsPSqqs")));
            }
        });


        kerala_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/KB1_JsPSqqs")));
            }
        });
        indialove_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/uXmYydzUeL8")));
            }
        });


    }
}