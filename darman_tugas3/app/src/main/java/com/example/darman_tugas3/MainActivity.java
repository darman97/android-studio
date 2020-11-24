package com.example.darman_tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        Submit = findViewById(R.id.submit);
    }

    private void Listen_B_Submit() {
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Ini adalah pesan.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}