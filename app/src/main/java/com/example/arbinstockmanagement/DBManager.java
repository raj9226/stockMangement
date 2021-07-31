package com.example.arbinstockmanagement;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBManager extends SQLiteOpenHelper {

    private  static  String dbName = "store.db";
    public DBManager(Context context) {
        super(context, dbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table products (product_Id integer primary key autoincrement,product_name String, product_quantity float,product_rate float )";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS products");
        onCreate(db);
    }

    public String addRecord(String p1, float quantity, float rate){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("product_name",p1);
        cv.put("product_quantity",quantity);
        cv.put("product_rate",rate);
        long res= db.insert("products",null,cv);
        if(res==-1){
            return "fail";
        }
        return "Successfully added";

    }

    public Cursor readalldata() {
        SQLiteDatabase db =this.getWritableDatabase();
        String query ="Select * from products p order by p.product_name asc";
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
}
