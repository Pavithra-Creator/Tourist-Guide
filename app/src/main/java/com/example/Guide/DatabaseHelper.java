package com.example.Guide;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="travel.db";
    public static final String TABLE_FIRST_NAME="register";
    public static final String TABLE_SECOND_NAME="feedback";

    public static final String COL_1="ID";
    public static final String COL_2="Name";
    public static final String COL_3="Email";
    public static final String COL_4="Phone";
    public static final String COL_5="Password";
    public static final String COLUMN_2="Command";





    //feedback db




    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_FIRST_NAME  + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,Email TEXT,Phone TEXT,Password TEXT)");
        db.execSQL("CREATE TABLE " + TABLE_SECOND_NAME  + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Command TEXT)");


    }




    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_FIRST_NAME);

        db.execSQL("DROP TABLE IF EXISTS "+TABLE_SECOND_NAME); //DROP OLD TABLE IF EXITS
        onCreate(db);
    }
}
