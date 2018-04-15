package com.example.tanish.thegladiators;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    String PasswordString;
    String UsernameString;
    EditText Username1;
    EditText Password1;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username1 = findViewById(R.id.Username);
        Password1 = findViewById(R.id.Password);
        UsernameString = Username1.getText().toString();
        PasswordString = Password1.getText().toString();
        Submit = findViewById(R.id.Submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(UsernameString)) {
                    Username1.setError("Email Required");
                }
                if (TextUtils.isEmpty(PasswordString)) {
                    Password1.setError("Password Required");
                }
                Intent i = new Intent(MainActivity.this, Menu.class);
                startActivity(i);
            }
        });
    }
}