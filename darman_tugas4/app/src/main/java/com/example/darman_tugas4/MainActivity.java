package com.example.darman_tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText PlanText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Submit();
    }
    private void Inisial(){
        button=findViewById(R.id.button);
        PlanText=findViewById(R.id.PlanText);

    }
    private  void Submit(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Pesan = PlanText.getText().toString();
                Toast.makeText(MainActivity.this, Pesan, Toast.LENGTH_SHORT).show();


            }
        });


    }
}