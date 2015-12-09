package com.jiangzuomeng.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.jiangzuomeng.module.AsyncTaskItem;
import com.jiangzuomeng.module.Comment;
import com.jiangzuomeng.module.Travel;
import com.jiangzuomeng.module.TravelItem;
import com.jiangzuomeng.module.User;

/**
 * Created by ekuri-PC on 2015/11/21.
 */
public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "ManLvTu.db";
    public static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // user table
        db.execSQL(User.makeCreateTableSQLString());

        // travel table
        db.execSQL(Travel.makeCreateTableSQLString());

        // travel item table
        db.execSQL(TravelItem.makeCreateTableSQLString());

        // comment table
        db.execSQL(Comment.makeCreateTableSQLString());

        // AsyncTaskItem table
        db.execSQL(AsyncTaskItem.makeCreateTableSQLString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
