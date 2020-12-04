package com.example.darman_tugas10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Keliling extends AppCompatActivity {

    TextView Hasil_keliling;
    public static final String KUNCI_KELL="kell";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling);

        Inisiasi();
        Hasil_Keliling();
    }
    private void Inisiasi(){
        Hasil_keliling=findViewById(R.id.textView_keliling);
    }
    private void Hasil_Keliling(){
        Intent intent=getIntent();
        int Nilai_Kell=intent.getIntExtra(KUNCI_KELL,0);
        Hasil_keliling.setText("Keliling Persegi adalah "+Nilai_Kell);
    }
}