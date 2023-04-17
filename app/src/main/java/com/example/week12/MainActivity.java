package com.example.week12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.week12.fragments.FragmentMain;
import com.example.week12.fragments.FragmentNewItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ItemStorage itemStorage;
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainButton = findViewById(R.id.mainButton);
        Button newItemButton = findViewById(R.id.newItemButton);

        mainButton.setOnClickListener(listener);
        newItemButton.setOnClickListener(listener);
        items = ItemStorage.getInstance().getItems();
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment;

            switch (view.getId()) {
                case R.id.mainButton:
                    fragment = new FragmentMain();
                    Bundle data = new Bundle();

                    break;
                case R.id.newItemButton:
                    fragment = new FragmentNewItem();
                    break;
                default:
                    fragment = new FragmentMain();
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();
        }
    };
}