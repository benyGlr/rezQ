package com.example.rezqflex.rezq.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by danielg on 2018-02-21.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "itemBase.db";


    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+ DbSchema.DataTable.NAME +"("+
                "_id integer primary key autoincrement, " +
                DbSchema.DataTable.Cols.UUID+" INTEGER PRIMARY KEY, "+
                DbSchema.DataTable.Cols.TITLE+" TEXT NOT NULL, "+
                DbSchema.DataTable.Cols.LINK+" TEXT NOT NULL, "+
                DbSchema.DataTable.Cols.RATING+" INTEGER DEFAULT 0, "+
                DbSchema.DataTable.Cols.GENRE+" TEXT DEFAULT 'Unavailable', "+
                DbSchema.DataTable.Cols.RELEASE_DATE+"CALENDAR DEFAULT '0-0-0', "+
                DbSchema.DataTable.Cols.NUM_EPISODES+" INTEGER DEFAULT 0, "+
                DbSchema.DataTable.Cols.PHOTO_ID+ " TEXT DEFAULT 'Unavailable');"
        );



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
