package com.example.tanish.thegladiators;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button Medicines;
        Button Diseases;
        Button Locate;
        Button Chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Medicines = findViewById(R.id.Medicines);
        Diseases = findViewById(R.id.Diseases);
        Locate = findViewById(R.id.Locate);
        Chat = findViewById(R.id.Contact);
        Medicines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Medicines.class);
                startActivity(i);
            }
        });
        Diseases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Medicines.class);
                startActivity(i);
            }
        });
        Locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Locate.class);
                startActivity(i);
            }
        });
        Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Chat.class);
                startActivity(i);
            }
        });

    }
}
