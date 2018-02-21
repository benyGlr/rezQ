package com.example.rezqflex.rezq.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.rezqflex.rezq.Genres;
import com.example.rezqflex.rezq.Item;

import java.util.Date;
import java.util.UUID;

/**
 * Created by danielg on 2018-02-21.
 */

public class DatabaseCursorWrapper extends CursorWrapper {
    public DatabaseCursorWrapper(Cursor cursor){
        super(cursor);
    }

    public Item getItem(){
        String uuidString = getString(getColumnIndex(DbSchema.DataTable.Cols.UUID));
        String title = getString(getColumnIndex(DbSchema.DataTable.Cols.TITLE));
        String link = getString(getColumnIndex(DbSchema.DataTable.Cols.LINK));
        int time = getInt(getColumnIndex(DbSchema.DataTable.Cols.TIME));
        int rating = getInt(getColumnIndex(DbSchema.DataTable.Cols.RATING));
        String genre = getString(getColumnIndex(DbSchema.DataTable.Cols.GENRE));
        String release_date = getString(getColumnIndex(DbSchema.DataTable.Cols.RELEASE_DATE));
        int num_episodes = getInt(getColumnIndex(DbSchema.DataTable.Cols.NUM_EPISODES));
        int photo_id = getInt(getColumnIndex(DbSchema.DataTable.Cols.PHOTO_ID));



        Item item = new Item(UUID.fromString(uuidString));
        item.setmTitle(title);
        item.setmLink(link);
        item.setmTime(time);
        item.setRating(rating);
        item.setGenre(genre);
        item.setRelease_Date(release_date);
        item.setNum_episodes(num_episodes);
        item.setPhotoID(photo_id);



        return item;


    }
}
