package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasSegitiga extends AppCompatActivity {
    EditText alas, tinggi;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        final EditText alas = (EditText)findViewById(R.id.etAlas);
        final EditText tinggi = (EditText)findViewById(R.id.etTinggi);
        Button hitung = (Button)findViewById(R.id.btnHitung);
        final TextView hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alas.length()==0&&tinggi.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Alas dan Tinggi!!",Toast.LENGTH_LONG).show();
                }
                else if (alas.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Alas!!",Toast.LENGTH_LONG).show();
                }
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Masukkan Tinggi!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String isialas = alas.getText().toString();
                    String isitinggi = tinggi.getText().toString();
                    double alas = Double.parseDouble(isialas);
                    double tinggi = Double.parseDouble(isitinggi);
                    double hs = hasil(alas, tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double alas, double tinggi){return alas*tinggi/2;}
}
