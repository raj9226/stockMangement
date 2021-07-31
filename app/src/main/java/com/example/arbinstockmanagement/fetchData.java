package com.example.arbinstockmanagement;

import android.database.Cursor;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class fetchData extends AppCompatActivity {
    RecyclerView recv;
    ArrayList<model> dataholder;
    protected void onCreate(Bundle SaveInstanceState) {

        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_product__view);
        recv =(RecyclerView)findViewById(R.id.recview);
        recv.setLayoutManager(new LinearLayoutManager(this));
        Cursor cursor = new DBManager(this).readalldata();

        while (cursor.moveToNext()){
            model obj =new model(cursor.getString(1),Float.parseFloat(cursor.getString(2)),Float.parseFloat(cursor.getString(3)));
            dataholder.add(obj);
        }
        myAdapter adp =new myAdapter(dataholder);
        recv.setAdapter(adp);
    }
}
