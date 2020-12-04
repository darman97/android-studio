package com.example.darman_tugas10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Luas extends AppCompatActivity {

    TextView HasilLuas;
    public static final String KUNCI_LUAS="luas";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        Inisiasi();
        Hasi_Luas();
    }
    private void Inisiasi(){
        HasilLuas=findViewById(R.id.hasilLuas);
    }
    private void Hasi_Luas(){
        Intent intent = getIntent();
        int Nilai_Luas = intent.getIntExtra(KUNCI_LUAS,0);
        HasilLuas.setText("Luas Peregi adalah "+Nilai_Luas);
    }
}