package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Latihan_6a extends AppCompatActivity {
    EditText Alas;
    EditText Tinggi;
    Button Hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_6a);

        Inisial();
        Hitung();
    }
    private void  Inisial(){
        Alas = findViewById(R.id.alas);
        Tinggi =findViewById(R.id.tinggi);
        Hitung =findViewById(R.id.button_l6);
    }
    private  void Hitung(){
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer E_Alas = Integer.parseInt(Alas.getText().toString());
                Integer E_Tinggi = Integer.parseInt(Tinggi.getText().toString());
                Intent In= new Intent(Latihan_6a.this,Latihan_6b.class);
                In.putExtra("alas",E_Alas);
                In.putExtra("tinggi",E_Tinggi);
                startActivity(In);
            }
        });
    }
}