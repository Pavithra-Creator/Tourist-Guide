package com.example.Guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Chennai extends AppCompatActivity {
    Button ch,po,mu,dh,ka,ma,th,chi;
    ViewFlipper v_flipper;
    int[] images={
            R.drawable.c21,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chennai);
        v_flipper=findViewById(R.id.v_flipper);
        ch=(Button)findViewById(R.id.chan);

        po=(Button)findViewById(R.id.pond);
        mu=(Button)findViewById(R.id.mudu);
        dh=(Button)findViewById(R.id.dhan);
        ka=(Button)findViewById(R.id.kanya);
        ma=(Button)findViewById(R.id.madu);
        th=(Button)findViewById(R.id.than);
        chi=(Button)findViewById(R.id.chid);


        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, chan.class);
                startActivity(i);

            }
        });


        po.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, pond.class);
                startActivity(i);

            }
        });

        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, mudu.class);
                startActivity(i);

            }
        });

        dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, dhan.class);
                startActivity(i);

            }
        });

        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, kanya.class);
                startActivity(i);

            }
        });

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, madu.class);
                startActivity(i);

            }
        });

        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, than.class);
                startActivity(i);

            }
        });

        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chennai.this, chid.class);
                startActivity(i);

            }
        });


        for (int i=0;i<images.length;i++){
            flip_image(images[i]);
        }
    }
    public void flip_image(int i){
        ImageView b=new ImageView(this);
        b.setBackgroundResource(i);
        v_flipper.addView(b);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);
    }






}

