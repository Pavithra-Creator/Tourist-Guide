package com.example.Guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ban extends AppCompatActivity {
    Button ch,po,mu,dh,ka,ma,th,chi,a,b;
    ViewFlipper v_flipper;
    int[] images={
            R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban);
        v_flipper=findViewById(R.id.v_flipper);
        ch=(Button)findViewById(R.id.palace);

        po=(Button)findViewById(R.id.modern);
        mu=(Button)findViewById(R.id.tipu);
        dh=(Button)findViewById(R.id.krishna);
        ka=(Button)findViewById(R.id.lalbagh);
        ma=(Button)findViewById(R.id.park);
        th=(Button)findViewById(R.id.lake);
        chi=(Button)findViewById(R.id.near);


        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, bangpalace.class);
                startActivity(i);

            }
        });


        po.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, modern.class);
                startActivity(i);

            }
        });

        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, tipu.class);
                startActivity(i);

            }
        });

        dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, krishna.class);
                startActivity(i);

            }
        });

        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, lalbagh.class);
                startActivity(i);

            }
        });

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, park.class);
                startActivity(i);

            }
        });

        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, lake.class);
                startActivity(i);

            }
        });

        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ban.this, near.class);
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

