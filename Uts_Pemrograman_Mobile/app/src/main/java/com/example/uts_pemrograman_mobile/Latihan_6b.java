package com.example.uts_pemrograman_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Latihan_6b extends AppCompatActivity {

    TextView Nilai;
    private int Alas;
    private int Tinggi;
    private  double Luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_6b);
        Inisiasi();
        Var();
        Hitung();
        Cetak();
    }
    private void
    Inisiasi(){
        Nilai= findViewById(R.id.hasil);
    }private void Var(){
        Intent In =getIntent();
        Alas=In.getExtras().getInt("alas",0);
        Tinggi=In.getExtras().getInt("tinggi",0);
    }
    private void Hitung(){
        Luas=(Alas*Tinggi)*0.5;
    }
    private void Cetak(){
        DecimalFormat presisi=new DecimalFormat("0.00");
        Nilai.setText("Luas Segitiga = "+ presisi.format(Luas));
    }
}