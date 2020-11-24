package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Latihan_3 extends AppCompatActivity {
    Button L3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_3);

        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        L3 = findViewById(R.id.button_l3);
    }

    private void Listen_B_Submit() {
        L3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Latihan_3.this,"Ini adalah pesan.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}