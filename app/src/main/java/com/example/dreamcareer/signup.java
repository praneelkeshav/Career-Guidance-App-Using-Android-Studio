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

public class signup extends AppCompatActivity {

    TextView t5;
    EditText et1,et2,et3,et4,et5,et6;

    ImageView i1;

    Button b1;
    Spinner s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        t5=(TextView) findViewById(R.id.t5);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);
        et4=(EditText) findViewById(R.id.et4);
        et5=(EditText) findViewById(R.id.et5);
        et6=(EditText) findViewById(R.id.et6);
        i1=(ImageView) findViewById(R.id.i1);
        s1 = findViewById(R.id.s1);
        b1=(Button) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signup.this, coarse.class);
                startActivity(intent);
            }
        });






    }
}