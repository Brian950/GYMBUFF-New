package com.gymbuffapp.gymbuff;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;


import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Brian on 25/03/2017.
 */

public class Database{

    private DatabaseHelper dbHelper;
    private SQLiteDatabase database;

    public final static String USERS_TABLE="users"; //table names

    public final static String USER_NAME="username";
    public final static String PASSWORD="password";

    public Database(Context context){
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public long insertQuery(String id, String name){
        ContentValues values = new ContentValues();
        values.put(USER_NAME, id);
        values.put(PASSWORD, name);
        return database.insert(USERS_TABLE, null, values);
    }

    public Cursor runQuery(String query, String[] args) {
        Cursor mCursor = database.rawQuery(query, args);
        if (mCursor.moveToFirst()) {
            mCursor.moveToFirst();
        }
        return mCursor; // returns array of data
    }

    public void execSQL(String s) {
    }
}
