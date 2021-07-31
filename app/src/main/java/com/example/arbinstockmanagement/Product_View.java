package com.example.arbinstockmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Product_View extends AppCompatActivity {

    EditText t1,t2,t3;
    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product__view);
        t1=(EditText)findViewById(R.id.prodName);
        t2=(EditText)findViewById(R.id.quant);
        t3=(EditText)findViewById(R.id.price);
        fetchData f = new fetchData();
    }

    public void addProduct(View view) {
        DBManager db =new DBManager(this);
        String res = db.addRecord(t1.getText().toString(), Float.parseFloat(t2.getText().toString()),Float.parseFloat(t3.getText().toString()));
        Toast.makeText(this,res,Toast.LENGTH_LONG).show();
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
}