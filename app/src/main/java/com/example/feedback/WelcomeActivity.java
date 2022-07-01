package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class WelcomeActivity extends AppCompatActivity {
    Button btnlogout;
    Button btngetfeedback;
    FirebaseAuth mAuthFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnlogout = findViewById(R.id.btnLogout);
        btngetfeedback = findViewById(R.id.btngetfeedback);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intToBack = new Intent(WelcomeActivity.this,LoginActivity.class);
                startActivity(intToBack);

            }
        });

        btngetfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(WelcomeActivity.this,DataActivity.class);
                startActivity(int1);
            }
        });
    }
}



