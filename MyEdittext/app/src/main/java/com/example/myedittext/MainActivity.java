package com.example.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edittext_one,edittext_two;
    private Button button_one,button_two;
    private TextView text_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext_one = (EditText) findViewById(R.id.edittext_1);
        edittext_two = (EditText) findViewById(R.id.edittext_2);

        button_one = (Button) findViewById(R.id.button1);
        button_two = (Button) findViewById(R.id.button2);

        text_one = (TextView) findViewById(R.id.textres);



        button_one.setOnClickListener(this);
        button_two.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
      try{
          String numberOne = edittext_one.getText().toString();
          String numbertwo = edittext_two.getText().toString();
          double num1 = Double.parseDouble(numberOne);
          double num2 = Double.parseDouble(numbertwo);

            if(v.getId() == R.id.button1){
                double sum = num1 + num2 ;
                text_one.setText("result : " + sum);

            }else if(v.getId() == R.id.button2){
                double sum = num1 - num2 ;
                text_one.setText("result : " + sum);
            }

      }catch (Exception e){
          if(edittext_one.getText().toString().trim().length() == 0 || edittext_two.getText().toString().trim().length() == 0){
              Toast.makeText(MainActivity.this,"all field are required",Toast.LENGTH_LONG).show();
          }
      }
    }
}