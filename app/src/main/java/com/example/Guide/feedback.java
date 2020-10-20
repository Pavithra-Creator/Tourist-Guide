package com.example.Guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;



public class feedback extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    EditText _com;
    Button _send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        openHelper=new DatabaseHelper(this);

        _send=(Button)findViewById(R.id.send);

        _com=(EditText)findViewById(R.id.com);
        _send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db=openHelper.getWritableDatabase();
                String commant=_com.getText().toString();

                insertdata(commant);
                Toast.makeText(getApplicationContext(),"Thankyou For Your Feedback",Toast.LENGTH_LONG).show();

            }
        });
    }
    public void insertdata(String commant){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COLUMN_2,commant);

        long id=db.insert(DatabaseHelper.TABLE_SECOND_NAME,null, contentValues);
    }
}

