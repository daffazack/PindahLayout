package com.example.newlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private Button tambaha,bagia,kalia,kuranga;
    private TextView tvHasil;
    private EditText angka,angkaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tambaha = findViewById(R.id.tambah);
        bagia = findViewById(R.id.bagi);
        kalia = findViewById(R.id.kali);
        kuranga = findViewById(R.id.kurang);
        tvHasil = findViewById(R.id.tv_hasil);
        angka = findViewById(R.id.eangka);
        angkaa = findViewById(R.id.eangkaa);


        tambaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    String sangka = angka.getText().toString();
                    String sangkaa = angkaa.getText().toString();
                    double a = Double.parseDouble(sangka);
                    double b = Double.parseDouble(sangkaa);

                    double hasil = a+b;
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);

                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bagia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sangka = angka.getText().toString();
                    String sangkaa = angkaa.getText().toString();
                    double a = Double.parseDouble(sangka);
                    double b = Double.parseDouble(sangkaa);

                    double hasil = a/b;
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);

                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        kalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sangka = angka.getText().toString();
                    String sangkaa = angkaa.getText().toString();
                    double a = Double.parseDouble(sangka);
                    double b = Double.parseDouble(sangkaa);

                    double hasil = a*b;
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);

                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        kuranga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sangka = angka.getText().toString();
                    String sangkaa = angkaa.getText().toString();
                    double a = Double.parseDouble(sangka);
                    double b = Double.parseDouble(sangkaa);

                    double hasil = a-b;
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);

                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

