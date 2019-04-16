package com.samuelbernard147.mynotesapp.db;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

class DatabaseContract {
//    Content provider
//    Author berupa package name
    public static final String AUTHORITY = "com.samuelbernard147.mynotesapp";
    private static final String SCHEME = "content";

    public DatabaseContract() {
    }

    static final class NoteColumns implements BaseColumns {
        static final String TABLE_NAME = "note";
        //Note title
        static final String TITLE = "title";
        //Note description
        static final String DESCRIPTION = "description";
        //Note date
        static final String DATE = "date";

        public static final Uri CONTENT_URI = new Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build();
    }


//    Content provider
    public static String getColumnString(Cursor cursor, String columnName){
        return cursor.getString(cursor.getColumnIndex(columnName));
    }

    public static int getColumnInt(Cursor cursor, String columnName){
        return cursor.getInt(cursor.getColumnIndex(columnName));
    }

    public static long getColumnLong(Cursor cursor, String columnName){
        return cursor.getLong(cursor.getColumnIndex(columnName));
    }
}