package com.example.dreamcareer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login_page extends AppCompatActivity {

    TextView t3, t4;
    ImageView i2;
    EditText et1, et3;
    Button b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        et1 = findViewById(R.id.et1);
        et3 = findViewById(R.id.et3);
        i2 = findViewById(R.id.i2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(login_page.this, coarse.class);
                startActivity(intent1);
            }
        });


        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_page.this, signup.class);
                startActivity(intent);
            }
        });

    }
}
