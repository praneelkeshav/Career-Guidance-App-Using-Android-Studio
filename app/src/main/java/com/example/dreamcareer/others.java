package com.example.dreamcareer;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class others extends AppCompatActivity {

    TextView t17,t18;
    Button b14,b19;
    LinearLayout main;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_others);
        t17=(TextView) findViewById(R.id.t17);
        t18=(TextView) findViewById(R.id.t18);
        main=(LinearLayout) findViewById(R.id.main);
        b19=(Button) findViewById(R.id.b19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(others.this, coarse.class);
                startActivity(intent);
            }
        });
        b14=(Button) findViewById(R.id.b14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(others.this)
                        .setIcon(R.drawable.icon)
                        .setTitle("Home")
                        .setMessage("Pending Request")
                        .setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Snackbar.make(main, "Your password is valid", BaseTransientBottomBar.LENGTH_LONG)
                                        .setAction("Toast", new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Toast.makeText(others.this, "Are you sure you want to proceed?", Toast.LENGTH_LONG).show();
                                            }
                                        })
                                        .show();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setNeutralButton("Wait", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(others.this, "Ok", Toast.LENGTH_LONG).show();
                            }
                        }).show();
                Intent intent=new Intent(others.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}