package com.example.rezqflex.rezq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;

import com.example.rezqflex.rezq.database.DatabaseHelper;
import com.example.rezqflex.rezq.database.DbSchema;
import com.example.rezqflex.rezq.database.DatabaseCursorWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by danielg on 2018-02-21.
 */

public class ItemLab {
    private static ItemLab sItemLab;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static ItemLab get(Context context){
        if(sItemLab == null){
            sItemLab = new ItemLab(context);
        }
        return sItemLab;
    }


    private ItemLab(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new DatabaseHelper(mContext).getWritableDatabase();
    }

    public void addItem(Item item){
        ContentValues values = getContentValues(item);
        mDatabase.insert(DbSchema.DataTable.NAME, null, values);
    }
    public void deleteItem(Item item){
        mDatabase.delete(DbSchema.DataTable.NAME, DbSchema.DataTable.Cols.UUID + " = ?", new String[]{item.getId().toString()});
    }

    public List<Item> getItems(){
        List<Item> items = new ArrayList<>();
        DatabaseCursorWrapper cursor = queryItems(null,null);
        cursor.moveToFirst();

            while(!cursor.isAfterLast()){
                items.add(cursor.getItem());
                cursor.moveToNext();
            }
            cursor.close();
            return items;
    }

    public Item getItem(UUID id){
        DatabaseCursorWrapper cursor = queryItems(DbSchema.DataTable.Cols.UUID + " = ?",
                new String[]{id.toString()});
    try{

            if(cursor.getCount()==0){
                return null;
            }
            cursor.moveToFirst();
            return cursor.getItem();
        }
        finally {
            cursor.close();
        }
    }

    public void updateItem(Item item){
        String uuidString = item.getId().toString();
        ContentValues values = getContentValues(item);
        mDatabase.update(DbSchema.DataTable.NAME, values, DbSchema.DataTable.Cols.UUID + " = ?", new String[]{uuidString});

    }

    private DatabaseCursorWrapper queryItems(String whereClause, String[] whereArgs){

        Cursor cursor = mDatabase.query(
                DbSchema.DataTable.NAME,
                null, //null selects all columns
                whereClause,
                whereArgs,
                null,//groupBy
                null, // having
                null //orderBy
        );
        return new DatabaseCursorWrapper(cursor);

    }

    private static ContentValues getContentValues(Item item){
        ContentValues values = new ContentValues();
        values.put(DbSchema.DataTable.Cols.UUID, item.getId().toString());
        values.put(DbSchema.DataTable.Cols.TITLE, item.getmTitle());
        values.put(DbSchema.DataTable.Cols.LINK, item.getmLink());
        values.put(DbSchema.DataTable.Cols.TIME, item.getmTime());
        values.put(DbSchema.DataTable.Cols.RATING, item.getRating());
        values.put(DbSchema.DataTable.Cols.GENRE, item.getGenre());
        values.put(DbSchema.DataTable.Cols.RELEASE_DATE, item.getRelease_Date());
        values.put(DbSchema.DataTable.Cols.NUM_EPISODES, item.getNum_episodes());
        values.put(DbSchema.DataTable.Cols.PHOTO_ID, item.getPhotoID());
        return values;
    }
}
