package com.example.user.nursery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Seeds extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model>seeds_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeds);

        seeds_list= new ArrayList<>();
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        seeds_list.add(new Model(R.drawable.rose,"Rose","120 rs"));
        seeds_list.add(new Model(R.drawable.lotus,"Lotus","160 rs"));
        seeds_list.add(new Model(R.drawable.abuli,"Abuli","100 rs"));

        adapter= new SeedsAdapter(seeds_list,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}
