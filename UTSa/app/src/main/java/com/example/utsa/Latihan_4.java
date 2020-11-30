package com.example.utsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Latihan_4 extends AppCompatActivity {
    Button B_Submit;
    EditText E_Pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_4);
        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        B_Submit = findViewById(R.id.Submit_4);
        E_Pesan = findViewById(R.id.editText_Main_Pesan);
    }

    private void Listen_B_Submit() {
        B_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Pesan = E_Pesan.getText().toString();
                Toast.makeText(Latihan_4.this, Pesan, Toast.LENGTH_SHORT).show();
            }
        });
    }

}