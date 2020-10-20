package com.example.Guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact extends AppCompatActivity {
    ImageView button1,k,t,b,bmai,dmai,tmai,kmai;
    TextView contact,ke,ta,ba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        contact=(TextView)findViewById(R.id.contact) ;
        ke=(TextView) findViewById(R.id.kcontact);
        ta=(TextView) findViewById(R.id.ktamil);
        ba=(TextView) findViewById(R.id.ban);
        bmai=(ImageView)findViewById(R.id.bmail);
        dmai=(ImageView)findViewById(R.id.dmail);
        tmai=(ImageView)findViewById(R.id.tmail);
        kmai=(ImageView)findViewById(R.id.kmail);
        bmai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contact.this, banmail.class);
                startActivity(i);

            }
        });
        dmai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contact.this, delhimail.class);
                startActivity(i);

            }
        });
        tmai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contact.this, tamilmail.class);
                startActivity(i);

            }
        });
        kmai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contact.this, karalamail.class);
                startActivity(i);

            }
        });
        button1=(ImageView) findViewById(R.id.phncontact);
        k=(ImageView) findViewById(R.id.kcon);
        t=(ImageView) findViewById(R.id.tcontact);
        b=(ImageView) findViewById(R.id.bcontact);

        //Performing action on button click
        button1.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String number=contact.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }

        });


        k.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String number=ke.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }

        });
        t.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String number=ta.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }

        });
        b.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String number=ba.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }

        });
    }







}




