package com.luasvolume.luasdanvolume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftarBangunRuang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_bangun_ruang);

        Button btnKubus = (Button)findViewById(R.id.btnKubus);
        Button btnBalok = (Button)findViewById(R.id.btnBalok);
        Button btnPrisma = (Button)findViewById(R.id.btnPrisma);
        Button btnLimas = (Button)findViewById(R.id.btnLimas);
        Button btnTabung = (Button)findViewById(R.id.btnTabung);
        Button btnBola = (Button)findViewById(R.id.btnBola);
        Button btnKerucut = (Button)findViewById(R.id.btnKerucut);

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),VolumeKubus.class);
                startActivity(a);
            }
        });
        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(),VolumeBalok.class);
                startActivity(b);
            }
        });
        btnPrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(),VolumePrismaSegitiga.class);
                startActivity(c);
            }
        });
        btnLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getApplicationContext(),VolumeLimasSegitiga.class);
                startActivity(d);
            }
        });
        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(getApplicationContext(),VolumeTabung.class);
                startActivity(e);
            }
        });
        btnBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(getApplicationContext(),VolumeBola.class);
                startActivity(f);
            }
        });
        btnKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(getApplicationContext(),VolumeKerucut.class);
                startActivity(g);
            }
        });
    }
}
