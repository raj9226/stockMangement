package com.example.arbinstockmanagement;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myviewHolder> {

    ArrayList<model>dataholder;

    public myAdapter(ArrayList<model> dataholder) {
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
       holder.product_name.setText(dataholder.get(position).getProduct_name());
       holder.prouct_quantity.setText(dataholder.get(position).getProduct_quantity().toString());
       holder.product_rate.setText(dataholder.get(position).getProduct_price().toString());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewHolder extends RecyclerView.ViewHolder{

        TextView product_name,prouct_quantity,product_rate;
        public myviewHolder(@NonNull View itemView) {
            super(itemView);
            product_name=(TextView)itemView.findViewById(R.id.prodName);
            prouct_quantity=(TextView)itemView.findViewById(R.id.quant);
            product_rate=(TextView)itemView.findViewById(R.id.price);
        }
    }

}
