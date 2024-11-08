package com.example.dreamcareer;

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

public class pcmb extends AppCompatActivity {

    TextView t7,t8;
    Button b9,b18;
    LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pcmb);
        t7=(TextView) findViewById(R.id.t7);
        t8=(TextView) findViewById(R.id.t8);
        main=(LinearLayout) findViewById(R.id.main);
        b18=(Button) findViewById(R.id.b18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pcmb.this, coarse.class);
                startActivity(intent);
            }
        });
        b9=(Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(pcmb.this)
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
                                                Toast.makeText(pcmb.this, "Are you sure you want to proceed?", Toast.LENGTH_LONG).show();
                                            }
                                        })
                                        .show();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNeutralButton("Wait", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(pcmb.this, "Ok", Toast.LENGTH_LONG).show();
                            }
                        }).show();
                Intent intent=new Intent(pcmb.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}