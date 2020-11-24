package com.example.darman_tugas8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    CheckBox CB1;
    CheckBox CB2;
    CheckBox CB3;
    RadioGroup RG_Makanan;
    RadioButton RB_Makanan;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inisiasi();
        Submit();
    }
    private  void Inisiasi(){
        CB1 =findViewById(R.id.Cb1);
        CB2 =findViewById(R.id.Cb2);
        CB3 =findViewById(R.id.Cb3);
        RG_Makanan =findViewById(R.id.radioGroup);
        submit =findViewById(R.id.button);
    }
    private  void Submit(){
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String band="";
                if (CB1.isChecked()){
                    band=getString(R.string.cb1);
                }
                if (CB2.isChecked()){
                    if (CB1.isChecked()){
                        band=band+", "+getString(R.string.cb2);
                    }else {
                        band=getString(R.string.cb2);
                    }
                }
                if (CB3.isChecked()){
                    if (CB1.isChecked()||CB2.isChecked()){
                        band=band+", "+getString(R.string.cb3);
                    }else {
                        band=getString(R.string.cb3);
                    }
                }
                if (band.equals("")){
                    band="Tidak ada";
                }
                int no_ID=RG_Makanan.getCheckedRadioButtonId();
                String makanan="";
                if (no_ID>0){
                    RB_Makanan=findViewById(no_ID);
                    makanan=RB_Makanan.getText().toString();
                }else {
                    makanan= "Anda tidak memilih makanan";
                }
                String pesan="Band Favorite anda adalah "+band+"\n"+ "Makanan favorite anda adalah "+makanan;
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setPositiveButton("Ok",null);
                builder.setTitle("Informasi");
                builder.setMessage(pesan);
                AlertDialog alert=builder.create();
                alert.show();

            }
        });
    }
}