package com.example.feedback;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class location extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("Wrongconstant")
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(location.this, review.class);

                EditText editText1 = (EditText) findViewById(R.id.editTextlocation);
                String next = editText1.getText().toString();
                if (next.equals("toilet 1")||next.equals("toilet 2")||next.equals("toilet 3")||next.equals("TOILET 1")||next.equals("TOILET 2")||next.equals("TOILET 3")||next.equals("Toilet 1")||next.equals("Toilet 2")||next.equals("Toilet 3")){
                    editText1.setVisibility(1);

                    intent.putExtra("Next", next);

                    startActivity(intent);

                }
                else {
                    Toast.makeText(location.this, "Location can't be empty", Toast.LENGTH_SHORT).show();
                    editText1.setVisibility(0);
                }


            }
        });
    }
}


