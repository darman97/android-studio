package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Latihan_5a extends AppCompatActivity {

    Button L5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_5);
        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        L5 = findViewById(R.id.button_l5);
    }

    private void Listen_B_Submit() {
        L5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Latihan_5a.this,Latihan_5b.class);
                startActivity(intent);
            }
        });
    }

}