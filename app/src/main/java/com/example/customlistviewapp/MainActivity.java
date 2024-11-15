package com.example.customlistviewapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] itemNames = {"Item 1", "Item 2", "Item 3", "Item 4"};
    int[] itemImages = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // CustomAdapter instance তৈরি
        CustomAdapter adapter = new CustomAdapter(this, itemNames, itemImages);
        listView.setAdapter(adapter);
    }
}


