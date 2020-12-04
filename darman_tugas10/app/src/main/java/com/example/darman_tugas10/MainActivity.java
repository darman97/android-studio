package com.example.darman_tugas10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView Header;
    Button Submit;
    Button Switch;
    private int Indeks=1;
    private int Nilai_Panjang=0;
    private int Nilai_Lebar=0;
    SeekBar S_Panjang;
    SeekBar S_Lebar;
    TextView Text_Panjang;
    TextView Text_Lebar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inisiasi();
        B_Switch();
        B_Submit();
        L_Seekbar();
    }
    private void Inisiasi(){
        Header=findViewById(R.id.imageView);
        Submit=findViewById(R.id.button_submit);
        Switch=findViewById(R.id.button_switch);
        S_Panjang=findViewById(R.id.seekBar_P);
        S_Lebar=findViewById(R.id.seekBar_L);
        Text_Panjang=findViewById(R.id.textView_P);
        Text_Lebar=findViewById(R.id.textView_L);
    }
    private void B_Switch(){
        Switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Indeks==1){
                    Header.setImageResource(R.drawable.background2);
                    Indeks++;
                }else {
                    Header.setImageResource(R.drawable.background1);
                    Indeks--;
                }
            }
        });
    }
    private void B_Submit(){
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int Nilai_Luas=Nilai_Panjang*Nilai_Lebar;
                final int Nilai_Keliling=2*(Nilai_Panjang+Nilai_Lebar);
                AlertDialog.Builder a_builder=new AlertDialog.Builder(MainActivity.this);
                a_builder.setMessage("silahkan pilih menghitung luas atau keliling")
                        .setCancelable(false)
                        .setPositiveButton("Luas", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(MainActivity.this,Luas.class);
                                intent.putExtra(Luas.KUNCI_LUAS,Nilai_Luas);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Keliling", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(MainActivity.this,Keliling.class);
                                intent.putExtra(Keliling.KUNCI_KELL,Nilai_Keliling);
                                startActivity(intent);
                            }
                        });
                AlertDialog alert = a_builder.create();
                alert.setTitle("Konfirmasi");
                alert.show();
            }
        });

    }
    private void L_Seekbar(){
        String Teks_Panjang=String.valueOf(S_Panjang.getProgress());
        Text_Panjang.setText(Teks_Panjang);
        S_Panjang.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Nilai_Panjang=progress;
                Text_Panjang.setText(String.valueOf(Nilai_Panjang));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        String Teks_Lear=String.valueOf(S_Lebar.getProgress());
        Text_Lebar.setText(Teks_Lear);
        S_Lebar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Nilai_Lebar=progress;
                Text_Lebar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}