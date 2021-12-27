package com.ghassan.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv ;
    RecyclerView.Adapter ad;
    RecyclerView.LayoutManager lm;

    List <Friends> friendsList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Friends f0 = new Friends("Ghassan", "Lahore",190399);
        Friends f1 = new Friends("Taimour", "Sialkot",101298);
        Friends f2 = new Friends("Hassnain", "Bewal",130698);

        friendsList.add(f0);
        friendsList.add(f1);
        friendsList.add(f2);

        rv= findViewById(R.id.rcV);

        lm= new LinearLayoutManager(MainActivity.this);
        rv.setAdapter(ad);
        ad= new RecycleAdapter(friendsList);

        lm= new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL, false);

        rv.setLayoutManager(lm);




    }
}