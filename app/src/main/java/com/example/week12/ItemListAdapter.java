package com.example.week12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ItemListAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context context;

    private ArrayList<Item> listItems;
    private RecyclerView recyclerView;

    public ItemListAdapter(Context context, ArrayList<Item> listItems) {
        this.context = context;
        this.listItems = listItems;
    }



    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.list_view,parent,false),recyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
    public void removeItem(int position) {
        listItems.remove(position);
        notifyItemRemoved(position);
    }


}

