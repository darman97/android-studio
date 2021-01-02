package com.example.darman_tugas13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView IV_Pic;
    TextView TV_Desc;
    TextView TV_Rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Inisial();
        Set_Object();
    }

    private void Inisial() {
        IV_Pic = findViewById(R.id.imageView_Detail_Pic);
        TV_Desc = findViewById(R.id.textView_Detail_Desc);
        TV_Rating = findViewById(R.id.textView_Detail_Rating);
    }

    private void Set_Object() {
        Intent intent = getIntent();
        String Judul = intent.getStringExtra("judul");
        String Rating = intent.getStringExtra("rating");
        TV_Rating.setText("Rating: " + Rating);
        if(Judul.equals("THE SOCIAL NETWORK")) {
            IV_Pic.setImageResource(R.drawable.img_1);
            TV_Desc.setText(R.string.sinopsis1);
        }else if (Judul.equals("THE IMITATION GAME")){
            IV_Pic.setImageResource(R.drawable.img_2);
            TV_Desc.setText(R.string.sinopsis2);
        }else if (Judul.equals("WHO AM I")){
            IV_Pic.setImageResource(R.drawable.img_3);
            TV_Desc.setText(R.string.sinopsis3);
        }else if (Judul.equals("Black Hat (2015)")){
            IV_Pic.setImageResource(R.drawable.img_4);
            TV_Desc.setText(R.string.sinopsis4);
        }else {
            IV_Pic.setImageResource(R.drawable.img_5);
            TV_Desc.setText(R.string.sinopsis5);
        }
    }

}
