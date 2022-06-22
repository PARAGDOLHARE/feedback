package com.example.feedback;


import android.app.Activity;
import android.os.Bundle;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class location extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_location);
        Button b1= findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(location.this,review.class);

                EditText editText=(EditText) findViewById(R.id.editTextTextPersonName);

                String next =editText.getText().toString();
                // String next =editText1.getText().toString();
                intent.putExtra("Next",next);
                startActivity(intent);
            }
        });
    }}


