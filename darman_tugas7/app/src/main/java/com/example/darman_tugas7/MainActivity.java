package com.example.darman_tugas7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText N_Panjang;
    EditText N_Lebar;
    EditText N_Password;
    Button N_Hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Hitung();
    }
    private void Inisial(){
        N_Panjang = findViewById(R.id.panjang);
        N_Lebar = findViewById(R.id.lebar);
        N_Password = findViewById(R.id.pass);
        N_Hitung = findViewById(R.id.button);
    }
    private void Hitung(){
        N_Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Password =N_Password.getText().toString();
                if (!Password.equals("1111")){
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer Panjang= Integer.parseInt(N_Panjang.getText().toString());
                Integer Lebar= Integer.parseInt(N_Lebar.getText().toString());
                Integer Luas = Panjang*Lebar;
                Integer Keliling=2*(Panjang*Lebar);
                String Pesan="Luas Persegi adalah : "+Luas+ " dan Keliling Persegi adalah : "+ Keliling;
                Toast.makeText(MainActivity.this, Pesan, Toast.LENGTH_SHORT).show();
            }



        });
    }
}