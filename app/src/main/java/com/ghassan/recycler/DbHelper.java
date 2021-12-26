package com.ghassan.recycler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {
    public static final String id = "FRIENDId";
    //    public static final String imageId="FRIENDImageId";
    public static final String dob = "FRIENDDob";
    public static final String name = "FRIENDName";
    public static final String city = "FRIENDCity";
    public static final String FRIEND_TABLE = "FriendTable";


    public DbHelper(@Nullable Context context) {
        super(context, "friendsDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + FRIEND_TABLE + "(" + id + " Integer PRIMARY KEY AUTOINCREMENT, " + name + "TEXT, " + city + " TEXT" + dob + "Integer )";
        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FRIEND_TABLE);
        onCreate(db);
    }


    public void addFriend(Friends friend) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(name, friend.getName());
        cv.put(city, friend.getCity());
        cv.put(dob, friend.getDob());
        db.insert(FRIEND_TABLE, null, cv);
        db.close();

    }

    public ArrayList<Friends> getAllFriends() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorCourses = db.rawQuery("SELECT *  FROM " + FRIEND_TABLE, null);
        ArrayList<Friends> friendsArrayList = new ArrayList<>();
        if (cursorCourses.moveToFirst()) {
            do {
                friendsArrayList.add(new Friends(cursorCourses.getString(1), cursorCourses.getString(2), cursorCourses.getInt(3)));
            } while (cursorCourses.moveToNext());
        }
        cursorCourses.close();
    return friendsArrayList;
    }
}