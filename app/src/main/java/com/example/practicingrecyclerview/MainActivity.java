package com.example.practicingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListData[] myListData = new ListData[]{
                new ListData("eeeeeee"),
                new ListData("soso"),
                new ListData("koko"),
                new ListData("dodo")

        };
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ListAdapter adapter = new ListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}