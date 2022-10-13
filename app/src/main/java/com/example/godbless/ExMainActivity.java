/*package com.example.godbless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Admin;
    private Button User;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Admin = findViewById(R.id.btnAdmin);
        User = findViewById(R.id.btnUser);


        Admin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdminPanel.class);
                startActivity(intent);
            }
    });

        User.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserPanel.class);
                startActivity(intent);
            }
        });

    }

}*/