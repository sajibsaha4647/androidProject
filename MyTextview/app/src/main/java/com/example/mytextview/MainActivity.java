package com.example.mytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
//import android.widget.LinearLayout;
//import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {



    private LinearLayout nameTextview ;
    private TextView newtexts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextview = (LinearLayout) findViewById(R.id.listTextView);
        newtexts = (TextView) findViewById(R.id.textFirst);
        newtexts.setText("sajib you are great");
    }
}