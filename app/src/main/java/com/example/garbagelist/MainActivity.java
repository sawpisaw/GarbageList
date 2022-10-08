package com.example.garbagelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<User> usersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        setUpUser();
        recyclerAdapter adapter = new recyclerAdapter(this,
                usersList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
    private void setUpUser() {
        String [] garbageBin = getResources().getStringArray(R.array.garbage_bin);
        String [] garbageStatus = getResources().getStringArray(R.array.garbage_status);
        String [] garbageLvl = getResources().getStringArray(R.array.garbage_level);
        for (int i = 0; i< garbageBin.length; i++){
            usersList.add(new User (garbageBin[i],
                    garbageStatus[i],
                    garbageLvl[i]));
        }
    }
}