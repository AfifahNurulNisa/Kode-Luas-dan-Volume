package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasJajarGenjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_jajar_genjang);

        final EditText alas = (EditText)findViewById(R.id.etAlasJ);
        final EditText tinggi = (EditText)findViewById(R.id.etTinggiJ);
        Button hitung = (Button)findViewById(R.id.btnHitung);
        final TextView hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alas.length()==0&&tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (alas.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Alas!!!",Toast.LENGTH_LONG).show();
                }
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Tinggi!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String isialasJ = alas.getText().toString();
                    String isitinggiJ = tinggi.getText().toString();
                    double alas = Double.parseDouble(isialasJ);
                    double tinggi = Double.parseDouble(isitinggiJ);
                    double hs = hasil(alas, tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double alas, double tinggi){return alas*tinggi;}
}
