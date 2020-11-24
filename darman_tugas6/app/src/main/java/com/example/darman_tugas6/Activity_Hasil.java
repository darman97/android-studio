package com.example.darman_tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Activity_Hasil extends AppCompatActivity {

    TextView Nilai;
    TextView Nilai_alas;
    TextView Nilai_tinggi;
    private  int Alas;
    private int Tinggi;
    private double Luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hasil);

        Inisial();
        Var();
        Hitung();
        Cetak();
    }
    private void Inisial(){
        Nilai_alas=findViewById(R.id.textViewAlas);
        Nilai_tinggi=findViewById(R.id.textViewTinggi);
        Nilai = findViewById(R.id.textViewHasil);

    }
    private void Var(){
        Intent In=getIntent();
        Alas= In.getExtras().getInt("alas",0);
        Tinggi=In.getExtras().getInt("tinggi",0);
    }
    private void Hitung(){
        Luas=(Alas*Tinggi)*0.5;
    }
    private void Cetak(){
        DecimalFormat presisi = new DecimalFormat("0.00");

        Nilai.setText("Luas Segitiga : " + presisi.format(Luas));
        Nilai_alas.setText("Alas = "+presisi.format(Alas));
        Nilai_tinggi.setText("Tinggi = "+presisi.format(Tinggi));
    }
}