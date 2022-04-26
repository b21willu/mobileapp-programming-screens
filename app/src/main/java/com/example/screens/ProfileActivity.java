package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView nameText, ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);


        nameText = findViewById(R.id.UserName);
        ageText = findViewById(R.id.Age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int number = extras.getInt("number");
            // Do something with the name and number
            nameText.setText("Hi! "+name);
            ageText.setText("Your age is: "+number);
        }
    }
}