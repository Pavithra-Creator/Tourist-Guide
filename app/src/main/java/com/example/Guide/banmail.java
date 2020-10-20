package com.example.Guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class banmail extends AppCompatActivity {
    Button b;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banmail);
        b = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"pavi.harshit.gamer@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
                i.putExtra(Intent.EXTRA_TEXT, "Name : " + e1.getText() + "\nMessage : " + e2.getText());
                try {
                    startActivity(Intent.createChooser(i, "Send feedback..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}