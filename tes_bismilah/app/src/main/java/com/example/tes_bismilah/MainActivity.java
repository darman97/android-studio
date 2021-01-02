package com.example.tes_bismilah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView ACT_Username;
    EditText E_Password;
    private String[] List_Username = {"admin","agus","akmal","almaira","amanda","anindiva"};
    Button B_Login;
    private int Percobaan_Login = 3;
    public static String EXTRA_NAMA = "extra_nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Set_Objeck();
        Listen_B_Login();
    }

    private void Inisial() {
        ACT_Username = findViewById(R.id.autoCompleteTextView_Main_Username);
        E_Password = findViewById(R.id.editText_Main_Password);
        B_Login = findViewById(R.id.button_Main_Login);
    }

    private void Set_Objeck() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.select_dialog_item,List_Username);
        ACT_Username.setAdapter(arrayAdapter);
        ACT_Username.setThreshold(1);
    }

    private void Listen_B_Login() {
        B_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = ACT_Username.getText().toString().trim();
                String Password = E_Password.getText().toString().trim();
                if (Percobaan_Login <= 0){
                    Muncul_Pesan(getString(R.string.msgbox_Lock));
                    return;
                }
                if(TextUtils.isEmpty(Username)) {
                    Muncul_Pesan(getString(R.string.msgbox_Username_Empty));
                    return;
                }
                if(TextUtils.isEmpty(Password)) {
                    Muncul_Pesan(getString(R.string.msgbox_Password_Empty));
                    return;
                }
                if (Username.equals("almairaa") && Password.equals("almaira123")){
                    Toast.makeText(MainActivity.this, getString(R.string.msgbox_Login_Sukses), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,UserActivity.class);
                    intent.putExtra(EXTRA_NAMA,Username);
                    startActivity(intent);
                } else {
                    Muncul_Pesan(getString(R.string.msgbox_Login_Gagal));
                    Percobaan_Login--;
                    Bersih();
                }
            }
        });
    }

    private void Muncul_Pesan(String Pesan) {
        android.app.AlertDialog.Builder A_Builder = new android.app.AlertDialog.Builder(MainActivity.this);
        A_Builder.setPositiveButton("OK",null);
        A_Builder.setTitle(getString(R.string.title_Info));
        A_Builder.setMessage(Pesan);
        AlertDialog Alert = A_Builder.create();
        Alert.show();
    }

    private void Bersih() {
        ACT_Username.setText("");
        E_Password.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_language) {
            Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mIntent);
        }
        return super.onOptionsItemSelected(item);
    }

}