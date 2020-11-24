package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Latihan1;
    Button Latihan2;
    Button Latihan3;
    Button Latihan4;
    Button Latihan5;
    Button Latihan6;
    Button Latihan7;
    Button Latihan8;
    Button Latihan9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inisiasi();
        Pilihan();
    }public void Inisiasi(){
        Latihan1=findViewById(R.id.latihan1);
        Latihan2=findViewById(R.id.latihan2);
        Latihan3=findViewById(R.id.latihan3);
        Latihan4=findViewById(R.id.latihan4);
        Latihan5=findViewById(R.id.latihan5);
        Latihan6=findViewById(R.id.latihan6);
        Latihan7=findViewById(R.id.latihan7);
        Latihan8=findViewById(R.id.latihan8);
        Latihan9=findViewById(R.id.latihan9);
    }
    public void Pilihan(){
        Latihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Latihan_1.class);
                startActivity(intent);
            }
        });
        Latihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Latihan_2.class);
                startActivity(intent);
            }

        });
        Latihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Latihan_3.class);
                startActivity(intent);
            }

        });
        Latihan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Latihan_4.class);
                startActivity(intent);
            }

        });
        Latihan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latihan_5a.class);
                startActivity(intent);
            }

        });

        Latihan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latihan_6a.class);
                startActivity(intent);
            }

        });

        Latihan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latihan_7.class);
                startActivity(intent);
            }

        });

        Latihan8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latihan_8.class);
                startActivity(intent);
            }

        });

        Latihan9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latihan_9.class);
                startActivity(intent);
            }

        });



    }

}