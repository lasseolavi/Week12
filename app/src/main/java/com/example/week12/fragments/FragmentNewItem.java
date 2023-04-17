package com.example.week12.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.week12.Item;
import com.example.week12.ItemStorage;
import com.example.week12.R;

import java.util.ArrayList;


public class FragmentNewItem extends Fragment {

    private EditText addItemET, addNoteET;
    private Button addItemButton;
    private CheckBox importantItem;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_item, container, false);
        addItemET = view.findViewById(R.id.newItemEditText);
        addNoteET = view.findViewById(R.id.noteEditText);
        importantItem = view.findViewById(R.id.importantItemCheckBox);
        boolean importantItemChecked = importantItem.isChecked();
        addItemButton = view.findViewById(R.id.addItemButton);
        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newItemName = addItemET.getText().toString();
                String newItemNote = addNoteET.getText().toString();
                Item newItem = new Item(newItemName, newItemNote, importantItemChecked);
                ItemStorage itemStorage = ItemStorage.getInstance();
                itemStorage.addItem(newItem);
            }
        });

        return view;
    }
}