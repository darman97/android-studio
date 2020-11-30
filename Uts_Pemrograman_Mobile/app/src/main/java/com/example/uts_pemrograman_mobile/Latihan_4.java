package com.example.uts_pemrograman_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Latihan_4 extends AppCompatActivity {

    Button button;
    EditText PlanText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_4);
        Inisial();
        Submit();
    }
    private void Inisial(){
        button=findViewById(R.id.button4);
        PlanText=findViewById(R.id.teks);

    }
    private  void Submit(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Pesan = PlanText.getText().toString();
                Toast.makeText(Latihan_4.this, Pesan, Toast.LENGTH_SHORT).show();


            }
        });


    }
}