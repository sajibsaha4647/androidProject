package com.example.buttonwithlistsener;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginbutton;
    private Button loginbutton2;
    private Button loginbutton3;
    private TextView logintext;
    private Object Tost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = (Button) findViewById(R.id.showbutton);
        loginbutton2 = (Button) findViewById(R.id.showbutton2);
        loginbutton3 = (Button) findViewById(R.id.show_message);
        logintext = (TextView) findViewById(R.id.showtext);

//        loginbutton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                logintext.setText("sajib you click this button login");
//            }
//
//        });
//
//        loginbutton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                logintext.setText("sajib you click this button logout");
//            }
//        });


//        loginbutton2.setOnClickListener(this);
//        loginbutton.setOnClickListener(this);
//        loginbutton3.setOnClickListener(this);

    }

//    @Override
//    public void onClick(View v) {
//        if(v.getId() == R.id.showbutton){
//            logintext.setText("sajib you click this button login");
//        }
//        if(v.getId() == R.id.showbutton2){
//            logintext.setText("sajib you click this button logout");
//        }
//    }

    public  void showmessage(View v){

        if(v.getId() == R.id.showbutton2){
//            logintext.setText("sajib you click this button logout");
            Toast.makeText(MainActivity.this,"clicked in login button first 1",Toast.LENGTH_SHORT).show();
        }else if(v.getId() == R.id.showbutton){
            logintext.setText("sajib you click this button login");
        }else if(v.getId() == R.id.show_message){
//            logintext.setText("new text arrieved");

            Log.d("sajib", "you clicked sajib");
        }


    }


}