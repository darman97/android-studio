package com.example.uts_pemrograman_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Latihan_5 extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_5);
        Inisial();
        Listen_B_Submit();
    }
    private void Inisial(){
        button = findViewById(R.id.button5a);
    }
    private void Listen_B_Submit(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Latihan_5.this,Latihan_5b.class);
                startActivity(intent);
            }
        });
    }
}