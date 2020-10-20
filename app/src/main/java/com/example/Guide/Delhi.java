package com.example.Guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Delhi extends AppCompatActivity {
    ViewFlipper v_flipper;
    int[] images={
            R.drawable.d1,R.drawable.d11,R.drawable.d12,R.drawable.d2,R.drawable.d3,R.drawable.d5
    };
    Button Lo,fo,gar,ra,ga,ta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
        v_flipper=findViewById(R.id.v_flipper);
        Lo=(Button)findViewById(R.id.lotus);

        fo=(Button)findViewById(R.id.fort);
        gar=(Button)findViewById(R.id.garden);
        ra=(Button)findViewById(R.id.raj);
        ga=(Button)findViewById(R.id.gate);
        ta=(Button)findViewById(R.id.taj);





        for (int i=0;i<images.length;i++){
            flip_image(images[i]);
        }

        //intent activity
        Lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Delhi.this, lotusimages.class);
                startActivity(i);

            }
        });
        fo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Delhi.this, tughlad.class);
                startActivity(i);

            }
        });
        gar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Delhi.this, garden.class);
                startActivity(i);

            }
        });
        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Delhi.this, raj.class);
                startActivity(i);

            }
        });
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Delhi.this, gate.class);
                startActivity(i);

            }
        });
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Delhi.this, taj.class);
                startActivity(i);

            }
        });














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






    //indents activity for images

}




