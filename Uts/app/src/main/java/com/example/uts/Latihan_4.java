package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Latihan_4 extends AppCompatActivity {
    Button L4;
    EditText PlanText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_4);
        Inisial();
        Submit();
    }
    private void Inisial(){
        L4=findViewById(R.id.button_l4);
        PlanText=findViewById(R.id.PlanText);

    }
    private  void Submit(){
        L4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Pesan = PlanText.getText().toString();
                Toast.makeText(Latihan_4.this, Pesan, Toast.LENGTH_SHORT).show();


            }
        });


    }
}