package com.luasvolume.luasdanvolume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftarBangunDatar extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_daftar_bangun_datar);

        Button btnPersegi = (Button)findViewById(R.id.btnPersegi);
        Button btnPersegipjg = (Button)findViewById(R.id.btnPersegipjg);
        Button btnSegitiga = (Button)findViewById(R.id.btnSegitiga);
        Button btnLingkaran = (Button)findViewById(R.id.btnLingkaran);
        Button btnJajarGenjang = (Button)findViewById(R.id.btnJajargenjang);
        Button btnTrapesium = (Button)findViewById(R.id.btnTrapesium);
        Button btnLayang = (Button)findViewById(R.id.btnLayang);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),LuasPersegi.class);
                startActivity(a);
            }
        });
        btnPersegipjg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent (getApplicationContext(),LuasPersegiPanjang.class);
                startActivity(b);
            }
        });
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(),LuasSegitiga.class);
                startActivity(c);
            }
        });
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getApplicationContext(),LuasLingkaran.class);
                startActivity(d);
            }
        });
        btnJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(getApplicationContext(),LuasJajarGenjang.class);
                startActivity(e);
            }
        });
        btnTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(getApplicationContext(),LuasTrapesium.class);
                startActivity(f);
            }
        });
        btnLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(getApplicationContext(),LuasLayangLayang.class);
                startActivity(g);
            }
        });
        }
    }
