package com.example.sqlitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {

    private  static  final  int VERSION_NAME = 1;
    private static final String DATABASE_NAME = "contactDB";
    private static final String TABLE_NAME = "contact";
    private static final String KEY_ID = "ID";
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE = "phone";


    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NAME);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String create_table = "CREATE Table " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_NAME + " TEXT, " + KEY_PHONE + " TEXT " + ")";
        sqLiteDatabase.execSQL(create_table);

//        SQLiteDatabase database = this.getWritableDatabase();
//        sqLiteDatabase.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    void dbinsert(Contact contact){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.getName());
        values.put(KEY_PHONE, contact.getPhone());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public static List<Contact>getAllContact(Context context){
        List<Contact> contactList = new ArrayList<Contact>();
        String selectquery = "Select * From " + TABLE_NAME;
        SQLiteDatabase db = new DbHelper(context).getReadableDatabase();
        Cursor cursor =  db.rawQuery(selectquery, null);
        if(cursor.moveToFirst()){
            do{
                Contact contact = new Contact();
                contact.setId(Integer.parseInt(cursor.getString(0)));
                contact.setName(cursor.getString(1));
                contact.setPhone(cursor.getString(2));
                contactList.add(contact);
            }while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return contactList;
    }

    //Deleting single contact based on click

    public void deleteContact(int contactId){
        SQLiteDatabase db = this.getWritableDatabase();
        String whereClause = KEY_ID + " =?";
        String[] whereArgs = {String.valueOf(contactId)};
        db.delete(TABLE_NAME, whereClause, whereArgs);
        db.close();
    }
}