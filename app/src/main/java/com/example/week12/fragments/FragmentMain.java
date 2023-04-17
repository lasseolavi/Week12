package com.example.week12.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.week12.Item;
import com.example.week12.ItemListAdapter;
import com.example.week12.ItemStorage;
import com.example.week12.MainActivity;
import com.example.week12.R;

import java.util.ArrayList;


public class FragmentMain extends Fragment {

    private RecyclerView recyclerView;
    private ItemListAdapter itemListAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        recyclerView = view.findViewById(R.id.rvItemList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        itemListAdapter = new ItemListAdapter(getActivity(), ItemStorage.getInstance().getItems());
        recyclerView.setAdapter(itemListAdapter);

        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    /*
    private RecyclerView recyclerView;

    private ItemStorage itemStorage;
    private  ItemListAdapter itemListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemStorage = ItemStorage.getInstance();

        recyclerView = findViewById(R.id.rvItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemListAdapter = new ItemListAdapter(this,itemStorage.getItems(), recyclerView);
        itemListAdapter.sortItemsByTime(itemStorage.getItems());
        recyclerView.setAdapter(itemListAdapter);


    }
    protected void onResume() {
        super.onResume();
        itemListAdapter.notifyDataSetChanged();
    }
    public void switchToAddItem(View view){
        Intent intent = new Intent(this, addItemActivity.class);
        startActivity(intent);
    }*/
    }
}