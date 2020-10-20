package com.example.Guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ViewFlipper;

public class karala extends AppCompatActivity {
    Button ch,po,mu,dh,ka,ma,th,chi,a,b;
    ViewFlipper v_flipper;
    int[] images={
            R.drawable.k2,R.drawable.k3,R.drawable.k4,R.drawable.k5,R.drawable.k6,R.drawable.k7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karala);
        v_flipper=findViewById(R.id.v_flipper);
        ch=(Button)findViewById(R.id.atthir);

        po=(Button)findViewById(R.id.kovalam);
        mu=(Button)findViewById(R.id.munnar);
        dh=(Button)findViewById(R.id.allappy);
        ka=(Button)findViewById(R.id.thekkady);
        ma=(Button)findViewById(R.id.kochi);
        th=(Button)findViewById(R.id.thiru);
        chi=(Button)findViewById(R.id.poovar);
        a=(Button)findViewById(R.id.kollam);
        b=(Button)findViewById(R.id.kozhi);


        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, attirapilly.class);
                startActivity(i);

            }
        });


        po.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, kovalam.class);
                startActivity(i);

            }
        });

        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, munnar.class);
                startActivity(i);

            }
        });

        dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, allappy.class);
                startActivity(i);

            }
        });

        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, thekkady.class);
                startActivity(i);

            }
        });

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, kochi.class);
                startActivity(i);

            }
        });

        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, thiruvan.class);
                startActivity(i);

            }
        });

        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, poovar.class);
                startActivity(i);

            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, kollam.class);
                startActivity(i);

            }
        });
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(karala.this, kozhikode.class);
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

