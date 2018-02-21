package com.example.rezqflex.rezq.database;

/**
 * Created by danielg on 2018-02-21.
 */

public class DbSchema {
    public static final class DataTable{
        public static final String NAME = "items";
        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE= "title";
            public static final String LINK = "link";
            public static final String TIME = "time";
            public static final String RATING = "rating";
            public static final String GENRE = "genre";
            public static final String RELEASE_DATE = "releasedate";
            public static final String NUM_EPISODES = "numepisodes";
            public static final String PHOTO_ID = "photoid";
        }
    }
}
