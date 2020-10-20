package com.example.Guide;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class signin extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button _btnLogin;
    TextView reg;
    EditText _txtEmail,_txtPass;
    Cursor cursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        openHelper = new DatabaseHelper(this);
        db=openHelper.getReadableDatabase();

        _btnLogin=(Button)findViewById(R.id.signin);
        reg=(TextView)findViewById(R.id.register);
        _txtEmail=(EditText)findViewById(R.id.email);
        _txtPass=(EditText)findViewById(R.id.password);



        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=_txtEmail.getText().toString();
                String pass = _txtPass.getText().toString();
                cursor = db.rawQuery("SELECT * FROM "+ DatabaseHelper.TABLE_FIRST_NAME + " WHERE " + DatabaseHelper.COL_3 + "=? AND " + DatabaseHelper.COL_5 + "=?",new String[]{email,pass});
                if(cursor!=null){
                    if(cursor.getCount() > 0) {
                        cursor.moveToNext();
                        Toast.makeText(getApplicationContext(),"login successfully",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(signin.this,DashActivity.class);
                        startActivity(intent);

                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid UserName & Password",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.this,aregister.class);
                startActivity(intent);
            }
        });
    }
}
