package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeLimasSegitiga extends AppCompatActivity {
    EditText alas, tinggi, tinggiL;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_limas_segitiga);

        alas = (EditText) findViewById(R.id.etALimas);
        tinggi = (EditText) findViewById(R.id.etTSLimas);
        tinggiL = (EditText) findViewById(R.id.etTLimas);
        hitung = (Button) findViewById(R.id.btnHitung);
        hasil = (TextView) findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alas.length() == 0 && tinggi.length() == 0 && tinggiL.length() == 0) {
                    Toast.makeText(getApplication(), "Tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else if (alas.length() == 0) {
                    Toast.makeText(getApplication(), "Alas segitiga tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else if (tinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi segitiga tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else if (tinggiL.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi limas tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else {
                    String alasS = alas.getText().toString();
                    String tinggiSL = tinggi.getText().toString();
                    String tinggiLm = tinggiL.getText().toString();
                    double alas = Double.parseDouble(alasS);
                    double tinggi = Double.parseDouble(tinggiSL);
                    double tinggiL = Double.parseDouble(tinggiLm);
                    double hs = hasil(alas, tinggi, tinggiL);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }

        });
    }
    public double
    hasil(double alas, double tinggi, double tinggiL) {
        return alas * tinggi / 2 * tinggiL*1/3;}
}
