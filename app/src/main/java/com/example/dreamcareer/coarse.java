package com.example.dreamcareer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class coarse extends AppCompatActivity {

    TextView t6;
    ImageView i3,i4;

    Button b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coarse);
        t6=(TextView) findViewById(R.id.t6);
        i3=(ImageView) findViewById(R.id.i3);
        i4=(ImageView) findViewById(R.id.i4);
        b3=(Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(coarse.this, pcmb.class);
                startActivity(intent);
                Toast.makeText(coarse.this, "PCMB is Selected", Toast.LENGTH_SHORT).show();
            }
        });
        b4=(Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(coarse.this, pcb.class);
                startActivity(intent);
                Toast.makeText(coarse.this, "PCB is Selected", Toast.LENGTH_SHORT).show();

            }
        });
        b5=(Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(coarse.this, pcm.class);
                startActivity(intent);
                Toast.makeText(coarse.this, "PCM is Selected", Toast.LENGTH_SHORT).show();

            }
        });
        b6=(Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(coarse.this, arts.class);
                startActivity(intent);
                Toast.makeText(coarse.this, "XII arts is Selected", Toast.LENGTH_SHORT).show();
            }
        });
        b7=(Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(coarse.this, commerce.class);
                startActivity(intent);
                Toast.makeText(coarse.this, "XII Commerce is Selected", Toast.LENGTH_SHORT).show();
            }
        });
        b8=(Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(coarse.this, others.class);
                startActivity(intent);
                Toast.makeText(coarse.this, "Other Paths is Selected", Toast.LENGTH_SHORT).show();
            }
        });


    }
}