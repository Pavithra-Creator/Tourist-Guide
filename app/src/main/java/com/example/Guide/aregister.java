package com.example.Guide;


import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Patterns;

public class aregister extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button _btnreg;
    TextView _btnlogin;

    String name1,pw,mail,no;
    EditText  _txtname,_txtemail,_txtphone,_txtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aregister);
        openHelper=new DatabaseHelper(this);
        _btnreg=(Button)findViewById(R.id.register);
        _btnlogin=(TextView) findViewById(R.id.login);

        _txtname=(EditText)findViewById(R.id.name);
        _txtemail=(EditText)findViewById(R.id.email);
        _txtphone=(EditText)findViewById(R.id.number);
        _txtpass=(EditText)findViewById(R.id.pass);

        _btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* db=openHelper.getWritableDatabase();
                String name=_txtname.getText().toString();
                String email=_txtemail.getText().toString();
                String phone=_txtphone.getText().toString();
                String pass=_txtpass.getText().toString();
                insertdata(name,email,phone,pass);
*/

                //validation
                name1=_txtname.getText().toString();
                pw=_txtpass.getText().toString();

                mail=_txtemail.getText().toString();
                no=_txtphone.getText().toString();
                if(!validate()){
                    Toast.makeText(getApplicationContext(),"Check Details & Try again",Toast.LENGTH_LONG).show();
                }else {

                    db=openHelper.getWritableDatabase();
                    String name=_txtname.getText().toString();
                    String email=_txtemail.getText().toString();
                    String phone=_txtphone.getText().toString();
                    String pass=_txtpass.getText().toString();
                    insertdata(name,email,phone,pass);

                    Toast.makeText(getApplicationContext(), "register successfully", Toast.LENGTH_LONG).show();


                    Intent in = new Intent(getApplicationContext(), signin.class);
                    PendingIntent pi = (PendingIntent) PendingIntent.getActivities(getApplicationContext(), 0, new Intent[]{in}, 0);
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(phone, null, "Successfully Registered in Travel Guide", pi, null);

                    Intent intent = new Intent(aregister.this, signin.class);
                    startActivity(intent);
                }

            }
        });


        _btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aregister.this,signin.class);
                startActivity(intent);
            }
        });
    }


    public boolean validate(){
        if(name1.isEmpty()){
            _txtname.setError("Enter the Name");
            return false;
        }
        if(pw.isEmpty()){
            _txtpass.setError("Enter the Password");
            return false;
        }

        if(mail.isEmpty()){
            _txtemail.setError("Enter the Mail Id");
            return false;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
            _txtemail.setError("Invalid Format,try Again");
            return false;
        }
        if(no.isEmpty()){
            _txtphone.setError("Enter Mobile Number");
            return false;
        }
        if(no.length()!=10){
            _txtphone.setError("Invalid Number,Enter Correct Number");
            return false;
        }

        return true;
    }

    public void insertdata(String name,String email,String phone,String pass){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_2,name);
        contentValues.put(DatabaseHelper.COL_3,email);
        contentValues.put(DatabaseHelper.COL_4,phone);
        contentValues.put(DatabaseHelper.COL_5,pass);
        long id=db.insert(DatabaseHelper.TABLE_FIRST_NAME,null, contentValues);
    }

}

