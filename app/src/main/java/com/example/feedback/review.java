package com.example.feedback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class review extends AppCompatActivity {
    private FirebaseFirestore db;
    EditText data;
    EditText date;
    Button btnEnter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        data = findViewById(R.id.dataFeedback);
        date = findViewById(R.id.date);
        btnEnter = findViewById(R.id.sendfeedback);

        //Initialize FirebaseFirestore
        db = FirebaseFirestore.getInstance();


        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String, Object> user = new HashMap<>();
                //EditText to string
                String txtdate = date.getText().toString();
                user.put("Date",txtdate);
                String txtdata = data.getText().toString();
                user.put("Feedback", txtdata);


                db.collection("users")
                        .add(user)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(review.this,"Feedback stored Successfully!", Toast.LENGTH_LONG).show();
                                data.setText(" ");
                                date.setText(" ");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(review.this,"Error -" + e.getMessage(), Toast.LENGTH_LONG).show();
                                Log.e("TAG","Received an Error" + e.getMessage());

                            }
                        });

            }
        });


    }
}
