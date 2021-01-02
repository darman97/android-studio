package com.example.darman_tugas10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Inisial();
        Set_Object();
    }

    private void Inisial() {
        Welcome = findViewById(R.id.welcome);
    }

    private void Set_Object() {
        Intent intent = getIntent();
        String Username = intent.getStringExtra(MainActivity.EXTRA_NAMA);
        Welcome.setText(getString(R.string.textView_User_Welcome) + " " + Username);
    }

}