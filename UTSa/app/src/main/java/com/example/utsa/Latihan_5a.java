package com.example.utsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Latihan_5a extends AppCompatActivity {
    Button B_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_5a);
        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        B_Submit = findViewById(R.id.button_Main_Submit_5);
    }

    private void Listen_B_Submit() {
        B_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Latihan_5a.this, Latihan_5b.class);
                startActivity(intent);
            }
        });
    }

}