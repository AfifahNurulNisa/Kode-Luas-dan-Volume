package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasTrapesium extends AppCompatActivity {
    EditText sisiA, sisiB, tinggi;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        final EditText sisiA = (EditText)findViewById(R.id.etSisiA);
        final EditText sisiB = (EditText)findViewById(R.id.etSisiB);
        final EditText tinggi = (EditText)findViewById(R.id.etTinggiT);
        final Button hitung = (Button)findViewById(R.id.btnHitung);
        final TextView hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sisiA.length()==0&&sisiB.length()==0&&tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (sisiA.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Sisi Atas!!!",Toast.LENGTH_LONG).show();
                }
                else if (sisiB.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Sisi Bawah!!!",Toast.LENGTH_LONG).show();
                }
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Tinggi!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String sisiAtas = sisiA.getText().toString();
                    String sisiBawah = sisiB.getText().toString();
                    String isitinggi = tinggi.getText().toString();
                    double sisiA = Double.parseDouble(sisiAtas);
                    double sisiB = Double.parseDouble(sisiBawah);
                    double tinggi = Double.parseDouble(isitinggi);
                    double hs = hasil(sisiA, sisiB, tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double sisiA, double sisiB, double tinggi){return (sisiA+sisiB)*tinggi/2;}
}
