package com.example.darman_tugas9;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar Rb;
    Button submit;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inisiasi();
        B_Submit();
        B_Exit();
    }
    private void Inisiasi(){
        Rb=findViewById(R.id.ratingBar_l9);
        submit=findViewById(R.id.button_l9a);
        exit=findViewById(R.id.button_l9b);
    }
    private void B_Submit(){
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating=Rb.getRating();
                String kategori="";
                if (rating>=5){
                    kategori="Sangat setuhu";
                }else if(rating>=4){
                    kategori="Setuju";
                }else if(rating>=3){
                    kategori="Kurang setuju";
                }else if(rating>=2){
                    kategori="Tidak setuju";
                }else {
                    kategori="Sangat tidak setuju";
                }
                String pesan="Nilai rating adalah "+rating+" yang artinya saya "+kategori;
                Toast.makeText(MainActivity.this,pesan,Toast.LENGTH_LONG).show();
            }
        });
    }
    private void B_Exit(){
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Konfirm=getResources().getString(R.string.konfirmasi);
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(Konfirm)
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert= builder.create();
                alert.setTitle("Konfirmasi");
                alert.show();
            }
        });
    }
}