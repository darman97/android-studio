package com.example.tes_bismilah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {
    TextView TV_Welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Inisial();
        Set_Object();
    }

    private void Inisial() {
        TV_Welcome = findViewById(R.id.textView_User_Welcome);
    }

    private void Set_Object() {
        Intent intent = getIntent();
        String Username = intent.getStringExtra(MainActivity.EXTRA_NAMA);
        TV_Welcome.setText(getString(R.string.textView_User_Welcome) + " " + Username);
    }

}